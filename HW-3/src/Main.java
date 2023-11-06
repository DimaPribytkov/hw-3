import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Написать программу, в которую пользователь будет вводить
//        температуру по Цельсию, а программа должна преобразить
//        ее в температуру по фаренгейту. Формула преобразования:
//        (F = C * 1.8 + 32).

        System.out.println("\t\t\t***Добро пожаловать!***");
        System.out.println("Введите температуру по Цельсию: ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double x =  1.8;
        int y = 32;

        System.out.println("Температура по Фаренгейту равна: " + ((c * x) + y));
    }
}

