package static1;

public class Data3 {

    public String name;
    public static int count;
    /**static 변수(=정적 변수, 클래스 변수)
     * static이 붙은 멤버 변수는 메서드 영역에서 관리
     * 메서드 영역의 count 값이 증가
     * */
    public Data3(String name) {
        this.name = name;
        count++; //객체가 생성되면 생성자에서 정적 변수 count의 값을 하나 증가
    }
}
