/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * Project which is done in LAb.
 *
 *
 *
 */

public class ReclamationProject {
    /**
     *
     * @param e String 1.
     * @param f String 2.
     * @return r returns longest substring r.
     */
    public static String doIt(final String e, final String f) {
        String a = e, b = f;
        if (a.length() > b.length()) {
            String c = a;
            a = b;
            b = c; // swap the strings if a > b
            }
        String r = "";
        /*
         * For loop checking if substring is same
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if ((a.regionMatches(i, b, k, j) && j > r.length())) {
                        r = a.substring(i, i + j);
                        }
                    }
                }
        }
        return r; // return back the substring obtained above
        }
    /**
     * my main function.
     * @param args something.
     */
    public static void main(final String[] args) {
        String inp1 = "Wassup";
        String inp2 = "Sup";
        doIt(inp1, inp2);

    }
    }
