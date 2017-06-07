
import java.net.*;
import java.io.*;
import java.util.*;
 
//public class WordsOfEqChars {
public class RAnagrams {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.puzzlers.org/pub/wordlists/unixdict.txt");
        InputStreamReader isr = new InputStreamReader(url.openStream());
        BufferedReader reader = new BufferedReader(isr);
 
        Map<String, Collection<String>> anagrams = new HashMap<String, Collection<String>>();
        String word;
        int count = 0;
        while ((word = reader.readLine()) != null) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!anagrams.containsKey(key))
                anagrams.put(key, new ArrayList<String>());
            anagrams.get(key).add(word);
            count = Math.max(count, anagrams.get(key).size());
        }
 
        reader.close();
 
        for (Collection<String> ana : anagrams.values())
            if (ana.size() >= count)
                System.out.println(ana);
    }   
}

/*
Output:
[angel, angle, galen, glean, lange]
[elan, lane, lean, lena, neal]
[alger, glare, lager, large, regal]
[abel, able, bale, bela, elba]
[evil, levi, live, veil, vile]
[caret, carte, cater, crate, trace]
 */

