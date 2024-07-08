package variable;

public class ConvertIntToString {

    public static void main(String[] args) {
        int v1 = 123;
        String str1 = Integer.toString(v1);
        System.out.println(str1.getClass().getSimpleName());

        int v2 = 456;
        String str2 = String.valueOf(v2);
        System.out.println(v2);

        int v3 = 789;
        String str3 = " " + v3;
        System.out.println(str3);

    }
}

