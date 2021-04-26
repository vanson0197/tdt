package com.company;

import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        // Map <key, value>
        HashMap<Integer, String> hT = new HashMap<>();
        hT.put(1, "A");
        hT.put(2, "B");
        hT.put(3, "C");
        hT.put(4, "D");
        hT.put(5, "E");
        hT.put(6, "F");


        Set<Map.Entry<Integer, String>> entry = hT.entrySet();
        for (Map.Entry<Integer, String> e : entry) {
            System.out.print(e + " ");
        }
        hT.remove(2);
        System.out.println();
        Set<Map.Entry<Integer, String>> entry1 = hT.entrySet();
        for (Map.Entry<Integer, String> e : entry1) {
            System.out.print(e + " ");
        }
        System.out.println();

        // Map <key, List<Object>>
        HashMap<Integer, List<String>> hT2 = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list1.add("Toan");
        list1.add("Li");
        list1.add("Hoa");

        list2.add("Van");
        list2.add("Su");
        list2.add("Dia");

        list3.add("Toan");
        list3.add("Van");
        list3.add("Anh");

        hT2.put(1, list1);
        hT2.put(2, list2);
        hT2.put(3, list3);

        Set<Map.Entry<Integer, List<String>>> entry4 = hT2.entrySet();
        for (Map.Entry<Integer, List<String>> e : entry4) {
            System.out.print(e + " ");
        }
        System.out.println();

        // Map<List<key>, List<Object>>
        HashMap<List<Integer>, List<String>> hT3 = new HashMap<>();
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        List<Integer> list6 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);

        list5.add(4);
        list5.add(5);

        list6.add(6);
        list6.add(7);

        hT3.put(list4, list1);
        hT3.put(list5, list2);
        hT3.put(list6, list3);

        Set<Map.Entry<List<Integer>, List<String>>> entry2 = hT3.entrySet();
        for (Map.Entry<List<Integer>, List<String>> e : entry2) {
            System.out.print(e + " ");
        }


    }

}
