import java.util.*;

class HashFun {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("vinod", 1);
        map.put("solanki", 2);
        map.put("hello", 3);
        map.put("hii", 4);
        for (Map.Entry<String, Integer> m : map.entrySet())
        // iteration of hashmap
        {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(map.size());
        System.out.println(map.get("vinod"));
    }
}