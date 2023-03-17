import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Viorel", 969587326);
        map.put("Mihai", 36764566);
        map.put("Andreea", 234880767);
        map.put("Tatiana", 2838364);

        System.out.println("Print Map: ");
        System.out.println(map);


        System.out.print("Print Map1: ");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(map);
        System.out.println(map1);


       Queue<Integer> queueMap =  new ArrayDeque<>(map1.values());

        System.out.println("Print QueMap: ");

        for (Integer valori : queueMap){
           System.out.println(valori);
       }


       Queue<String> queueMap1 =  new ArrayDeque<>(map1.keySet());
        System.out.println("Print QueMap1: ");

       for (String keys : queueMap1) {
           System.out.println(keys);
       }

       Deque<Integer> stackMap = new ArrayDeque<>(map.values());
        System.out.println("Print StackMap: ");
        for (Integer stack : stackMap)
            System.out.println(stack);

        Deque<String> stackMap1 = new ArrayDeque<>(map.keySet());
        System.out.println("Print StackMap1: ");
        for (String stack1 : stackMap1)
            System.out.println(stack1);


        Queue<Integer> newQue = new ArrayDeque<>();
        newQue.offer(1234);
        newQue.offer(345);
        newQue.add(5466);

        System.out.println(newQue);

      //  Map<Queue newQUE,String> queueMap1 = new HashMap<>();


    }

}