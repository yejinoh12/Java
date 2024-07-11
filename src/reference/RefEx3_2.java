package reference;

public class RefEx3_2 {
    public static void main(String[] args) {

        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1: " + student1);

        Student student2 = createStudent("학생2", 16, 80);
        System.out.println("student2: " + student2);


    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); // 생성
        System.out.println("student: " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // 참조값 반환
    }


    //x001, x002가 넘어감
    static void printStudent(Student s) {
        System.out.println(s.name + " " + s.age + " " + s.grade);
    }

}

