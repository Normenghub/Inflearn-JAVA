package ClassAndDatas;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] students = {"학생1", "학생2"};
        int[] studentsAge = {15,16};
        int[] studentsGrade = {80,90};
        for(int i = 0; i<students.length; i++){
            System.out.println("이름: " + students[i] + " 나이:" + studentsAge[i] + " 성적: " + studentsGrade[i]);
        }


    }
}
