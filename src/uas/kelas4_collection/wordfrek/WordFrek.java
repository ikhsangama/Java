package uas.kelas4_collection.wordfrek;

import java.io.IOException;
import java.util.*;


public class WordFrek {
    private final List<String> allWords;
    String sentence;

    public WordFrek(String kalimat) {
        this.sentence = kalimat;
        allWords = new ArrayList<>();
    }

    public Map<String, Integer> findUnikue() throws IOException{
        System.out.println("Kalimat \n"+ sentence);
        System.out.println("");

        StringTokenizer myToken = new StringTokenizer(sentence);

        while (myToken.hasMoreTokens()){
            String token = myToken.nextToken().toLowerCase();
            allWords.add(token);
        }

        Map<String, Integer> unikueWords = new HashMap<>();
        for(String word: allWords){
            if(!unikueWords.containsKey(word)){
                unikueWords.put(word,1);
            } else{
                unikueWords.put(word,unikueWords.get(word)+1);
            }
        }
        return unikueWords;
    }
}
