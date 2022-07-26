package lesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputAndInput {
    public static void main(String[] args) {

//        String text = "Hello world!";
//// откроем байтовый поток записи в файл
//        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {
//// перевод строки в массив байтов
//            byte[] bytes = text.getBytes();
//// запись байтов в файл
//            fos.write(bytes, 0, bytes.length);
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }


//        // откроем байтовый поток для чтения файла
//        try (FileInputStream fin = new FileInputStream("notes.txt")) {
//            int i;
//// считываем файл пока есть доступные байты
//            while ((i = fin.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (IOException ex) {
//        System.out.println(ex.getMessage());
//    }


//        try (FileInputStream fin = new FileInputStream("notes.txt");
//             FileOutputStream fon = new FileOutputStream("new_notes.txt")) {
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



        //        String text = "Hello world";
//        byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
//
//        // создаем входной байтовый поток
//        // и передаем его в входной буферизированный поток
//        try (ByteArrayInputStream in = new ByteArrayInputStream(buffer);
//             BufferedInputStream bis = new BufferedInputStream(in)) {
//            int c;
//            while ((c = bis.read()) != -1) {
//                System.out.print((char) c);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



//        String text = "Привет, мир!";
//        byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
//
//        // создаем выходной байтовый поток
//        // и передаем его в выходной буферизированный поток
//        try (FileOutputStream out = new FileOutputStream("notes.txt");
//             BufferedOutputStream bos = new BufferedOutputStream(out)) {
//            bos.write(buffer, 0, buffer.length);
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }


    }
}
