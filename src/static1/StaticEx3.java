package static1;

public class StaticEx3 {

    public static void main(String[] args) {

        System.out.println("1. static call");
        DecoData.staticCall();

        System.out.println("2. instance call");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. instance call2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //DecoData.staticCall(data2);

        //정적 메서드의 활용
        //객체 생성이 필요 없이 메서드의 호출만으로 필요한 기능 수행

        //정적 메서드 접근
        //1. 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근 - 권장
        DecoData.staticCall();

    }
}
