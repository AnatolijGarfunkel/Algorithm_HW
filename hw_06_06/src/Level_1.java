public class Level_1 {
    public static void main(String[] args) {
        int [] array1 = {100, 112, 256, 349, 770};
        int [] array2 = {72, 86, 113, 119, 265, 445, 892};

        int [] array3 = new int[array1.length + array2.length];
        int i, j, k, position;
        i = j = position = 0;
        k = 7;

        while (i < array1.length && j < array2.length) {
            if (array1[i] > array2[j]) {
                array3[position] = array2[j];
                j ++;
            }
            else {
                array3[position] = array1[i];
                i ++;
            }
            position ++;
        }

        while (i < array1.length) {
            array3[position] = array2[i];
            i++;
            position ++;
        }
        while (j < array2.length) {
            array3[position] = array2[j];
            j++;
            position ++;
        }

        for (int data: array3)
            System.out.print(data + " ");
        System.out.println("\nk(" + k + ") = " + array3[k]);
    }
}
