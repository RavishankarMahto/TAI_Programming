package Array;
import java.util.*;

     public class remDupliChar {
        public static void main(String[] args) {
            String input = "programming";

            // Convert string to char array
            char[] chars = input.toCharArray();

            // Use LinkedHashSet to maintain order and remove duplicates
            Set<Character> set = new LinkedHashSet<>();
            for (char c : chars) {
                set.add(c);
            }

            // Build result string
            StringBuilder result = new StringBuilder();
            for (char c : set) {
                result.append(c);
            }

            System.out.println(result.toString());
        }
    }
