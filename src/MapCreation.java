import java.util.*;

public class MapCreation {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<String, Integer>();
        Map<Integer, String> m2 = new HashMap<Integer, String>();

        m1.put("Justin", 1);
        m1.put("Monica", 2);
        m1.put("Irene", 3);
        m1.put("Josh", 4);
        m1.put("Loki", 5);

        //print out contents of m1
        for (Map.Entry<String, Integer> entry : m1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println(m1.get("Justin"));

        // insert into m2
        m2.put(1, "Brent");
        m2.put(2, "Matt");
        m2.put(3, "Hannah");

        //print out contents of m2
        for (Map.Entry<Integer, String> entry : m2.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
}
}
