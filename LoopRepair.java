public class LoopRepair {

    // Read REQ 03
    // Bug Found: The loop went one index past the end of the String.
    // Variables Watched: i, current, count
    // Method Call That Caught It: countVowels("banana")
    public int countVowels(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char current = Character.toLowerCase(text.charAt(i));

            if (current == 'a' || current == 'e' || current == 'i'
                    || current == 'o' || current == 'u') {
                count++;
            }
        }

        return count;
    }

    // Read REQ 04
    // Bug Found: The loop never changed remaining, so its condition stayed true
    // forever.
    // Variables Watched: remaining, halvings
    // Method Call That Caught It: halveSteps(8)
    public int halveSteps(int value) {
        int halvings = 0;
        int remaining = value;

        while (remaining > 1) {
            remaining = remaining / 2;
            halvings++;
        }

        return halvings;
    }

    // Read REQ 05
    // Bug Found: The code counted characters that were not 0.
    // Variables Watched: count, digits.substring(i, i + 1)
    // Method Call That Caught It: countZeros("1234")
    public int countZeros(String digits) {
        int count = 0;

        for (int i = 0; i < digits.length(); i++) {
            if (digits.substring(i, i + 1).equals("0")) {
                count++;
            }
        }

        return count;
    }

    // Read REQ 06
    // Bug Found: The comparison used > instead of >=, so it skipped A.
    // Variables Watched: letter, capitals
    // Method Call That Caught It: countCapitals("Apple Banana")
    public int countCapitals(String text) {
        int capitals = 0;

        for (int index = 0; index < text.length(); index++) {
            char letter = text.charAt(index);

            if (letter >= 'A' && letter <= 'Z') {
                capitals++;
            }
        }

        return capitals;
    }

    // Read REQ 07
    // Bug Found: The loop replaced the sum each pass instead of adding to it.
    // Variables Watched: sum, number
    // Method Call That Caught It: sumTo(5)
    public int sumTo(int n) {
        int sum = 0;

        for (int number = 1; number <= n; number++) {
            sum += number;
        }

        return sum;
    }

    // Read REQ 08
    // Bug Found: The method returned from inside the loop after the first asterisk.
    // Variables Watched: stars, i
    // Method Call That Caught It: buildStars(4)
    public String buildStars(int count) {
        String stars = "";

        for (int i = 0; i < count; i++) {
            stars += "*";
        }

        return stars;
    }

    // Read REQ 09
    // Bug Found: The result gets reset after every pass, and values equal to limit
    // should not count.
    // Variables Watched: count, value, limit
    // Method Call That Caught It: countAbove(new int[] {3, 7, 15, 10}, 10)
    public int countAbove(int[] nums, int limit) {
        int count = 0;

        for (int value : nums) {
            if (value > limit) {
                count++;
            }
        }

        return count;
    }

    // Read REQ 10
    // Bug Found: The loop started one index past the end of the String, and result
    // was overwritten each pass.
    // Variables Watched: i, result
    // Method Call That Caught It: reversed("loops")
    public String reversed(String text) {
        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }

        return result;
    }

    public char lastChar(String text) {
        return text.charAt(text.length() - 1);
    }

    public String traceHalveSteps(int value) {
        String result = "" + value;

        while (value > 1) {
            value = value / 2;
            result += " " + value;
        }

        return result;
    }
}