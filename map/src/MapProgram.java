import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"Python");
        map.put(1,"Java");
        map.put(2,"JavaScript");
        map.put(3,"C#");
        map.put(4,"ReactJS");
        map.put(5,"MySQL");
        if(map.containsValue("Java")){
            System.out.println("Is already in map");
        }else{
            map.put(1,"Java is the best course");
        }

        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
        System.out.println(map.get(0));
    }
}
