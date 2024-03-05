import java.util.Scanner;

/*
* Дано трехзначное число. Вывести вначале его последнюю цифру
* (единицы), а затем — его среднюю цифру (десятки).
* */
public class Task_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");

        String number = input.next();

        System.out.println("Последняя цифра (единицы) числа = " + number.charAt(2));
        System.out.println("Средняя цифра (десятки) = " + number.charAt(1));
    }
}
