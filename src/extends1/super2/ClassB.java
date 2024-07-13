package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        //생성자에 부모의 생성자 호출
        super(); //매개 변수가 없는 기본 생성자는 생략 가능
        System.out.println("ClassB 생성자 a="+a);
    }
    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a="+a + " b=" + b);
    }

}
