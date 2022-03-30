package com.company;

public class Main {

    public static void main(String[] args) {
        method(generateRandomAge(), 10);

        method(generateRandomAge(), 6);

        method(generateRandomAge(), -3);

        method(generateRandomAge(), 0);

        method(generateRandomAge(), -13);


    }

    public static int generateRandomAge(){
        int randomNum =(int) (Math.random() * 75);

        return randomNum;
    }


    public static int method(int age, int temperature) {
        if (age > 19 && age < 46 && temperature > -20 && temperature < 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Можно идти гулять");
        }else{
            System.out.println("Оставайтесь дома");
        }
        return 0;
    }
}


