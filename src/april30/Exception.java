package april30;

public class Exception {
    public static void main(String[] args) {
        String str = null;

        try {
            int length = str.length();
            System.out.println("Length of string: " + length);
        } catch (NullPointerException e) {
            e.printStackTrace();
           // System.out.println(e);
            System.out.println("String is null.");
        }

        System.out.println(str);
    }

}
