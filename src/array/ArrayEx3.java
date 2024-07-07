package array;

//배열의 복사
public class ArrayEx3 {
    public static void main(String[] args) {

        /*
         * 참조 변수 a에 참조 변수 b의 값을 저장, a와 b가 같은 배열을 가리키게 된다.
         * 이름은 다르지만 같은 배열이 된다.
         * 배열은 참조 변수를 통해서만 접근 할 수 있는데, 자신을 가리키는 참조변수가 사라지면
         * JVM의 가비지 컬럭터에 의해서 자동적으로 메모리에서 제거
         */

        System.out.println("얕은 복사");
        int[] a = {1,2,3,4,5};
        int[] b = a;

        b[0] = 9;

        System.out.println(a[0]);


        System.out.println("깊은 복사");

        //for문 이용
        int[] c = {1,2,3,4,5};
        int[] d = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            d[i] = c[i];
        }

        d[0] = 3;

        System.out.println(c[0]);

        //clone 이용(2차원이상에서는 얕은 복사가 됨) -> Arrays.copyOf() 사용
        int[] e = {1,2,3,4,5};
        int[] f = e.clone();

        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i] + " ");
        }

        System.out.println();


        //System.arraycopy() 사용
        char[] chArr1 = {'H','E','E','L','O'};
        char[] chArr2 = {'W','O','R','L','D','1','2','3','4','5'};

        char[] result = new char[chArr1.length+chArr2.length];

        //chArr1의 0번 째를 chArr2의 0으로 옮기는데 chArr1의 길이(개수)만큼 복사해온다
        System.arraycopy(chArr1, 0, result, 0, chArr1.length);
        System.arraycopy(chArr2, 0, result, chArr1.length, chArr2.length);
        System.out.println(result);

        System.arraycopy(chArr1, 0, chArr2, 0, chArr1.length);
        System.out.println(chArr2);

        System.arraycopy(chArr1, 0, chArr2, 6, 3);
        System.out.println(chArr2);

    }
}
