package var;


public class Method1 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1",25,90);
        Student student2 = createStudent("학생2",19,80);
        printStudent(student1);
        printStudent(student2);

    }
    static void printStudent(Student student){
        System.out.println("이름 :" + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name ;
        student.age = age;
        student.grade = grade;
        return student;
    }
}
