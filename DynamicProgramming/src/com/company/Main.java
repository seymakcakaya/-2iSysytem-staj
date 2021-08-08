package com.company;

public class Main {


    public static void main(String[] args) {
       
        long startTime = 0;
        long endTime = 0;
        long totalTime = 0;
        int n = 9;
        Fibonacci fibonacci = new Fibonacci();

        startTime = System.nanoTime();
        fibonacci.fibRecursion(n);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("Tekrarlı fonksiyon için geçen süre:" + totalTime);//14900

        startTime=System.nanoTime();
        fibonacci._initialize();
        fibonacci.fibMemoization(n);
        endTime=System.nanoTime();
        totalTime=endTime-startTime;
        System.out.println(" Memorization için geçen süre:"+totalTime);//14700

        startTime=System.nanoTime();
        fibonacci.fibTabulation(n);
        endTime=System.nanoTime();
        totalTime=endTime-startTime;
        System.out.println("Tabulation  için geçen süre:"+totalTime);//7200
    }

    }





