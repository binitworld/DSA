
public class StringCase1D {
    public static void main(String[] args) {
        String[] names = { "Raja", "Raman", "Binit", "Mridul" };
        System.out.println(names);

        String target = "Binit";

        int result = linearSearch(names, target);
        System.out.println(result);

    }

    static int linearSearch(String[] arr, String target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            String element = arr[i];
            if (element.equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
