package lessen4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет,как Вас зовут");
        String inpudName = scanner.nextLine();
        System.out.println("Приятно познакомиться, " + inpudName);
        System.out.println("Сколько вам лет");
        int inputAge = scanner.nextInt();
        if (inputAge >= 18 && inputAge <= 30) {
            System.out.println("класный возраст");
        } else if (inputAge < 18) {
            System.out.println("ты еще маленкий");
        }else {
            System.out.println("ты опытный");
        }

    }
}
