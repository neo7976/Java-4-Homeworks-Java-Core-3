package lesson;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Zip Архивы
 */

public class ZipTest {
    public static void main(String[] args) {
        File file = new File("src/lesson");

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("src/lesson/zip/zip_output.zip"));
             FileInputStream fis = new FileInputStream("src/lesson/notes.txt")) {
            ZipEntry entry = new ZipEntry("packed_notex.txt");
            zout.putNextEntry(entry);
            // считываем содержимое файла в массив byte
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);

            // добавляем содержимое к архиву
            zout.write(buffer);

            // закрываем текущую запись для новой записи
            zout.closeEntry();


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try (ZipInputStream zin = new ZipInputStream(new FileInputStream("src/lesson/zip/zip_output.zip"))) {
            ZipEntry entry;
            String name;
            while ((entry = zin.getNextEntry()) != null) {
                name = entry.getName(); // получим название файла
                // распаковка
                FileOutputStream fout = new FileOutputStream("src/lesson/zip/" + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
