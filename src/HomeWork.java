import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                arr[i]=0;
        }else {
                arr[i]=1;
            }
            System.out.println(arr[i]+ " ");
    }}}
class Lesson2{
    public static void main(String[]args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");

            }
        }}
class Lesson3{
    public static void main(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }}
class Lesson4{
    public static void main() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
class Lesson5{
    public static void main(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("[" + i + "]" + arr[i] + " ");
        }
    }
        }
        class Lesson6{

            public static void main( int[] arr){
                int max = arr[0];
                int min = arr[0];

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                    max = arr[i];
                }
            }
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i]<min){
                        min = arr[i];
                    }
                }
                System.out.println(max);
                System.out.println(min);
        }}
class Lesson7{
    public static boolean main ( int[] arr) {
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rightSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (leftSum == rightSum - leftSum){
                return true;
            }
        }
        return false;
    }
}
class Lesson8{

}