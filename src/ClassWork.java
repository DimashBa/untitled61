import java.util.Random;

public class ClassWork {

    public class OurSomeLongNamedClassworkLesson {

        public static final String SOME_CONSTANT_VALUE = "some";

        int someVariable = 10;

        public static void main(String[] args) {
            //    int[] arr = createArrayWithRandomValues(15);
            //    System.out.println(Arrays.toString(arr));
            Random random = new Random();
            System.out.println(random.nextInt(100));
        }

        public static int[] createArrayWithRandomValues(int length) {
            int[] arr = new int[length];
            Random random = new Random();

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt();
            }
            return arr;
        }
        public static int[] createArrayWithRandomValues(int length, int lowBound, int highBound) {
            int[] arr = new int[length];
            Random random = new Random();

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt();
            }
            return arr;
        }

    }
}
