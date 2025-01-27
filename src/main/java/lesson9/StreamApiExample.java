package lesson9;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiExample {

    static ArrayList<String> stringArrayList = new ArrayList<>();


    public static void main(String[] args) {
       createList();

       Iterator<String> iterator = stringArrayList.iterator();
       Set<Integer> filterList = new HashSet<>();
       while (iterator.hasNext()){
           String str = iterator.next();
           if(str.length() < 3) filterList.add(Integer.valueOf(str));
       }

        System.out.println(filterList);

       HashSet<Integer> filterList2 = new HashSet<>();
       for (String str: stringArrayList){
           if(str.length() < 3) filterList2.add(Integer.valueOf(str));
       }

        System.out.println(filterList2);


       Set<Integer> filterList3 = stringArrayList.stream()
               .filter((str)->{
                    return str.length() < 3;
                })
               .map((str)-> Integer.valueOf(str))
               .collect(Collectors.toSet());

        System.out.println(filterList3);

    }

    public static void createList(){

        Random random = new Random();
        for(int i =0;i<100000;i++){
            stringArrayList.add(String.valueOf(random.nextInt(1000000)));
        }

    }
}
