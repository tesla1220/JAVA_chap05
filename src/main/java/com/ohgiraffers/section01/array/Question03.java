package com.ohgiraffers.section01.array;

public class Question03 {

    public static void main(String[] args) {

//         출력값 예측하기

            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("numbers의 해시코드: " + numbers.hashCode());

            modify(numbers, 2, 10);
            System.out.println("numbers의 해시코드: " + numbers.hashCode());

            print(numbers);
        }

        public static void modify(int[] arr, int index, int value) {
            if (index >= 0 && index < arr.length) {
                arr[index] = value;
            }
        }

        public static void print(int[] arr) {
            for (int num : arr) {
                System.out.println(num);
            }
            System.out.println();
    }
}
