package homework.task3;

import homework.task1.Task1;
import homework.task2.Task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Task3 {


    public static void main(String[] args) {

        openZip(Task2.P);

    }

    public static void openZip(String zipWay) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(zipWay + ".zis"));
        ZipEntry entry;
        String name;

        while ((entry = zis.getNextEntry()) != null) {
            name = entry.getName();
            FileOutputStream fos = new FileOutputStream(zipWay + name);
            for (int c = zis.read(); c != -1; c = zis.read()) {
                fos.write(c);
            }
            fos.flush();
            zis.closeEntry();
            fos.close();
        }
        zis.closeEntry();


    }
}
