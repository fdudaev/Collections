import com.farrukhzaripov._collections.Theatre;
import com.sun.source.tree.BreakTree;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


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