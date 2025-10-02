import java.util.HashMap;
import java.util.Map;


/**
 * Write a description of class WordCounter here.
 *It interacts with the user via text input/output and provides automated responses.
 * 
 * @author Eimaan Akhtar
 * @version 2.0
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordCounter
{
    // instance variables - replace the example below with your own
    private int x;
    private Map<String, Integer> wordCounts;

    /**
     * Constructor for objects of class WordCounter
     */
    public WordCounter()
    {
        wordCounts = new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addWords(String input) {    
        String[] words = input.split(" ");
        for (String word : words) {
            word = word.toLowerCase();
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) +1);
        }
    }
    
    public void printWordCounts() {
        System.out.println("\nWord usage statistics:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public Map<String, Integer> getWordCounts() {
        return wordCounts;
    }
    
    public void printFilteredWordCounts(Map<String, String> responseMap) {
    System.out.println("\nFiltered word usage statistics:");
    for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
        if (!responseMap.containsKey(entry.getKey())) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    } 
}
    
