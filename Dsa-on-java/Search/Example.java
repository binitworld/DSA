public class Example {
    public static void main(String[] args) {
        int[] num = { 23, 32, -54, 67, 90, 23, 78, 11 };
        // int target = 90;
        int target = -53;

        int results = linearSearch(num, target);
        System.out.println(results);

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a loop
        for (int i = 0; i < arr.length; i++) {
            // Check for every element at every index if it is a target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }
}
