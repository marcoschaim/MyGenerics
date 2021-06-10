package br.usp.each.si.ach2003;

import java.util.List;

public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2)
    {
        return p1.getKey().equals(p2.getKey())
                && p1.getValue().equals(p2.getValue());
    }

//    public static <T extends Integer> int countGreaterThan(T[] anArray, T elem) {
//        int count = 0;
//        for (T e : anArray)
//            if (e.intValue() > elem.intValue())
//                ++count;
//        return count;
//    }

    public static <T extends Comparable> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

    public static  void printList(List<?> list) {
        for (Object elem: list)
        System.out.print(elem + " ");
        System.out.println();
    }

}
