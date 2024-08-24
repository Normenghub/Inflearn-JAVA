package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name,age,50); // 아래 MemberConstruct 생성자로 과적시킴(OverLoading)
        // this() 규칙 -> 생성자 코드의 첫줄에만 작성 할 수 있다.
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;

    } //생성자이름 == 클래스이름
}
