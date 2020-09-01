package hacker_rank;

import java.util.*;

/**
 * @author Mahedi Hassan
 * 2020-06-26
 */

public class SubsetComparison {

    public ArrayList<ArrayList<String>> data = new ArrayList<>();
    public HashMap<Integer, Integer> ranking = new HashMap<>();

    public static void main(String args[]){
        new SubsetComparison().compare();
    }

    public void compare(){

        data.add(new ArrayList<>(Arrays.asList("a","b","d","c")));
        data.add(new ArrayList<>(Arrays.asList("a","m","f","g")));
        data.add(new ArrayList<>(Arrays.asList("j","a","b","m")));
        data.add(new ArrayList<>(Arrays.asList("a","b","h","i")));


        for (int i = 0; i < data.size(); i++){
            for (int j = i + 1; j < data.size(); j++){
                ArrayList<String> list1 = new ArrayList<>(data.get(i));
                ArrayList<String> list2 = new ArrayList<>(data.get(j));
                list1.removeAll(list2);
                int x = ranking.get(j) == null ? 0 : ranking.get(j);
                int y = ranking.get(i) == null ? 0 : ranking.get(i);
                ranking.put(j, x + list1.size());
                ranking.put(i, y + list1.size());
            }
        }
        int key = Collections.max(ranking.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
        System.out.println(data.get(key));
    }
}