import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class OurSomeLongNamedClasswork {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диапозон значений через пробел  >>>");
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        int[] arr = createArrayWithRandomValues(15, low, high + 1);

        System.out.print("Угадайте число в этом массиве >>>");
int guess = scanner.nextInt();
int result = search(arr , guess);
if (result < 0){
    System.out.println("Не угадал");
}else {
    System.out.println("Угадал");
}
        System.out.println(Arrays.toString(arr));
    }


    public static int[] createArrayWithRandomValues() {
        Random random = new Random();
        int [] arr = new int[random.nextInt(Integer.MAX_VALUE)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    public static int[] createArrayWithRandomValues(int length, int lowBound, int highBound) {
        int range = highBound - lowBound;
        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(range) + lowBound;
        }
        return arr;
    }


    public static int search (int [] arr , int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                return i;
            }

        }
        return -1;


    }
}