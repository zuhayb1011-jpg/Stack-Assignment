import java.util.Stack;

class Solution {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character character : stack) {
            result.append(character);
        }
        return result.toString();
    }


    public String removeTriples(String s) {
        Stack<Character> characters = new Stack<>();
        Stack<Integer> counts = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int count = 1;

            if (!characters.isEmpty() && characters.peek() == current) {
                count = counts.peek() + 1;
            }

            characters.push(current);
            counts.push(count);

            if (count == 3) {
                characters.pop();
                characters.pop();
                characters.pop();
                counts.pop();
                counts.pop();
                counts.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character character : characters) {
            result.append(character);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.removeDuplicates("abbaca")); // ca
        System.out.println(solution.removeDuplicates("azxxzy")); // ay
        System.out.println(solution.removeDuplicates("abcd"));   // abcd
        System.out.println(solution.removeDuplicates("aabbcc")); // empty line

        System.out.println(solution.removeTriples("deeedbbcccbdaa")); // aa
    }
}
