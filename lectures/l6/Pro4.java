package org.example.lectures.l6;

import java.util.Arrays;
import java.util.HashSet;

public class Pro4 {
    public static void main(String[] args) {
       WorkerOOP w1 = new WorkerOOP();
       w1.firstName = "Имя_1";
       w1.lastName = "Фамилия_1";
       w1.salary = 100;
       w1.id = 1000;

        WorkerOOP w2 = new WorkerOOP();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        WorkerOOP w3 = new WorkerOOP();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        var workers = new HashSet<WorkerOOP>(Arrays.asList(w1, w2, w3));
//        System.out.println(workers.contains());
        System.out.println(workers);

    }
}
