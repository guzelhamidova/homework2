package com.company;

public class Main {
    public static void main(String[] args) {
        int methodResult = feedback(23, 18);
        System.out.println(methodResult);
        System.out.println(feedback(23, 18));
        System.out.println(feedback(23, 18));
        System.out.println("Конец программы");


        int min = 23;
        int max = 65;
        int random_number1 = min + (int) (Math.random() * max);
        {
            System.out.println("1-ый случайный возвраст:" + random_number1);
            int random_number2 = min + (int) (Math.random() * max);
            {
                System.out.println("2-ой случайный возраст:" + random_number2);
                int random_number3 = min + (int) (Math.random() * max);
                {
                    System.out.println("3-ий случайный возраст:" + random_number3);
                    System.out.println("Можно ли идти гулять" + " " + random_number1);
                    System.out.println("Можно ли идти гулять" + " " + random_number2);
                    System.out.println("Можно ли идти гулять" + " " + random_number3);

                }
            }
        }
    }
    public static int feedback(int age, int temperature) {
        System.out.println(age + temperature);
        int result = age * temperature;
        return result;

    }
}







