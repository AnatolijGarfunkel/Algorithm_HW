public class Task_1 {
    public static void main(String[] args) {
        int[] array = {3, 6, 4, 7, 2, 1, 9};

        int i = 0;
        int wanted = 1;

        while (true) {
            if (array[i] == wanted) {
                break;
            }
            i++;
            if (i == array.length) {
                i = -1;
                break;
            }
        }

        System.out.println("индекс искомого числа: " + i);
    }
}