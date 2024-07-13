package lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception{

        Class helloClass = Hello.class;

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();

        //getDeclaredConstructor() : 생성자를 선택한다.
        //newInstance() : 선택된 생성자를 기반으로 인스턴스를 생성한다.

        String result = hello.hello();
        System.out.println(result);


    }
}
