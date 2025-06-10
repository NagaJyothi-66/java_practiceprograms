package jyothi;
import java.util.TreeSet;
import java.util.Comparator;

public class ReverseEmployee {
    public static void main(String[] args) {
        TreeSet<String> employeeNames = new TreeSet<>(Comparator.reverseOrder());
        employeeNames.add("Sumit");
        employeeNames.add("Karan");
        employeeNames.add("Anjali");
        employeeNames.add("Mohan");
        employeeNames.add("Zoya");
        System.out.println("Employee Names in Reverse Order:");
        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}