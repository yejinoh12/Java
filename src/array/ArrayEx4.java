package array;

//다차원 배열 : 2차원 배열은 배열의 배열
public class ArrayEx4 {
    public static void main(String[] args) {
        int[][] score ={
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
        };

        int sum = 0;

        //향상된 for 문으로 배열의 각 요소에 저장된 값들을 순차적으로 읽어올 수 있지만 배열에 저장된 값을 변경할 수 없다
        for (int[] i: score){
            for(int j: i){
                System.out.print(j + " ");
                sum+=j;
            }
            System.out.println();
        }

        System.out.println("sum = " + sum);
    }

}
