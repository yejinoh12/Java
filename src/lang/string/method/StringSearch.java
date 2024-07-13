package lang.string.method;

public class StringSearch {

    public static void main(String[] args) {

        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 Java가 포함되어 있는지: " + str.contains("Java"));

        System.out.println("Java의 첫 번째 index: " + str.indexOf("Java"));

        System.out.println("인덱스 10번부터 Java의 index: " + str.indexOf("Java",10));

        System.out.println("Java의 마지막 index: " + str.lastIndexOf("Java"));
    }
}
