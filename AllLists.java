package jyothi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

class MyArrayList {
    ArrayList<String> arr;

    public MyArrayList() {
        arr = new ArrayList<>();
        System.out.println("List Of Students (ArrayList):");
        arr.add("jyothi");
        arr.add("siva");
        arr.add("sai");
        arr.add("teja");
    }
}

class MyLinkedList {
    LinkedList<String> li;

    public MyLinkedList() {
        li = new LinkedList<>();
        System.out.println("List Of Students (LinkedList):");
        li.addFirst("John");
        li.add("Alice");
        li.add("Bob");
    }
}

class MyHashSet {
    HashSet<String> hs;

    public MyHashSet() {
        hs = new HashSet<>();
        System.out.println("List Of Fruits (HashSet):");
        hs.add("Banana");
        hs.add("Apple");
        hs.add("Banana"); 
    }
}

class MyHashMap {
    HashMap<Integer, String> hm;

    public MyHashMap() {
        hm = new HashMap<>();
        System.out.println("List Of Animals (HashMap):");
        hm.put(1, "dog");
        hm.put(2, "cat");
        hm.put(3, "elephant");
    }
}

public class AllLists {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.println(myArrayList.arr);

        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.li);

        MyHashSet myHashSet = new MyHashSet();
        System.out.println(myHashSet.hs);

        MyHashMap myHashMap = new MyHashMap();
        System.out.println(myHashMap.hm);
    }
}
