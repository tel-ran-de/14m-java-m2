package lesson12;

import java.util.ArrayList;

public class HelloArrayList {
    public static void main(String[] args) {
        //hellllllo();
        ArrayList<Integer> listTest = new ArrayList<Integer>();
        ArrayList<Float> listTest2 = new ArrayList<>();
        ArrayList<Long> listTest3 = new ArrayList<>();
        System.out.println(Integer.MAX_VALUE);
        /*
        byte -> Byte
        short -> Short
        char -> Character
        int -> Integer
        Long
        Float
        Double
        Boolean
        http://java-online.ru/java-lang-wrapper.xhtml
        https://www.baeldung.com/java-arraylist
        http://developer.alexanderklimov.ru/android/java/arraylist.php
        https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html
        https://docs.oracle.com/javase/8/docs/api/java/lang/Number.html

        Коллекции, деревья

        */
    }

    private static void hellllllo() {
        String[] array = new String[10];
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println(list);
        int n = array.length;
        n = list.size();
        System.out.println(n);
        String hm = "Василий";
        array[3] = hm;
        list.add("Тест");
        System.out.println(list);
        list.set(0,hm);
        System.out.println(list);
        list.add("Элемент") ; // МЫ добавляем в конец.
        list.add(0, "wslfjsdlf");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
