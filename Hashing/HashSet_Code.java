import java.util.*;
public class HashSet_Code {
    public static void main(String[]args) 
    { 
        HashSet<String> h = new HashSet<String>(); 
        h.add("Gaurang");
        h.add("Bhatt");
        h.add("Java");
        h.add("Code");

        for(String s : h)
    {
        System.out.println(s);
    }
        h.remove("Java");
        while(!h.isEmpty())
        {
            System.out.println(h.size());
            System.out.println(h.contains("Bhatt"));
            h.remove("Gaurang");
            h.remove("Code");
            h.remove("Bhatt");
            System.out.println(h.size());
        }
        h.add("Gaurang");
        h.add("Bhatt");
        h.add("Java");
        h.add("Code");
        h.clear();
        System.out.println(h.size());
        
    } 
}
