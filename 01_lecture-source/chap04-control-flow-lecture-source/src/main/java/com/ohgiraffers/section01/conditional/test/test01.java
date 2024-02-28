package com.ohgiraffers.section01.conditional.test;

import java.util.Scanner;

public class test01 {

    public static void main(String[] args) {

//        1번 문제
//        60점 이상이면 합격을 판단하는 프로그램을 작성해보자.
//        점수가 0미만 100초과이면 경고문구 (”잘못 입력하셨습니다.”) 출력

                Scanner sc = new Scanner(System.in);
                System.out.print("학년과 점수를 입력: ");
                int grade = sc.nextInt();
                int score = sc.nextInt();

                String msg = "잘못 입력하셨습니다.";

                if (score>=0 && score <=100) {
                        if (score>=60){
                            msg = "합격";
                        } else msg = "불합격";

                }


                System.out.println(msg);

    }

}
