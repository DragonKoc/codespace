package com.alfa.lesson2;


public class D2701 {

//TASK1
    public int day = 21;
    public int hour = 24;
    public int min = 60;
    public int sec = 60;

//TASK2
    public long secondnow = System.currentTimeMillis();

//TASK3
    public int value1 = 10;
    public int value2 = -15;

}

//result

class Result {

    public static void main(String[] args) {
//TASK1
        System.out.println("***TASK1***");
        D2701 t1 = new D2701();
        System.out.println(t1.day*t1.hour*t1.min*t1.sec);

//TASK2
        System.out.println("\n\n***TASK2***");
        D2701 t2 = new D2701();

        long sec = t2.secondnow;

        long seconds = (sec / 1000) % 60;
        long minutes = (sec / (1000 * 60)) % 60;
        long hours = (sec / (1000 * 60 * 60) % 24);
        System.out.println(hours + " " + minutes + " " + seconds);

        String  full = (sec / (1000 * 60 * 60) % 24) + " " + (sec / (1000 * 60)) % 60 + " " + ((sec / 1000) % 60);
        System.out.println(full);

//TASK3
        System.out.println("\n\n***TASK3***");
        D2701 t3 = new D2701();

        System.out.println("value1 =" + t3.value1); //10
        System.out.println("value2 =" + t3.value2); //-15

        System.out.println("change..." + (t3.value1 = t3.value1 + t3.value2 - (t3.value2 = t3.value1)) + " & " + t3.value2);

        System.out.println("value1=" + " "+ t3.value1);
        System.out.println("value2=" + " "+ t3.value2);

    }

}