package jyothi;
import java.util.ArrayList;
import java.util.Collections;

public class CartoonArrayList {
    public static void main(String[] args) {
        ArrayList<String> cartoonCharacters = new ArrayList<>();

        
        cartoonCharacters.add("Tom");
        cartoonCharacters.add("Jerry");
        cartoonCharacters.add("SpongeBob");
        cartoonCharacters.add("Mickey");
        cartoonCharacters.add("Scooby");

    
        cartoonCharacters.remove("Jerry"); 
        
        cartoonCharacters.set(1, "Donald"); 

        
        System.out.println("Cartoon characters:");
        for (String name : cartoonCharacters) {
            System.out.println(name);
        }

        
        Collections.sort(cartoonCharacters);
        System.out.println("\nSorted cartoon characters:");
        for (String name : cartoonCharacters) {
            System.out.println(name);
        }
    }
}