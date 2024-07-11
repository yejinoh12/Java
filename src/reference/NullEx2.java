package reference;

import javax.xml.crypto.Data;

public class NullEx2 {
    public static void main(String[] args) {

        /**
         * NullPointerException
         * 참조값 없이 객체를 찾아가는 경우 발생
         * 객체를 참조할 때는 . 을 사용 하는데
         * null에 . 을 찍으면 찾아갈 객체가 없다는 뜻이므로
         * 이때 NullPointerException이 발생한다.
         */

        Data2 data = null;
        //data.value = 10; NullPointerException
        //System.out.println(data.value);

        BigData bigData = new BigData();
        System.out.println(bigData.count); //int는 초기값이 0
        System.out.println(bigData.data);  //참조형은 초기값이 null

        //System.out.println(bigData.data.value); NullPointerException
        //참조형은 자동으로 null로 초기화 되기 때문
    }
}
