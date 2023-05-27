import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println("------");
        Set<Integer> uniqueEvenNums = new HashSet<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNums.add(num);
            }
        }

        List<Integer> sortedNumbers = new ArrayList<>(uniqueEvenNums);
        sortedNumbers.sort(Integer::compareTo);

        for (int num : sortedNumbers) {
            System.out.println(num);
        }
        System.out.println("------");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> uniqueWords = new HashSet<>(strings);

        for (String word : uniqueWords) {
            System.out.println(word);
        }
        System.out.println("------");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : strings) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
    }
}