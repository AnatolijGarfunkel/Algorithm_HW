public class Level_2 {
    public static void main(String[] args) {

        /*
        Здравствуйте,

        я перенял Ваш код из презентации, что бы не мучиться. В принципе я разобрался в коде, что к чему, и как это
        работает.
         */

        String s = "poiuytrewqlkjhgfdsamnbvcxz";
        s = s.toUpperCase();
        char [] testArray = new char[s.length()];
        for (int i = 0; i < testArray.length; i ++) {
            testArray[i] = s.charAt(i);
        }

        quickSort(testArray, 0, testArray.length - 1);
        for (char data : testArray)
            System.out.print(data);

    }
    public static void quickSort (char [] array, int start, int end) {
        if (start < end) {
            int indexPivot = partition(array, start, end);
            quickSort(array, start, indexPivot - 1);
            quickSort(array, indexPivot + 1, end);
        }
    }

    public static int partition(char [] array, int start, int end) {
        int pivot = array[end];
        int j = start;

        for (int i = start; i < end; i ++) {
            if (array[i] <= pivot) {
                swap(array, i, j);
                j++;
            }
        }
        swap(array, end, j);
        return j;
    }

    public static void swap(char [] array, int first, int second) {
        char temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
