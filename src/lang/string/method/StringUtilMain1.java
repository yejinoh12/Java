package lang.string.method;

public class StringUtilMain1 {

    public static void main(String[] args) {

        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello World!";

        //ValueOf
        String numStr = String.valueOf(num); //숫자를 문자로
        System.out.println(numStr);

        String numStr2 = num + " "; //숫자 + 빈문자열을 숫자가 된다!!
        System.out.println(numStr2);

        String boolStr = String.valueOf(bool); //boolean을 문자로
        System.out.println(boolStr);

        String objStr = String.valueOf(obj); //객체의 문자열 값
        System.out.println(objStr);

        char[] strCharArray = str.toCharArray(); //문자 배열로
        for(char c : strCharArray){
            System.out.print(c);
        }

    }


}
