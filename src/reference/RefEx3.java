package reference;

public class RefEx3 {
    public static void main(String[] args) {

        //x001
        Student s1 = new Student();
        initStudent(s1,"student1", 20, 90 );

        //x002
        Student s2 = new Student();
        initStudent(s2,"student2", 25, 60 );

        System.out.println(s1.name + " " + s1.age + " " + s1.grade);
        System.out.println(s2.name + " " + s2.age + " " + s2.grade);

    }

    //x001, x002가 넘어감
    static void printStudent(Student s) {
        System.out.println(s.name + " " + s.age + " " + s.grade);
    }

    //x001,x002 + 매개변수가 넘어감
    static void initStudent(Student s, String name, int age, int grade) {
        s.name = name;
        s.age = age;
        s.grade = grade;
    }

}
