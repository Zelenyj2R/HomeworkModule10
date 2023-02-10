package WordFrequency;

import java.io.*;
import java.util.*;

public class СustomWordFrequency {
    public static void main(String[] args) {
        Map<String,Integer> mapWords = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("taskPhrase"))) {
            while(reader.ready()){
                String words = reader.readLine();
                String[] lineWords = words.split("\\s+");
                for(String lineWord:lineWords){
                    if(mapWords.containsKey(lineWord)){
                        int count = mapWords.get(lineWord);
                        mapWords.put(lineWord,count+1);
                    }
                    else {
                        mapWords.put(lineWord,1);
                    }
                }
                //System.out.println(mapWords);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer value1 = mapWords.get(o1);
                Integer value2 = mapWords.get(o2);
                return value1.compareTo(value2) > 0 ? 1 : -1;
            }
        };
        Map<String, Integer> sorting = new TreeMap<>(comparator.reversed());
        sorting.putAll(mapWords);

        System.out.println(sorting);
    }
}







