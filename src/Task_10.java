import java.util.Scanner;

/*
* Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.).
* Вывести название соответствующего времени года («зима», «весна», «лето», «осень»).
* */
public class Task_10 {

    static void defineSeasonIf(int month){
        if (month == 12 || month == 1 || month == 2)
            System.out.println("«зима»");
        else if (month == 3 || month == 4 || month == 5)
            System.out.println("«весна»");
        else if (month == 6 || month == 7 || month == 8)
            System.out.println("«лето»");
        else
            System.out.println("«осень»");
    }
    static void defineSeasonSwitch(int month){
        switch (month){
            case 12:
            case 1:
            case 2: System.out.println("«зима»");
                    break;
            case 3:
            case 4:
            case 5: System.out.println("«весна»");
                    break;    
            case 6:
            case 7:
            case 8: System.out.println("«лето»");
                    break;
            case 9:
            case 10:
            case 11: System.out.println("«осень»");
                     break;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер месяца — целое число в диапазоне 1–12: ");
        int month = input.nextInt();

        System.out.print("Использование оператора if -- ");
        defineSeasonIf(month);

        System.out.print("Использование оператора switch -- ");
        defineSeasonSwitch(month);
    }
}
