package lesson;

import java.io.File;
import java.io.IOException;

public class Mainlesson {
    public static void main(String[] args) {

        // определяем объект для каталога
        File dir = new File("SomeDir");
// пробуем создать каталог
        if (dir.mkdir())
            System.out.println("Каталог создан");
//
//
//// определяем новый объект для каталога
//        File newDir = new File("NewDir");
//// пробуем переименовать каталог
//        dir.renameTo(newDir);
//
//        // пробуем удалить каталог
//        if (newDir.delete())
//            System.out.println("Каталог удален");

//
//        // определяем объект для каталога
////        File dir = new File("SomeDir");
//// если объект представляет каталог
//        if (dir.isDirectory()) {
//// получаем все вложенные объекты в каталоге
//            for (File item : dir.listFiles()) {
//// проверим, является ли объект каталогом
//                if (item.isDirectory()) {
//                    System.out.println(item.getName() + " - каталог");
//                } else {
//                    System.out.println(item.getName() + " - файл");
//                }
//            }
//        }



//        // определяем объект для файла
//        File myFile = new File("SomeDir/notes.txt");
//// создадим новый файл
//        try {
//            if (myFile.createNewFile())
//                System.out.println("Файл был создан");
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//
//


//        System.out.println("Имя файла: " + myFile.getName());
//        System.out.println("Родительский каталог: " + myFile.getParent());
//        System.out.println("Размер файла: " + myFile.length());
//        if (myFile.exists())
//            System.out.println("Файл существует");
//        else
//            System.out.println("Файл не был найден");
//        if (myFile.canRead())
//            System.out.println("Файл может быть прочитан");
//        else
//            System.out.println("Файл не может быть прочитан");
//        if (myFile.canWrite())
//            System.out.println("Файл может быть записан");
//        else
//            System.out.println("Файл не может быть записан");







    }
}
