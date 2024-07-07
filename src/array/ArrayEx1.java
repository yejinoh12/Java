package array;

// 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것, 참조변수
public class ArrayEx1 {
    public static void main(String[] args) {

        int[] score = new int[] {10, 20, 30, 40, 50};;

       /*
        int [] score = new int[5];
        score[0] = 10;
        score[1] = 20;
        score[2] = 30;
        score[3] = 40;
        score[4] = 50;
        */

        int tmp = score[3] + score[4];


        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }

        System.out.printf("tmp: " + tmp);

        // System.out.println(score[7]); Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
    }
}
