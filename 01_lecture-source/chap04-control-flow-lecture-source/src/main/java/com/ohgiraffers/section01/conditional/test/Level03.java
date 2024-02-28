package com.ohgiraffers.section01.conditional.test;

import java.util.Scanner;

public class Level03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 키를 숫자만 입력하세요(단위:meter) : ");
        double height = sc.nextDouble();
        System.out.print("당신의 몸무게를 숫자만 입력하세요(단위:kg) : ");
        double weight = sc.nextDouble();

        double bmi = weight / (height*height);

        if (bmi < 20) {
            System.out.println("당신은 저체중 입니다");

        } else if (bmi >= 20 && bmi < 25) {
            System.out.println("당신은 정상체중 입니다");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("당신은 과체중 입니다");
        } else System.out.println("당신은 비만 입니다");


    }

}
