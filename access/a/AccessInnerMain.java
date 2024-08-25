package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.defaultMethod();

        //data.privateField =3;
        //data.privateMethod();

        data.innerAccess(); // 호출시 innerAccess 자신의 private필드 사용 가능

    }
}
