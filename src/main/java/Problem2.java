public class Problem2 {

    private static int index = 1;
    private static int swap = 0;

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        if (data != null && data.length >= 2) {
            int lhs, rhs;

                lhs = data[index - 1];
                rhs = data[index];

                if (lhs > rhs) {
                    data[index - 1] = rhs;
                    data[index] = lhs;
                    swap++;
                }

                if (index == data.length - 1 && swap == 0) {
                    index = 1;
                    return;
                } else if(index == data.length - 1) {
                    index = 1;
                    swap = 0;
                    bubbleSort(data);
                } else {
                    index++;
                    bubbleSort(data);
                }
        }
    }
}
