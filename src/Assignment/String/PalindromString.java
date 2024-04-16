package Assignment.String;

public class PalindromString {

    public static boolean palindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "avsva";
        if (palindrome(s))
            System.out.print("yes");
        else
            System.out.print("No");

    }
}
