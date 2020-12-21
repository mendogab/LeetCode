package main.Java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicates {
  public static void main(String[] args) {
    char[] characters = {'d', 'a', 'c', 'b', 'd'};
    System.out.println(findMaxDuplicates(characters));
  }

  public static Character findDuplicates(char[] chars) {
//    for (int i = 0; i < chars.length; i++) {
//      for (int j = 0; j < i; j++) {
//        if(chars[i] == chars[j]) {
//          return chars[i];
//        }
//      }
//    }
//    return null;

    Set<Character> characterSet = new HashSet<Character>();
    for (char c : chars) {
      if (characterSet.contains(c)) {
        return c;
      } else {
        characterSet.add(c);
      }


    }
    return null;
  }

  public static char findMaxDuplicates(char[] chars) {
    Map<Character, Integer> countMap = new HashMap<Character, Integer>();
    for (char c : chars) {
      int count = countMap.getOrDefault(c, 0);
      countMap.put(c, count + 1);
    }

    int max = 0;
    Character argmax = null;

    for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
      if(max < entry.getValue()) {
        max = entry.getValue();
        argmax = entry.getKey();
      }
    }
    return argmax;
  }
}
