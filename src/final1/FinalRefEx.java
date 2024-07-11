package final1;

public class FinalRefEx {

    public static void main(String[] args) {

        final Data data = new Data(); //참조형을 final로 선언
        //data = new Data(); final로 선언 되었으므로 참조값을 변경할 수 없음

        /**
         * 참조값 변경은 불가능 하지만
         * 참조 대상의 값은 변경 간으
         * data.value 는 final 이 아니므로 가능
         */

        data.value = 10;
        System.out.println(data.value);
        data.value = 30;
        System.out.println(data.value);

    }

}
