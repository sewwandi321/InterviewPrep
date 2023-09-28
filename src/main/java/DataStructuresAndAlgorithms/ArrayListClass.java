package DataStructuresAndAlgorithms;


import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("ALTO");
        cars.add("Jeep");

        for(String item:cars){
            System.out.println(item + ",");
        }
        System.out.println(cars.size());

        cars.remove(0);
        System.out.println(cars.size());
    }
}
