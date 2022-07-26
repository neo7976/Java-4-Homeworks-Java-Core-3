package lesson;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class WriteAndReader {
    public static void main(String[] args) {

//        String text = "Привет мой славный мир";
//        try (FileWriter writer = new FileWriter("notes.txt", false)) {
//
//            // запись всей строки
//            writer.write(text);
//
//            // запись по символам
//            writer.append('!');
//            writer.append('\n');
//
//            writer.flush(); // дозаписываем и очищаем буфер
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try (FileReader reader = new FileReader("notes.txt")) {
//            int c;
//            while ((c = reader.read()) != -1) {
//                System.out.print((char) c);
//            }
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // TODO: 26.07.2022 Можно задавать кодировку при желании для созданных файлов
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes.txt", StandardCharsets.UTF_16))) {
            String text = "Hello me deer world";
            bw.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



        try (BufferedReader br = new BufferedReader(new FileReader("notes.txt", StandardCharsets.UTF_16))) {

        //чтение построчно
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }




    }
}
