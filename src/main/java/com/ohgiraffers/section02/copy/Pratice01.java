package com.ohgiraffers.section02.copy;

public class Pratice01 {


    public static void main(String[] args) {

        String[] names = {"조평훈", "이혜진", "이지은"};


        System.out.println("names의 hashCode : " + names.hashCode() );


        print(names);


        String[] zoo = getAnimals();

        System.out.println("리턴 받은 animals의 hashCode : " + zoo.hashCode());

        print(zoo);


    }

    public static void print (String[] sarr) {



        System.out.println("sarr의 hashCode : " + sarr.hashCode());



        for (int i = 0; i < sarr.length; i++) {
            System.out.println(sarr[i]);
        }

        System.out.println();

    }

    public static String[] getAnimals() {

        String[] animals = new String[] { "낙타", "호랑이", "나무늘보"};

        System.out.println("새로 만든 animals의 hashCode : " + animals.hashCode());

        return animals;
    }


}
