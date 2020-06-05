package interviewQuestions;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> ans = groupAnagrams(strs);

        for (List<String> list : ans) {
            System.out.println(list);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int count[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(count);
            List<String> list = map.getOrDefault(key, new LinkedList<String>());

            list.add(s);
            map.put(key, list);
        }

        return new LinkedList<>(map.values());
    }
}