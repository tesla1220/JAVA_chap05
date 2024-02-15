package com.ohgiraffers.section02.copy;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표 : 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다. */



        /* 필기
        *   배열의 복사에는 크게 두 가지 종류가 있다.
        *   1. 얕은 복사 (shallow copy) : stack에 주소값만 복사 (변수에 담겨있는 주소만 복사)
        *   2. 깊은 복사 (deep copy) : heap의 배열에 저장된 값을 복사 (실제 값을 복사)
        * */

        /* 필기 - 얕은 복사
        *   얕은 복사는 stacK에 저장되어 있는 배열의 주소값만 복사한다는 것이다.
        *   따라서 두 개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
        *   하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을 하면
        *   다른 레퍼런스 변수로 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어 있다. */

        // 원본 배열 생성
        int[] originArr = {1,2,3,4,5};

        // originArr 에 저장된 배열의 주소를 copyArr에도 저장해보자
        int[] copyArr = originArr;      // 얕은 복사

        System.out.println(originArr.hashCode());       // hashCode()는 그냥 우리의 주민번호처럼 생각하자.
        System.out.println(copyArr.hashCode());

        for(int i = 0; i < originArr.length; i++) {

            System.out.println(originArr[i]);
        }

        System.out.println();

        for (int i = 0; i < copyArr.length; i++) {

            System.out.println(copyArr[i]);

        }

        copyArr[0] = 99;

        for(int i = 0; i < originArr.length; i++) {         //여기서 length를 붙여주는 이유는 몇 번 해당 식이 진행될 건지 규정해주기 위해

            System.out.println(originArr[i]);
        }

        System.out.println();

                for (int i = 0; i < copyArr.length; i++ ) {

            System.out.println(copyArr[i]);

        }

    }
}
