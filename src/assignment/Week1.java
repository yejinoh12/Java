package assignment;

import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double star = scanner.nextDouble();
        scanner.nextLine(); //개행문자 제거
        String comment = scanner.nextLine();

        //Double->int 형변환, 소수점 이하의 값을 버리고 정수값만을 얻음
        int intStar = (int) star;
        double percentage = intStar * 20;

        System.out.println("[" + name + "]");
        System.out.println("별점: " + intStar + " (" + percentage + "%)" );
        System.out.println(comment);

    }
}
