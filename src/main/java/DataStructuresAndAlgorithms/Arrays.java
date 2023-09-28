package DataStructuresAndAlgorithms;

public class Arrays {
    public static void  main(String[] args){
        String[] groceries = {"Banana","Apple","Duuriyan"};
        System.out.println(groceries.length);
        System.out.println(groceries[0]);

        for(String item : groceries){
            System.out.println(item + " ,");
        }

        groceries[1] = null;
        System.out.println(groceries.length);



    }
}
