package extends1.super1;

public class Child extends Parent{
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value = " + this.value);
        System.out.println("super value = " + super.value);

        this.hello();
        super.hello();
    }

    // this 자신의 레퍼런스 값( 생략가능 )
    // super 부모의 레퍼런스 값

}
