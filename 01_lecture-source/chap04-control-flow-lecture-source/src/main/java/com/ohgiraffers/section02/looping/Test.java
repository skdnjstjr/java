package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Test t = new Test();
//        t.onetoten();
//        t.tentoone();
//        t.gugudan7();
//        t.onetwo100onlyEven();
//        t.factorial();
//        t.time();
        t.star1();

    }


    public void onetoten() {

        for(int i = 1; i<= 10; i++) {
            System.out.println(i);
        }

    }

    public void tentoone() {

        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }

    public void gugudan7() {

        int dan = 7;

        for(int su = 1; su <= 9; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }

    }

    public void onetwo100onlyEven() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public void factorial() {

        Scanner sc = new Scanner(System.in);
        System.out.print("양수 하나를 입력하세요(최대20) : ");
        long num = sc.nextLong();
        long sum = 1;
        for(long i = 1; i <= num ; i++) {
            sum = sum*i;

        }
        System.out.println(sum);
    }

    public void time() {

        for (int h = 0; h <= 23; h++) {

            for (int m = 0; m <= 59; m++) {
                System.out.println(h + " : " + m);
            }

        }
    }

    public void star1() {

        for(int i = 1 ; i < 6; i++){  // 행
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
