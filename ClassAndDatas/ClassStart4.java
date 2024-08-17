package ClassAndDatas;


public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "노신";
        student1.age = 25;
        student1.grade = 98;

        Student student2 = new Student();
        student2.name = "James";
        student2.age = 24;
        student2.grade = 88;

        Student[] students = {student1, student2};
        System.out.println("이름: " + students[0].name);

    }

}
