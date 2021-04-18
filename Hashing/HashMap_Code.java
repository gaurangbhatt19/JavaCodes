import java.util.*;
public class HashMap_Code {
    public static void main(String[] args) {
     HashMap<String, Integer> hm=new HashMap<String, Integer>();
     hm.put("gaurang",1);
     hm.put("bhatt",2);
     System.out.println(hm.size());
     System.out.println(hm);
    for(Map.Entry<String, Integer> e:hm.entrySet())
    {
        System.out.println(e.getKey()+" "+e.getValue());
        System.out.println(hm.containsKey("bhatt"));
        System.out.println(hm.containsValue(1));

    }
   
    }
    
}
