
public class methods {

    public static void main(String[] args) {
        String str = "KodNest Technologies";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(3));
        System.out.println(str.contains("Nest"));
        System.out.println(str.contains("nest"));
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.endsWith("ies"));
        System.out.println(str.indexOf('K'));
        System.out.println(str.length());
        System.out.println(str.replace('e', 'A'));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 14));
        String s1 = "Raja";
        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());
        String s2 = " ";
        System.out.println(s2.isBlank());
        System.out.println(s2.isEmpty());
        String s3 = "";
        System.out.println(s3.isBlank());
        System.out.println(s3.isEmpty());

    }
}
