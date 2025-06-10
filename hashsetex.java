package jyothi;
import java.util.HashSet;

public class hashsetex {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");  
        System.out.println(colors);
    }
}

