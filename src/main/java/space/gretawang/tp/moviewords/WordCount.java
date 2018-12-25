package main.java.space.gretawang.tp.moviewords;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;



public class WordCount {
    public static void main(String arg[]){
        try {
            File file = new File("C:\\Users\\leandev\\Desktop\\Test.txt");
            List<String> lines = FileUtils.readLines(file, "UTF-8");

            int wordCount=0;
            Map<String,WordStructure> map= new HashMap<>();
            for (String line : lines) {
                StringTokenizer token=new StringTokenizer(line);
                while(token.hasMoreTokens()){
                    wordCount++;
                    String word=token.nextToken(", ?.!:\"\n");
                    if(map.containsKey(word)){
                        WordStructure wordStructure=map.get(word);
                        wordStructure.setTotalCount(wordStructure.getTotalCount() + 1);
                        map.put(word, wordStructure);
                    }
                    else {
                        WordStructure wordStructure = new WordStructure();
                        wordStructure.setWord(word);
                        wordStructure.setTotalCount(1);

                        map.put(word, wordStructure);
                    }
                }
            }
            System.out.println("总共单词数："+wordCount);
            sort(map);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sort(Map<String,WordStructure> map){
        List<Map.Entry<String, WordStructure>> infoIds = new ArrayList<>(map.entrySet());
        infoIds.sort((o1, o2) -> (o2.getValue().getTotalCount() - o1.getValue().getTotalCount()));
        for (Entry<String, WordStructure> id : infoIds) {
            System.out.println(id.getKey() + ":" + String.format("%s-%d-%d", id.getValue().getWord(), id.getValue().getTotalCount(), id.getValue().getWordFrequency()));
        }
    }
}
