package Lesson_05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {
    public static void main(String[] args) {
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Canh sat");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");
        emergencyList.put(118, "Others");

        Iterator<Map.Entry<Integer,String>> emergencyListIterator = emergencyList.entrySet().iterator();
        while (emergencyListIterator.hasNext()){
            Map.Entry<Integer,String> entry=emergencyListIterator.next();
            if(entry.getValue().equals("Others")) emergencyListIterator.remove();
        }

        for (Integer key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }
    }
}
