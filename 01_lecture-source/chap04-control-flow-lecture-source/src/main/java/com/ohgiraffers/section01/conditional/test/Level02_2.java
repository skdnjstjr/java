package com.ohgiraffers.section01.conditional.test;

import java.util.Scanner;

public class Level02_2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int english = sc.nextInt();
        double average = (math+english)/2;
        if ( (average >= 60) && (math >= 40) && (english >=40) ) {

            System.out.println("합격");

        } else System.out.println("불합격");

    }

}
// 또 다른 풀이
//        Scanner sc = new Scanner(System.in);
//        System.out.print("수학 점수를 입력해주세요 : ");
//        int math = sc.nextInt();
//
//        System.out.print("영어 점수를 입력해주세요 : ");
//        int english = sc.nextInt();
//        double avg = (math + english) / 2;
//
//        if(avg < 60) {
//
//            System.out.println("시험 불합격");
//        } else if (english < 40 || math < 40){
//
//            System.out.println("한 과목 과락으로 인한 시험 불합격");
//        } else {
//            System.out.println("시험에 합격했습니다.");
//        }





