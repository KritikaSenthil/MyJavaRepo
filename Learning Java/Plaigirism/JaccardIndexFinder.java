/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author kritikasenthil
 */
public class JaccardIndexFinder {
    
    /*
    Goal to get ouput
    
    HashMap
        key: the word
        value: the count
    
    pass into constructor the filenames
    create scanner and read in from file,
    process each word
        add or increment count in the hashmap
    repeat for file two
    
    Add to TreeSet the keys of one of the hashmap
        use retainall to get intersection
    
    compareMaps
        takes the two maps
        does the intersection
        does the union
        either using the class,
        or by calculating with my code
        get num in common
        divided by total
    */
    
    private final HashMap<String, Integer> fileWordHashMap1=new HashMap<>();
    
    private final HashMap<String, Integer> fileWordHashMap2=new HashMap<>();
    
    private final String wordDelimiter="\\s+|(\\.|,|-|:|!|\\?|\"|\\[|\\]|\\(|\\)|'$|"
            + "\\r|\\n)*(\\s)*(\\.|,|-|:|!|\\?|\"|\\[|\\]|\\(|\\)|'$|\\r|\\n)+(\\s)*";
    
    private final double jaccardIndex;
    
    private TreeSet<String> commonKeys;
    
    public JaccardIndexFinder(String filename1, String filename2){
        createHashMap(filename1, fileWordHashMap1);
        createHashMap(filename2, fileWordHashMap2);
        jaccardIndex=compareMaps();
    }
    
    private void createHashMap(String filename, HashMap<String, Integer> wordCountHashMap){
        try{
            Scanner fileScanner=new Scanner(new File(filename));
            fileScanner.useDelimiter(wordDelimiter);
            while (fileScanner.hasNext()){
                String word=fileScanner.next().toLowerCase();
                
                if (wordCountHashMap.containsKey(word)){
                    int oldCount=wordCountHashMap.get(word);
                    wordCountHashMap.put(word, ++oldCount);
                }
                else{
                    wordCountHashMap.put(word, 1);
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
    
    private double compareMaps(){
        commonKeys=new TreeSet<>(fileWordHashMap1.keySet());
        commonKeys.retainAll(fileWordHashMap2.keySet());
        int numKeysInCommon=commonKeys.size();
        //int intersectionTotal=0;
        int intersectionTotal=numKeysInCommon;
        /*
        for (String key : commonKeys){
            int wordCount1=fileWordHashMap1.get(key);
            int wordCount2=fileWordHashMap2.get(key);
            if (wordCount1==wordCount2){
                intersectionTotal+=wordCount1*2;
            }
            else if(wordCount1<wordCount2){
                intersectionTotal+=wordCount1*2;
            }
            else{
                intersectionTotal+=wordCount2*2;
            }
        }
        */
        //double unionTotal=0;
        TreeSet<String> allKeys=new TreeSet<>(fileWordHashMap1.keySet());
        allKeys.addAll(fileWordHashMap2.keySet());
        double unionTotal=allKeys.size();
        /*
        for (Integer count : fileWordHashMap1.values()){
            unionTotal+=count;
        }
        for (Integer count : fileWordHashMap2.values()){
            unionTotal+=count;
        }
        */
        return intersectionTotal/unionTotal;
    }
    
    public void output(){
        System.out.println(fileWordHashMap1.entrySet());
        System.out.println(fileWordHashMap2.entrySet());
        
        System.out.println("Numbver of unique words in document 1: "+fileWordHashMap1.keySet().size());
        System.out.println("Numbver of unique words in document 2: "+fileWordHashMap2.keySet().size());
        System.out.println("They have "+commonKeys.size()+" words in common.");
        
        System.out.println();
        
        System.out.println("The common words in document 1, and document 2, respsectively:");
        
        System.out.printf("%20s %15s %15s%n", "Word", "Count 1", "Count 2");
        
        commonKeys.forEach((key) -> {
            System.out.printf("%20s %15d %15d%n", key, fileWordHashMap1.get(key), fileWordHashMap2.get(key));
        });
        
        System.out.println();
        
        if (this.jaccardIndex<0.5){
            System.out.println("It is not a plagiarism case.  Similarity score = "
                    +jaccardIndex+" < threshold 0.500000");
        }
        else{
            System.out.println("It is a plagiarism case.  Similarity score = "
                    +jaccardIndex+" > threshold 0.500000");
            
        }
    }
    
    /*
    intersection to get keys
        total=0;
        for key in keys
        get value from 1st hashmap
        get value from 2nd hashmap
        if equal, multiply by 2 and add two total
        otherwise, add 2 times the smaller one to total
    
    get values to get total 
        just sum them all
    perform division
        intersection/union
        return it
    
    add to output function
    */
    
}
