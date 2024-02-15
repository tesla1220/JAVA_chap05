package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {

//        요일 “월“ ~ “일”까지 초기화된 문자열 배열을 만들고,
//
//                0부터 6까지 숫자를 입력 받아 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고,
//
//                범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.


        String[] week = { "월", "화", "수", "목", "금", "토", "일"};

        Scanner sc = new Scanner(System.in);

        System.out.println("0부터 6까지 숫자 중 하나의 숫자를 입력해주세요:");

        int day = sc.nextInt();

        if ( day < 0 && day > 6 ) {
            System.out.println("잘못 입력하셨습니다.");

        } else {
            System.out.println( week[day] );
        }




    }
}
