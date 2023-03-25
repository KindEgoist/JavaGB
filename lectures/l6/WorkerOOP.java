package org.example.lectures.l6;

public class WorkerOOP {
    //задаем несколько полей. Поле класса — это переменная, которая описывает какое-либо из свойств данного класса.
    int id; //индификатор
    int salary; //зарплата
    String firstName; // имя
    String lastName;// фамилия

    @Override
    public String toString() {
        return String.format("fn:%s ln:%s id:%d s:%d",firstName, lastName, id, salary);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        WorkerOOP t = (WorkerOOP) obj;
        return id == t.id && firstName == t.firstName;

    }
}
