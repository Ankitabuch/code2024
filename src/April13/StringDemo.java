package April13;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "pragra";
        String s2 = "pragra";
        String s3 = new String("pragra");
        String s4 = new String("Pragra");

        /*System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s1);*/
        String s = "Pragra";
        char c;
        String r = "";

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            r = c + r;
        }
        System.out.print(r);
    }
}
