package com.ohgiraffers.section01.array;

public class Question02 {

//     다음 식의 출력값을 예측해보세요!!
    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5};
        System.out.println("original의 해시코드: " + original.hashCode());

        int[] copied = copy(original);
        System.out.println("copied의 해시코드: " + copied.hashCode());

        print(original);
        print(copied);
    }

    public static int[] copy(int[] arr) {
        int[] copied1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copied1[i] = arr[i];
        }
        return copied1;
    }

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println();

    }
}
