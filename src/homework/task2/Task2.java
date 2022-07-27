package homework.task2;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Task2 {
    public static void main(String[] args) {
        GameProgress gameProgress1 = new GameProgress(90, 10, 2, 21.5);
        GameProgress gameProgress2 = new GameProgress(65, 14, 8, 58.4);
        GameProgress gameProgress3 = new GameProgress(15, 2, 15, 102.9);

        saveGame(gameProgress1, "save1");
        saveGame(gameProgress2, "save2");
        saveGame(gameProgress3, "save3");

        zipFiles("E:/JavaHome/savegames/", "save1");


    }

    private static void zipFiles(String zipWay, String saveFile) {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipWay + "zip.zip"));
             FileInputStream fis = new FileInputStream(zipWay+saveFile+".data")) {

            ZipEntry entry = new ZipEntry(saveFile);
            zos.putNextEntry(entry);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zos.write(buffer);
            zos.closeEntry();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void saveGame(GameProgress gameProgress1, String saveDate) {
        try (FileOutputStream fos = new FileOutputStream("E:/JavaHome/savegames/" + saveDate + ".data");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(gameProgress1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
