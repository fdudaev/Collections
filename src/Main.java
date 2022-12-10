import com.farrukhzaripov._collections.Theatre;
import com.sun.source.tree.BreakTree;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        Set<Integer> age = new HashSet<>();
        names.add("Bilal");
        names.add("Aisha");
        names.add("Aliya");
        names.add("Aliya");
        names.set(3, " Nilu");
        age.add(2);
        age.add(10);
        age.add(6);
        age.add(9);
        System.out.println(names+ " " + age);

        HashMap<String, Double> expenses = new HashMap<>();

        expenses.put("Farrukh", 245.63);
        expenses.putIfAbsent("Bilal", 245.63);


        System.out.println(expenses);


        char a = 'a';
        System.out.println();

        System.out.println(lastTwo("Morocco"));

    }
    public static String lastTwo(String str){

        String a = str.substring(Math.max(str.length() - 2, 0));

        return a + a + a;

    }

}