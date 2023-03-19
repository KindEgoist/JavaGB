package org.example.seminars.s3.pro2;



import org.example.seminars.s3.pro2.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.	Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
 * Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
 */
public class Pro2 {
    public static void main(String[] args) {
        Student student1 = new Student("Иванова", 2, 250, List.of(3, 4, 5));
        Student student2 = new Student("Машков", 3, 234, List.of(3, 4, 5));
        Student student3 = new Student("Котлова", 2, 251, List.of(3, 4, 5));
        Student student4 = new Student("Михин", 5, 234, List.of(3, 4, 5));

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);

        for (Student el : listStudent){
            int sum = 0;
            for (int es : el.getEvalutions()){
                sum += es;
            }

            if(el.getSurname().endsWith("ова") && sum % 2 == 0){
                System.out.println(el.getMoney());
            }
        }


    }
}
