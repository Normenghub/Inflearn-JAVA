package classanddatas;


public class ClassStart5 {
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
        for(int i = 0; i < students.length; i++){
            System.out.println("학생: " + students[i].name + " 나이: " + students[i].age );
        }
        //Same Way

        for (Student s : students){
            System.out.println("학생: " + s.name + " 나이: " + s.age );
        }


    }

}
