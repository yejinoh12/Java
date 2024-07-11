package static1;

public class StaticEx1 {

    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("A count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("A count = " + Data3.count);

        //힙 영역에 인스턴스는 3개 생성되었고
        //count는 프로그램 실행 시점에 메서드 영역에 1개가 만들어진다.


        //인스턴스를 통한 접근 - 권장하지 않음
        //먼저, 인스턴스로 갔다가 static 이면 static 영역에 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        //클래스를 통한 접근 - 공용 변수에 접근하고 있음이 더 명확함
        System.out.println(Data3.count);
    }
}
