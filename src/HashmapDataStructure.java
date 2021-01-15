import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashmapDataStructure {
    public static void main(String[] args){
        HashMap <String,Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("supriya", 20);
        hashMap.put("Sandip",27);
        hashMap.put("Snigdha",21);
        hashMap.put("Boy",01);
        System.out.println(hashMap);
        System.out.println(hashMap.size());
        System.out.println(hashMap.containsValue(21));
        System.out.println(hashMap.containsValue(28));

        Set<String> set = hashMap.keySet();
        System.out.println(set);
        for(String key : set){
            System.out.println(key);
        }
        System.out.println(hashMap.containsKey("supriya"));
        System.out.println(hashMap.containsKey("Sandip"));
        System.out.println(hashMap.containsKey("Snigdha"));
        System.out.println(hashMap.containsKey("boy"));


    }
}
