package math.problems;

public class Pattern {

    public void bubbleSort(int [] Array) {
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = 0; j < Array.length - 1; j++) {
                if (Array[j] < Array[i]) {
                    int temp;
                    temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                }
            }
        }
        for (int a = 0; a < Array.length; a++) {
            System.out.println(Array[a]);
        }
    }


    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
         *
         *
         */
    int [] array = {100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32};
    Pattern pattern = new Pattern();
    pattern.bubbleSort(array);

    }
}

