package br.usp.each.si.ach2003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        List list = new ArrayList();
//        list.add(9);
//        Integer s = (Integer) list.get(0);
//        list.add("Olá");
//        System.out.println(list.get(1)+";"+ list.get(0));

/*
        List<String> list = new ArrayList<String>();
        list.add("olá!");
        String s = list.get(0); // sem cast
        list.add("1");
        System.out.println(list.get(1)+";"+ list.get(0));

        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(8); // OK
//        integerBox.set(3.1415);
//        integerBox.set(integerBox);
        System.out.println(integerBox.get());
        Box<String> stringBox = new Box();
        Box gen = new Box();
        Box<Box> boxBox = new Box();
        boxBox.set(stringBox);
        */

 /*       Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");
*/
//        System.out.println(p1.getKey()+"|"+p1.getValue());
//        System.out.println(p2.getKey()+"|"+p2.getValue());

//        OrderedPair<String, Box<Integer>> p =
//                new OrderedPair<>("primos", new Box<Integer>());
//        p.getValue().set(9);
//        System.out.println(p.getKey()+"|"+p.getValue());

//        Box<String> stringBox = new Box<>();
//        Box rawBox = stringBox;

//        Box rawBox = new Box(); // rawBox tem tipo raw
//        rawBox.set("Olá");
//        Box<Integer> intBox = rawBox; // warning: unchecked conversion
//        System.out.println(intBox.get());



       // as duas chamadas seguintes são equivalentes

        Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");

        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same);
        same = Util.compare(p1, p2); // tipos inferidos pelo compilador
        System.out.println(same);

        try {
            MyNaturalNumber n = new MyNaturalNumber(12);

            MyNaturalNumber n2 = new MyNaturalNumber(2);

            MyNaturalNumber  narray [] = new MyNaturalNumber[2];
            narray[0] = n;
            narray[1] = n2;

            System.out.println("Saída GreaterThan: "  + Util.countGreaterThan(narray, n));
            NaturalNumber nn = new NaturalNumber(-12);

            NaturalNumber nn2 = new NaturalNumber(-2);

            NaturalNumber  barray [] = new NaturalNumber[2];
            barray[0] = nn;
            barray[1] = nn2;

            System.out.println(Util.countGreaterThan(barray, nn));
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three");
        Util.printList(li);
        Util.printList(ls);
    }
}
