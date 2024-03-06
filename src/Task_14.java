import java.util.Scanner;

/*
 * Даны десять вещественных чисел. Найти их сумму.
 * */

public class Task_14 {

    static float[] generateArray(int size){
        float[] array = new float[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) Math.random() * 40;
        }
        return array;
    }

    static void showArray(float[] array){
        System.out.println("Сгенерированный массив, размером на " + array.length + " элементов," +
                " заполнен такими значениями:");
        for (int i = 0, j = 1; i < array.length; i++, j++) {
            System.out.println(j + ")." + array[i]);
        }
    }
    static float calculateSumOfNumber(float[] array){
        float sumOfElements = 0;
        for (float elem: array){
            sumOfElements += elem;
        }
        return sumOfElements;
    }
    public static void main(String[] args) {

        Scanner inputSizeArray = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int sizeArray = inputSizeArray.nextInt();

        float[] newArray = generateArray(sizeArray);

        showArray(newArray);

        System.out.print("Сумма всех " + sizeArray + " вещественных чисел, будет равна: "
                + calculateSumOfNumber(newArray));
    }
}
