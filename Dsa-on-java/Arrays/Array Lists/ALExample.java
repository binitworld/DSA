import java.util.ArrayList;

public class ALExample {
    public static void main(String[] args) {
        /*
         * SYNTAX -->>>>>>>
         * ArrayList<Datatype(Integer)> name(List) = new ArrayList<You may write the
         * Datatype here , But it is not mandatory ..>(Capacity / Size );
         * |
         * ^^^^^^^^^^^It is a Constructor ^^^^^^^^^^^^^^^
         * 
         */
        ArrayList<Integer> price = new ArrayList<>(6);
        price.add(89);
        price.add(90);
        price.add(91);
        price.add(92);
        price.add(93);
        price.add(94);
        price.add(94);// here we can add above the initial capacity!

        System.out.println(price);
        // To check the array list does it contains some specific price or not
        System.out.println(price.contains(93));
        System.out.println(price.contains(99));
        // To change some items or update the list like
        price.set(6, 95);
        System.out.println(price);
        // To remove the items from array list like :
        price.remove(4);
        System.out.println(price);
        //

    }
}
