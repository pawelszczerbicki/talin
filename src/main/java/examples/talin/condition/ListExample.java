package examples.talin.condition;

import java.util.ArrayList;
import java.util.Arrays;

public class ListExample {

    public static void main(String[] args) {

        //generics
        ArrayList<String> names = new ArrayList<>();
        names.add("dsads");
        names.add("dsdadewads");
        names.add("dsadrwrwes");
        names.add("dsrewrweads");
        names.add("dsarewds");

        Arrays.asList("", "", "");

        for (String name : names) {
            System.out.println(name);
        }


        names.get(3);
        for (int i = 0; i < names.size(); i++) {
              names.get(i);
        }

    }
}
