package Lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Canh sat");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Other");
        System.out.println(emergencyList.get(116));

        emergencyList.put(116,"Something else");
        System.out.println(emergencyList.get(116));
        System.out.println(emergencyList.get(117));

        System.out.println(emergencyList.keySet());
        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }

        System.out.println("Has 113 key: "+emergencyList.containsKey(113));
        System.out.println("Has value: "+emergencyList.containsValue("Others"));

        emergencyList.replace(116,"116");
        System.out.println(emergencyList.get(116));

        emergencyList.replace(116,"116","Something else else");
        System.out.println("after replace: "+emergencyList.get(116));

    }
}
