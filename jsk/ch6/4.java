public class Solution {
    String mostCommonWord(String paragraph, String[] banned) {
        var bans = Arrays.asList(banned);
        var words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!bans.contains(word)) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}