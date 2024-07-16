package collection.compare;

//Comparable 구현할 수 있는 -> 구현함으로써 비교가 가능한 객체가 됨

/**
 * 객체의 기본 정렬 방법은 객체에 Comparable을 구현해서 정의하면 됨
 * 객체는 비교할 수 있는 객체가 되고 기본 정렬 방법을 가지게 됨
 * 기본 정렬 외에 다른 정렬 방법을 사용하고 싶다면 비교자(Comparator)를 구현하고 정렬 메서드에 전달 ---> IdComparator 참고
 * 이 경우에는 Comparator가 항상 우선권을 가짐
 * Integer, String 같은 기본 객체는 Comparable 구현이 되어있음
 */
public class MyUser implements Comparable<MyUser>{

    private String id;
    private int age;

    public MyUser(String name, int age) {
        this.age = age;
        this.id = name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "name='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1); //내 나이가 넘어온 나이보다 작다면 -1, 같다면 0, 크다면 1
    }
}
