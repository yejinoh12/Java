package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 자바에서 Class 클래스는 클래스의 정보(메타데이터)를 다루는데 사용된다. Class 클래스를 통해 개발자는 실행
 * 중인 자바 애플리케이션 내에서 필요한 클래스의 속성과 메서드에 대한 정보를 조회하고 조작할 수 있다.
 * 주요기능 : 타입 정보 얻기, 리플랙션, 동적로딩, 애노테이션 처리
 */

public class ClassMetaMain {

    public static void main(String[] args) throws ClassNotFoundException {

        Class c1 = String.class; //클래스에서 조회
        //Class c2 = new String().getClass(); //인스턴스에서 조회
        //Class c3 = Class.forName("java.lang.String"); //문자열로 조회


        // 모든 필드 출력
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getType() + " " + field.getName());
        }

        // 모든 메서드 출력
        Method[] methods = c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method);
        }

        // 상위 클래스 정보 출력
        System.out.println("Superclass: " + c1.getSuperclass().getName());

        // 인터페이스 정보 출력
        Class[] interfaces = c1.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface: " + i.getName());
        }


    }
}
