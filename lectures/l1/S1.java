package org.example.lectures.l1;

// /**
//  * program
//  */
// // class
// // main
// //sysout
public class S1 {

    public static void main(String[] args) {

        System.out.println("Привет мир");
        // Типы данных и переменные
        String s = "ghbdtn"; // строки
        String s1 = null;

        short age = 10; // целочисленные
        int salary = 12345;

        float e = 2.7f; // вещественные
        double pi = 3.1415;

        System.out.println(s);
        System.out.println(s1);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(e);
        System.out.println(pi);}}

//         char ch = '1';
//         System.out.println(Character.isDigit(ch)); //true
//         ch = 'a';
//         System.out.println(Character.isDigit(ch)); //false

//         boolean flag1 = 123 <= 234; // буливый тип и логические
//         System.out.println(flag1); //true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2); //true
//         boolean flag3 = flag1 ^ flag2;
//         System.out.println(flag3); // false

//         var a = 123; //неявная типизация
//         System.out.println(a);
//         var d = 123.456;
//         System.out.println(d);
//         System.out.println(getType(a)); // выдает ошибку гетТайп если не прописать ниже часть кода
//         System.out.println(getType(d));

//         int i = 23_123_345; // _ можно подчеркнуть какой число используем на данный момент 23 миллиона...
//         System.out.println(i);
//         System.out.println(Integer.MAX_VALUE); // используем клас обертка для более точной работы с интеджер, на данный момент смотрим максимальное значение в интеджер

//         String str = "qwwerty";
//         int a2 = str.length(); // длина строки
//         System.out.println(a2);
//         System.out.println(str.charAt(1)); // обращение по индексу в страке

//         int a3 = 123;
//         System.out.println(++a3 + a3++); // 248
//         System.out.println(--a3 - a3--); // 0
//         System.out.println(--a3 + a3--); //124

//         int a4 = 5;
//         int b4 = 2;
//         System.out.println(a4 | b4); // а4 или b4
//         // a4 101
//         // b4 010
//         //   111 ровняется 7

//         String s2 = "qweasd";
//         boolean b = s2.length() >= 5 && s2.charAt(4) == '1'; // &&- быстрая и.  Если первое условие не верно то она не продолжен дальше проверку
//         boolean b1 = s2.length() >= 5 & s2.charAt(4) == '1'; // & - проверит оба условия
//         System.out.println(b);
//         System.out.println(b1);

//         //одномерный массивы
//         int[] arr = new int[10];
//         // int brr[] = new int[10]; //можно записать и так
//         System.out.println(arr.length); //10
//         arr = new int[] {1, 2, 3, 4, 5};
//         System.out.println(arr.length); //5
//         arr[3] = 13;
//         System.out.println(arr[3]); // обращение по индексу

//         // многомерные массивы
//         int[] arr2[] = new int[3][5];
//         for (int[] line : arr2){
//             for (int item : line){
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//         System.out.println();
//         int [][] arr2_2 = new int [3][5];
//         for (int ii = 0; ii < arr2_2.length; ii++){
//             for (int jj = 0; jj < arr2_2[ii].length; jj++){
//                 System.out.printf("%d ", arr2_2[ii][jj]);
//             }
//             System.out.println();
//         }
//         //преоброзование тип данных
//         double aaaa = 3.125;
//         int iiii = (int)aaaa;
//         System.out.println(aaaa);
//         System.out.println(iiii);


//     }
//     static String getType(Object o){ // относится к верху кода к гетТайп
//         return o.getClass().getSimpleName();
//     }
// }
// //Ввод данный (надо рабозбраться )
// import java.util.Scanner; // относится к вводу
// public class program {
//     public static void main(String[] args) {
//         // Scanner iScanner = new Scanner(System.in); //строки
//         // System.out.printf("name: ");
//         // String name = iScanner.nextLine();
//         // System.out.printf("Привет, %s!", name);
//         // iScanner.close();

//         // Scanner iScanner = new Scanner(System.in); //данные
//         // System.out.printf("Введите число x: ");
//         // int x = iScanner.nextInt();
//         // System.out.printf("Введите число y: ");
//         // double y = iScanner.nextDouble();
//         // System.out.printf("%d + %f = %f", x, y, x + y);
//         // iScanner.close();

