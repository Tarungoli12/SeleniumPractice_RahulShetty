package interview;

import java.util.HashMap;
import java.util.Map;

public class problem14 {
    public static void main(String[] args) {
        String ar = "selenium";
        char[] ch = ar.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
    }
}
