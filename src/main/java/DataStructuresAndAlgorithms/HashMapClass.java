package DataStructuresAndAlgorithms;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args){
        HashMap<String,Integer> person = new HashMap<>();
        person.put("Navo",20);
        person.put("Navo1",22);
        person.put("Navo2",23);

        System.out.println(person.get("Navo"));
        System.out.println(person.containsKey("Navo2"));
        person.remove("Navo2");
        System.out.println(person.size());

    }
}
