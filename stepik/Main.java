package org.example.stepik;

import java.util.Scanner;

/**

 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); int b = scanner.nextInt();
        int c = scanner.nextInt(); int d = scanner.nextInt();
        if ((a == c + 2 && b == d - 1) || (a == c + 2 && b == d + 1)) System.out.println("YES");
        else if ((a == c - 2 && b == d - 1) || (a == c - 2 && b == d + 1)) System.out.println("YES");
        else if ((b == d + 2 && a == c - 1) || (b == d + 2 && a == c + 1)) System.out.println("YES");
        else if ((b == d - 2 && a == c - 1) || (b == d - 2 && a == c + 1)) System.out.println("YES");
        else System.out.println("NO");






    }
}
