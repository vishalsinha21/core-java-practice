package ransom;

import java.util.Hashtable;
import java.util.Map;

public class Solution {

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new Hashtable<>();

        System.out.println(magazine.length);
        System.out.println(note.length);

        for (String word : magazine) {
            if (magazineMap.containsKey(word)) {
                Integer count = magazineMap.get(word);
                magazineMap.put(word, ++count);
            } else {
                magazineMap.put(word, Integer.valueOf(1));
            }
        }

        boolean result = true;

        for (String word : note) {
            if (magazineMap.containsKey(word)) {
                Integer count = magazineMap.get(word);
                if (count == 1) {
                    magazineMap.remove(word);
                } else if (count > 1) {
                    magazineMap.put(word, --count);
                }
            } else {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }


    public static void main(String[] args) {
        checkMagazine(
                "give me one grand today night one one one".split(" "),
                "give me one grand today night one one".split(" ")
                );
    }
}
