package org.example.homework.h3.pro3;

import org.example.homework.h3.pro3.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц, фамилия автора содержит
 * «А» и год издания после 2010 г, включительно.
 */
public class H3 {
    public static void main(String[] args) {
        Book book = new Book("Криптвоюматика", "Антонов",
                765, 2022, 256);
        Book book2 = new Book("Хулиномика", "Мрков",
                349, 2011, 199);
        Book book3 = new Book("Апофения", "Апанчин",
                329, 2010, 199);
        Book book4 = new Book("Защита от темных искусств", "Панчин",
                349, 2018, 400);

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (Book b : books){
            if (b.getSurname().contains("А") && primeNumber(b.getNumberOfPages()) && b.getYearOfPublishing() >= 2010){
                System.out.println("Название книги: " + b.getNameBook());}
        }
    }

    /**
     * Проверяем, данное число простое или нет
     * @param num число на проверку простого
     * @return простое или не простое(true\false)
     */

    public static boolean primeNumber(int num) {
        Double sqrt = Math.sqrt(num);
        for (int i = 2; i <= sqrt.intValue(); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
