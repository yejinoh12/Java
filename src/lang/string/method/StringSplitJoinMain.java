package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {

        //split
        String str = "Apple,Banana,Orange";

        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        //join
        String joinedStr = String.join("-", "apple", "banana", "orange");
        System.out.println(joinedStr);

        String result = String.join("***", splitStr);
        System.out.println(result);

    }
}
