package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Смысл жизни", "автор", 1000, 1);
        b1.setAuther("bob");
        b2.SomeTimeLater();

        System.out.println(b1);
        System.out.println(b2);
    }
}