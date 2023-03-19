package org.example.lectures.l2;

import java.io.File;
import java.io.FileWriter;

// Работа с файловой системой

public class Pro2 {
//    public static void main(String[] args) {
//        /**
//         * File <имя> = new File (<полный путь к файлу>);
//         * File f1 = new File("file.txt");
//         * File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
//         */
//        String pathProject = System.getProperty("user.dir");
//        String pathFile = pathProject.concat("/file.txt");
//        File f3 = new File(pathFile);
//        System.out.println(f3.getAbsolutePath());
//        // /Users/sk/vscode/java_projects/file.txt
//        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
//    }
    /**
     * Работа с файломи - Ошибки
     */
//    try {
//        Код, в котором может появиться ошибоа
//    } catch (Exception e) {
//        Обработка, если ошибка случилась
//    }
//    finally {
//        Код, который выполниться в любом случае
////    }
//    public static void main(String[] args) {
//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File f3 = new File(pathFile);
//            if (f3.createNewFile()){ // существует ли файл
//                System.out.println("file.created");
//            }
//            else {
//                System.out.println("file.existed");
//            }
////            System.out.println("try");
//            }
//        catch (Exception e){
//            System.out.println("catch"); }
//        finally {
//            System.out.println("finally"); // всегда выполняется
//        }
//    }
//    public static void main(String[] args) {
//        String pathProject = System.getProperty("user.dir");
//        String pathDir = pathProject.concat("/file");
//        File dir = new File(pathDir);
//        System.out.println(dir.getAbsolutePath());
//        if (dir.mkdir()){
//            System.out.println("+");
//        }
//        else{
//            System.out.println("-");
//        }
//    for (String fname : dir.list()){
//        System.out.println(fname);
//    }
//    }
//    String line = "empty";
//        try {
//        String pathProject = System.getProperty("user.dir");
//        String pathFile = pathProject.concat("/file.txt");
//        File file = new File(pathFile);
//
//        if (file.createNewFile()) {
//            System.out.println("file.created");
//        }
//        else {
//            System.out.println("file.existed");
//            FileWriter fileWriter = new FileWriter(file, true);
//            fileWriter.write("new line");
//
//            //#region lineSeparator
//            // A string containing "\r\n" for non-Unix
//            // platforms, or a string containing
//            // "\n" for Unix platforms.
//            fileWriter.append(System.lineSeparator());
//            //#endregion
//
//            fileWriter.write("new line");
//            fileWriter.append("new line");
//            fileWriter.flush();
//            fileWriter.close();
//            // BufferedReader bufReader = new BufferedReader(new FileReader(file));
//            // line = bufReader.readLine();
//            // bufReader.close();
//        }
//    } catch (Exception e) {
//        //e.printStackTrace();
//    } finally {
//        System.out.println(line);
//    }
}
/**
 * Работа с файловой системой
 * isHidden() - возвращает истину, если каталог или файл является скрытым
 * length() - возвращает размер файла в байтах
 * lastModified() - возвращает время последнего изменения файла или каталога
 * list() - возвращает массив файлов и подкатологов, которые находятся в катологе
 * listFile() - возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
 * mkdir() - создает новый каталог
 * renameTo(File dest) - переименовывает файл или каталог
  */
