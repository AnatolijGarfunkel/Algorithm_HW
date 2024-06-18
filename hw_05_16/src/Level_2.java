public class Level_2 {
    public static void main(String[] args) {
        int [] array = {3, 6, 4, 7, 2, 1, 9};
        int i = 0;
        int sum = 0;

        while (i < array.length) {
            sum = sum + array[i] * array[i];
            i ++;
        }

        System.out.println(sum);
    }
}
