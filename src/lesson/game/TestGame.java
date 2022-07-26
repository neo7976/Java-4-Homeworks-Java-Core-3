package lesson.game;

import java.io.*;

public class TestGame {

    public static void main(String[] args) {

//        GameProgress gameProgress =
//                new GameProgress(94, 10, 2, 254.32);
//
//        // откроем выходной поток для записи в файл
//        try (FileOutputStream fos = new FileOutputStream("src/lesson/game/save.dat");
//             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//            // запишем экземпляр класса в файл
//            oos.writeObject(gameProgress);
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


        GameProgress gameProgress = null;
        // откроем входной поток для чтения файла
        try (FileInputStream fis = new FileInputStream("src/lesson/game/save.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
        // десериализуем объект и скастим его в класс
            gameProgress = (GameProgress) ois.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(gameProgress);


    }
}
