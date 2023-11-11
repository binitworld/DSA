public class Examp {
    public static void main(String[] args) {

        int[] names = new int[6];
        String[] names1 = { "Yudhithir", "Bhim", "Arjun", "Nakul", "Shaydev" };
        // This lines names1[0---4] length is use to call the specific names

        System.out.println(names[0]);

        System.out.println(names1[1]);
        System.out.println(names1[2]);

        // For calling all the names in a flow i just iterated the for loop
        System.out.println("Names in Array are: ");
        for (int i = 0; i < names1.length; i++) {
            System.out.println(names1[i]);
        }
    }
}
