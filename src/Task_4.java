import java.util.Scanner;

/*
* Дано трехзначное число. Вывести число, полученное при прочтении
* исходного числа справа налево.
* */
public class Task_4 {
    static void reversNumber(String str){
        char[] chars = str.toCharArray();
        for (int i = chars.length; i > 0; i--) {
            System.out.print(chars[i - 1]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введіть трехзначное число: ");
        String str = input.nextLine();

        System.out.print("Число справа налево дорівнює: ");
        reversNumber(str);
    }
}
