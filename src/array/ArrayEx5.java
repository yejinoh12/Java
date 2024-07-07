package array;


// 가변 배열: 차원 이상의 다차원 배열을 생성할 때, 전체 배열을 차수 중 마지막 차수의 길이를 지정하지 않고 추후에 각기 다른 길이의 배열 생성
public class ArrayEx5 {
    public static void main(String[] args) {

        int[][] score = new int[5][]; //마지막 차수를 지정하지 않음
        score[0] = new int[4];
        score[1] = new int[3];
        score[2] = new int[2];
        score[3] = new int[1];
        score[4] = new int[0];


        for (int i = 0; i < score.length; i++) {
            System.out.printf("score[%d]의 길이 = %d%n", i, score[i].length);

        }
    }
}

