package org.example.seminars.s4;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Учитывая строковый путь, который является абсолютным путем (начинающимся с косой черты «/»)
 * к файлу или каталогу в файловой системе в стиле Unix, преобразуйте его в упрощенный канонический путь.
 *
 * В файловой системе в стиле Unix точка '.' относится к текущему каталогу, двойная точка «..»
 * относится к каталогу на более высокий уровень, а любые несколько последовательных косых черт
 * (например, «//») рассматриваются как одиночная косая черта «/».
 * Для этой проблемы любые другие форматы точек, такие как '...', рассматриваются как имена файлов/каталогов.
 *
 * Канонический путь должен иметь следующий формат:
 *
 * Путь начинается с косой черты «/».
 * Любые два каталога разделяются косой чертой '/'.
 * Путь не заканчивается завершающим символом '/'.
 * Путь содержит только каталоги на пути от корневого каталога до целевого файла или
 * каталога (т. е. без точки «.» или двойной точки «..»)
 * Вернуть упрощенный канонический путь.
 *
 * Input: path = "/home/"
 * Output: "/home"
 * Explanation: Note that there is no trailing slash after the last directory name.
 */
public class Pro4 {
    public static void main(String[] args) {
        String text1 = "/home/";
        String text2 = "/../";
        String text3 = "home//foo/";

        System.out.println("1 = " + simpLifePath(text1));
        System.out.println("2 = " + simpLifePath(text2));
        System.out.println("2 = " + simpLifePath(text3));
    }

    private static String simpLifePath(String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("/");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("") || arr[i].equals(".")) continue;
            else if (arr[i].equals("..")){
                if(!list.isEmpty()) list.removeLast();
            } else list.add(arr[i]);

        }return "/" + String.join("/", list);
    }
}
