import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        HashMap<String, Integer> map = new HashMap<>();

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        String[] words = paragraph.split("\\s+");

        // Count frequency
        for (String word : words) {
            boolean bannedWord = false;

            for (String b : banned) {
                if (word.equals(b)) {
                    bannedWord = true;
                    break;
                }
            }

            if (!bannedWord) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        // Find maximum frequency word
        String ans = "";
        int max = 0;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }

        return ans;
    }
}