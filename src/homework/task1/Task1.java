package homework.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {


        File games = new File("src/homework/task1/Games");
        folderCreation(games);

        //1
        File srcGames = new File(games, "src");
        folderCreation(srcGames);
        File resGames = new File(games, "res");
        folderCreation(resGames);
        File saveGames = new File(games, "savegames");
        folderCreation(saveGames);
        File tempGames = new File(games, "temp");
        folderCreation(tempGames);

        //2
        File mainSrc = new File(srcGames, "main");
        folderCreation(mainSrc);
        File testSrc = new File(srcGames, "test");
        folderCreation(testSrc);

        //3
        File mainJava = new File(mainSrc, "Main.java");
        fileCreation(mainJava);

        File utilsJava = new File(mainSrc, "Utils.java");
        fileCreation(utilsJava);

        //4
        File drawables = new File(resGames, "drawables");
        folderCreation(drawables);
        File vector = new File(resGames, "vector");
        folderCreation(vector);
        File icons = new File(resGames, "icons");
        folderCreation(icons);

        //5
        File temp = new File(tempGames, "temp.txt");
        fileCreation(temp);

        try (FileWriter writer = new FileWriter(temp, false)) {
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileCreation(File mainJava) {
        try {
            if (mainJava.createNewFile())
                sb.append(mainJava).append(" - Файл успешно создан\n");
            else if (mainJava.isFile())
                sb.append(mainJava).append("- Файл уже существует\n");
            else
                sb.append(mainJava).append(" - Файл не был создан\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void folderCreation(File games) {
        if (games.mkdir())
            sb.append(games).append(" - Папка успешно создана\n");
        else if (games.isDirectory())
            sb.append(games).append(" - Папка уже существует\n");
        else
            sb.append(games).append(" - Папка не была создана\n");
    }
}
