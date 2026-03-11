package Collections;

import java.util.HashMap;
import java.util.Map;

public class InterviewQuestion {
    public static void main(String[] args) {
        int[] a = {4,5,5,5,4,6,6,9,4};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i], map.getOrDefault(a[i],0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
