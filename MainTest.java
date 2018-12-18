import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainTest {

    public static void main(String [] args){
        Map<String,User> map = new HashMap<>();
        map.put("AA",new User("汪超",23));
        map.put("BB",new User("汪龙",33));
        map.put(null,new User("汪武",63));
        Iterator<Map.Entry<String,User>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,User> m = iterator.next();
            System.out.println(m.getKey() + "---" + m.getValue());
        }
    }
}

class User{
    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
