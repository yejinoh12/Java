package reference;
// 자기 패키지 안에 있는 클래스는 자동으로 읽어들임

public class RefEx2 {
    //참조형 메서드 호출
    public static void main(String[] args) {
        Data2 dataA = new Data2();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); //주소를 참조하므로 값이 바뀜 a=20
    }
    static void changeReference(Data2 dataX) {
        dataX.value = 20;
    }
}

