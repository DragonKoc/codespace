package advanced.alfa.lesson23_26.work1.model;

import advanced.alfa.lesson23_26.work1.model.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class SourceBooks {
    public static List<Book> generateBooks() {
        List<Book> list = new ArrayList<>();
        list.add(new Book("HeadFirstJava", "Beyts", "Almanah", 1905, 100, 1000.5));
        list.add(new Book("Java. Руководство для начинающих", "Шилдт", "Javac", 2020, 300, 450.5));
        list.add(new Book("Java для чайников", "Берд", "Almanah", 1988, 300, 200.0));
        list.add(new Book("Java. Полное руководство", "Шилдт", "JavaLesson", 2001, 500, 432.5));
        list.add(new Book("Java. Библиотека профессионала", "Хорстманн", "Publish", 2010, 800, 500.5));
        list.add(new Book("Java. Методы программирования", "Блинов", "Nebo", 2020, 200, 345.0));
        list.add(new Book("Java. Справочник разработчика", "Эванс", "Sky", 2005, 600, 800.5));
        list.add(new Book("Java SE 9. Базовый курс", "Хорстманн", "Agenstvo", 1945, 100, 1010.0));
        list.add(new Book("Effective Java", "Блох", "Abetka", 2018, 1005, 333.5));
        list.add(new Book("Философия Java", "Эккель", "Divo", 2013, 900, 690.0));
        return list;

    }
}
