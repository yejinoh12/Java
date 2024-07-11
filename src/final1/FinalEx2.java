package final1;

public class FinalEx2 {

    public static void main(String[] args) {

        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value); //10
        System.out.println(constructInit2.value); //20

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        System.out.println(fieldInit1.value); //10
        System.out.println(fieldInit2.value); //10
        System.out.println(fieldInit3.value); //10  값이 변하지 않음


        //상수 : 상수는 대무자로 적는 것이 관례
        System.out.println("상수");
        System.out.println(FieldInit.CONS_VALUE);
    }
}
