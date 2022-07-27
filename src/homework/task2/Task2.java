package homework.task2;

import java.io.*;
import java.security.cert.Extension;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Task2 {
    private static final String EXTENSION = ".data";

    public static void main(String[] args) throws IOException {
        File gameDirectory = new File("E:/JavaHome/savegames/");
        GameProgress gameProgress1 = new GameProgress(90, 10, 2, 21.5);
        GameProgress gameProgress2 = new GameProgress(65, 14, 8, 58.4);
        GameProgress gameProgress3 = new GameProgress(15, 2, 15, 102.9);

        saveGame(gameProgress1, "save1.data");
        saveGame(gameProgress2, "save2.data");
        saveGame(gameProgress3, "save3.data");

        zipFiles("E:/JavaHome/savegames/", "save1.data", "save2.data", "save3.data");

        if (gameDirectory.isDirectory()) {
            for (File file : gameDirectory.listFiles()) {
                if (file.getName().contains(EXTENSION)) {
                    if (file.delete())
                        System.out.println(file + " - удален!");
                    else
                        System.out.println(file + " - удалить не получилось! ");
                }
            }
        }
    }

    private static void zipFiles(String zipWay, String... savesFile) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipWay + "zip.zip"));
        for (String saveFile : savesFile) {
            FileInputStream fis = new FileInputStream(zipWay + saveFile);
            ZipEntry entry = new ZipEntry(saveFile);
            zos.putNextEntry(entry);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zos.write(buffer);
            zos.closeEntry();
            fis.close();
        }
        zos.close();
    }

    private static void saveGame(GameProgress gameProgress1, String saveDate) {
        try (FileOutputStream fos = new FileOutputStream("E:/JavaHome/savegames/" + saveDate);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(gameProgress1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

