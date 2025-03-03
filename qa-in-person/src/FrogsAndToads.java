import java.util.ArrayList;
import java.util.List;

public class FrogsAndToads  {

    public static void main(String[] args) {
        FrogsAndToads frogsAndToads = new FrogsAndToads();
        frogsAndToads.testCases();
    }

    /**

     */
    public String getHint(String secret, String guess) {
        long frogCount = 0L;
        long toadCount = 0L;

        List<Character> froglessSecret = new ArrayList<>();

        // Count frogs and prepare list of possible toads.
        for (int index = 0; index <= secret.length() - 1 && index <= guess.length() - 1; index ++) {
            if (guess.charAt(index) == secret.charAt(index)) {
                frogCount++;
            }
            else {
                froglessSecret.add(secret.charAt(index));
            }
        }

        // Count toads
        for (int index = 0; index <= guess.length() - 1; index ++) {
            // If the froglessSecret contains the current digit from the guess, increment the toadCount and remove
            // the first instance of the toad from the froglessSecret
            char quessChar = guess.charAt(index);
            if (quessChar != secret.charAt(index)) {
                toadCount++;
            }
        }

        return frogCount + "F" + toadCount + "T";
    }

    public boolean assertHint(int caseNumber, String results, String expected)
    {
        boolean correct = results.equals(expected);
        System.out.println("Expected value = " + expected + " Actual value = " + results);
        System.out.println("Case " + caseNumber + " = " + (correct ? "passed" : "fail"));
        return results.equals(expected);
    }

    public void testCases() {
        String case1 = getHint("1807", "7810");
        assertHint(1, case1, "1F3T");

        String case2 = getHint("1807", "2805");
        assertHint(2, case2, "2F0T");

        String case3 = getHint("1807", "9807");
        assertHint(3, case3, "3F0T");

        String case4 = getHint("1807", "1807");
        assertHint(4, case4, "4F0T");
    }
}
