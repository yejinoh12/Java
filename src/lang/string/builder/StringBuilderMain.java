package lang.string.builder;

public class StringBuilderMain {

    public static void main(String[] args) {

        /**
         * String
         * 불변이므로 문자을 더하거나 변경할 때마다 계속해서 새로운 객체를 생성하게돼서 GC의 대생이 많아지게 됨
         * StringBuilder
         * 가변적  내부 값을 바로 변경하므로 새로운 객체를 생성하지 않아 성능과 메모리 사용면에서 불변보다 더 효율적이지만
         * 사이드 이펙트에 주의해서 사용해야 함
         */

        StringBuilder sb = new StringBuilder();
        sb.append("A");//문자열 추가
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb); //불변이 아니므로 반환 값이 없다. 새로운 객체를 생성하지 않으므로 바로 바뀜

        sb.insert(4, "java"); //특정 위치에 문자열 삽입
        System.out.println(sb);

        sb.delete(4,8); //특정 범위의 문자열 삭제
        System.out.println(sb);

        sb.reverse(); //뒤집기
        System.out.println(sb);

        String str = sb.toString(); //toString String으로 return
        System.out.println(str);
    }
}
