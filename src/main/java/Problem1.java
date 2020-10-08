public class Problem1 {

    private static int lowAdjust = 0;
    private static int highAdjust = 0;

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution

        if (data != null && data.length >= 1) {

            int high = data.length - 1 - highAdjust;
            int low = lowAdjust;
            int median = low + (high - low) / 2;

            if (data[median] == target) {
                //because instance variable, needs to reset with different set
                lowAdjust = 0;
                highAdjust = 0;
                return median;

            } else if (high == low) {
                return -1;

            } else if (target < data[median]) {
                highAdjust = data.length - median;
                return binarySearch(data, target);

            } else if (target > data[median]) {
                lowAdjust = median - low + 1;
                return binarySearch(data, target);
            }


        } return -1;
    }
}
