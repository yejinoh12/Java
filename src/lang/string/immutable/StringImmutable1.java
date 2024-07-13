package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {

        String str1= "hello";
        str1.concat(" java");
        System.out.println(str1);


        //String은 불변객체이기 때문에 변경이 필요한 경우 기존 값을 반환하지 않고
        //새로운 결과를 만들어서 반환
        String str2 = "hello";
        String str3 = str2.concat(" java");
        System.out.println(str3);
    }
}