//         Scanner iScanner = new Scanner(System.in); //проверка ввода данных
//         System.out.printf("Введите число : ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int cheslo = iScanner.nextInt();
//         System.out.println(cheslo);
//         iScanner.close();

//     }
// }
/**
 * program
 //  */
// public class program {

//     public static void main(String[] args) {
//         // форматирование вывода
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);

//         String s2 = "qwe"; // Сколько строк используется. 1стр.  Контьюнизация
//         int a2 = 123;
//         String q2 = s2 + a2; // q2 (четвертая) s2(вторая) a2(третья)
//         System.out.println(q2); //всего 4 строки

//         int a3 = 1, b3 = 2;
//         int c3 = a3 + b3;
//         String res3 = String.format("%d + %d = %d \n", a3, b3, c3);
//         System.out.printf("%d + %d = %d \n", a3, b3, c3);
//         System.out.println(res3);

//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi);     //3,141500
//         System.out.printf("%.2f\n", pi);   //3,14
//         System.out.printf("%.3f\n", pi);   //3,141
//         System.out.printf("%e\n", pi);     //3,14150e+00
//         System.out.printf("%.2e\n", pi);   //3,14e+00
//         System.out.printf("%.3e\n", pi);   //3,141e+00

//     }
// }

// область видимости переменых
/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         // int a = 123; // если переменна будет выше и шиже в скобках, то будет ошибка
//         int b = 111;
//         {
//             int a = 321; // что определенно в скобках не будет видно за скобками
//             System.out.println(a);
//             System.out.println(a + b);
//         }
//         int a = 123; // если ниже будет одна и таже переменая и выше в скобках, то все будет работать
//         System.out.println(a);

//     }
// }
/**
 * program
 */

// Функции
// public class program {


//         static void sayHi(){ // void не возвращает
//             System.out.println("HI");
//         }
//         static int sum(int a, int b){
//             return a + b;
//         }
//         static double factor(int n){ //рекурсия факториала
//             if(n == 1) return 1;
//             return n * factor(n - 1);
//         }
//     public static void main(String[] args) { //тело
//         sayHi();                                //HI
//         System.out.println(sum(1, 3));     // 4
//         System.out.println(factor(5));       // 120
//         System.out.println();
//         System.out.println(prog1.test(10, 20));
//     }
// }
// Оператор выбора
/**
 * program
 */
// import java.util.Scanner; // почитать по подробней
// public class program {

//     public static void main(String[] args) {
//         int mounth = value;
//         String text = "";
//         switch (mounth){
//             case 1:
//                 text = "Autumn";
//                 break;
//             default:
//             text = "mistake";
//             break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }
// Циклы.
/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;
//         while (value != 0){ // обычный while
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);

//         System.out.println();

//         do { // do while
//             value /= 10;
//             count++;
//         } while (value != 0);

//         for (int i = 0; i < 10; i++) {
//             if (i % 2 == 0){
//                 continue; // если выполняется условие выше с континиумом возвращаемся к фор
//             }
//             System.out.println(i);// 1 3 5 7 9

//         System.out.println();

//         int [] arr = new int[] {1, 2, 3, 4, 8, 10}; // отсылка к облости видимости. это не работа напрямую с элементами массива
//         for (int item : arr){
//             System.out.println(item);
//         }
//         }
//     }
// }
//Работа с файлами
// import java.io.FileWriter; //запись, дозапись
// import java.io.IOException;

// public class program {
//     public static void main(String[] args) {

//         try (FileWriter fw = new FileWriter("file.txt", false)){ // false(перезаписать), true(дописать)
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.append("line 3");
//             fw.flush();
//         } catch (IOException ex){
//             System.out.println(ex.getMessage());
//         }
//     }
// }
// import java.io.*; // читаем по символьно
// public class Lekciya {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n'){
//                 System.out.println(ch);
//             } else {
//                 System.out.println(ch);
//             }
//         }
//     }
// }
// import java.io.*; // читаем по строчно

// public class Lekciya {

//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null){
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }