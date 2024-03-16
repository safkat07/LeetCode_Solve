import java.util.Arrays;

/**
 * Permutation_in_String
 */
public class Permutation_in_String {

    public static boolean check(String s1, String s2) {
        int s1Length = s1.length();
        int i = 0;
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);

        while (i + s1Length <= s2.length()) {
            String s2Array = s2.substring(i, i + s1Length);
            char[] strArray = s2Array.toCharArray();
            Arrays.sort(strArray);
            if (Arrays.equals(s1Array, strArray)) {
                return true;
            }
            i++;
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(check("saf", "abc"));
    }
}