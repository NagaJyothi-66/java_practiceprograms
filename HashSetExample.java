package jyothi;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class HashSetExample{

    public static void main(String[] args) {

        // Create a HashSet to store mobile phone brand names
        HashSet<String> mobilephones = new HashSet<String>();

        // Add brand names to the HashSet
        mobilephones.add("samsung");
        mobilephones.add("Apple");
        mobilephones.add("oppo");
        mobilephones.add("iQ");
        mobilephones.add("Redmi");
        mobilephones.add("Realme");
        mobilephones.add("poko");
        mobilephones.add("vivo");

        // Attempt to add duplicates (these will be ignored)
        mobilephones.add("samsung");
        mobilephones.add("samsung");

        // Print HashSet (duplicates will not appear)
        System.out.println("HashSet: " + mobilephones);

        // Convert HashSet to ArrayList
        ArrayList<String> mobilephonesList = new ArrayList<String>(mobilephones);
        System.out.println("ArrayList: " + mobilephonesList);

        // Check if a specific brand exists
        String nameToCheck = "Apple";
        if (mobilephones.contains(nameToCheck)) {
            System.out.println(nameToCheck + " exists in the HashSet.");
        } else {
            System.out.println(nameToCheck + " does not exist in the HashSet.");
        }

        // Iterate through the HashSet
        System.out.println("Iterating through HashSet:");
        Iterator<String> iterator = mobilephones.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
