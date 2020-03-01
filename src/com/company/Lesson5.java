package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Lesson5 {
    public static void main(String[] args) {
//        int i = 5;
//        while(i < 5) {
//            System.out.println(i++);
//        }
//
//        do {
//        } while (i < 5);

//        Вы подписали контракт с компанией, которая будет вам платить каждый день в три раза больше чем в предыдущий, пока общая сумма выплаченных денег не превысит 1 миллиона. Зарплата за первый день составляет 1 гривну. Посчитайте сколько дней продлится этот контракт.
//        Например: (допустим в первый день зарплата составляет 1 доллар)
//        1й день - 1, общая сумма выплат = 1
//        2й день - 3, общая сумма выплат за 2 дня = 1+3=4
//        3й день - 9, общая сумма выплат за 3 дня = 1+3+9=13

//        int money = 1;
//        int result = 0;
//        while (result < 1000000) {
//            result += money;
//            System.out.println("result " + result);
//            money *= 3;
//            System.out.println("money " + money);
//        }
//
//        System.out.println("first million " + result);

//        В Японии числа 4 и 9 считаются несчастливыми.
//        Вам нужно пронумеровать 100 космических шаттлов для перевозки людей на Марс так,
//        чтобы в номерах шаттлов не попадалось несчастливых чисел.

//        int shipsCount = 0;
//        int number = 0;
//
//        while(shipsCount < 100) {
//            String stringNumber = number + "";
//            boolean isContainsWrongNumber = stringNumber.contains("4") || stringNumber.contains("9");
//            if(!isContainsWrongNumber) {
//                shipsCount++;
//                System.out.println(stringNumber);
//            }
//            number++;
//        }
//
//        TimeSpan span = new TimeSpan();
//        System.out.println(span.getHours());
//        System.out.println(span.getMinutes());
//
//        span.setTime(10, 59);
//
//        System.out.println("--------------------------");
//        System.out.println(span.getHours());
//        System.out.println(span.getMinutes());
//
//        span.addTime(1, 59);
//
//        System.out.println("--------------------------");
//        System.out.println(span.getHours());
//        System.out.println(span.getMinutes());
//
//        span.subTime(8, 5);
//
//        System.out.println("--------------------------");
//        System.out.println(span.getHours());
//        System.out.println(span.getMinutes());

        List<Book> booksList = new ArrayList<>();
        Book book = new Book();
        book.setName("Thinking on java");
        book.setAuthor("B. Ekkel");
        book.setMoney(100_00);
        book.setPageCount(400);
        book.setYear(2013);
        book.setPublish("Kyiv smth");

        Book book1 = new Book();
        book1.setName("Thinking on java");
        book1.setAuthor("B. Ekkel1");
        book1.setMoney(100_00);
        book1.setPageCount(400);
        book1.setYear(2017);
        book1.setPublish("Kyiv smth");

        Book book2 = new Book();
        book2.setName("Thinking on java");
        book2.setAuthor("B. Ekkel2");
        book2.setMoney(100_00);
        book2.setPageCount(400);
        book2.setYear(2016);
        book2.setPublish("Kyiv smth");

        booksList.add(book);
        booksList.add(book1);
        booksList.add(book2);

        for(int i = 0; i < booksList.size(); i++) {
            if(booksList.get(i).getYear() == 2017){
                System.out.println(booksList.get(i).getAuthor());
            }
        }
    }


    public static void showAuthor(Book book) {
        System.out.println(book.getAuthor());
    }
}
