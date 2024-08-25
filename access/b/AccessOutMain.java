package access.b;

import access.a.AccessData;

public class AccessOutMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        // 다른 팩키지 default 호출 불가.
        //data.defaultField = 2;
        //data.defaultMethod();

        //private 호출 불가.
        //data.privateField =3;
        //data.privateMethod();

        data.innerAccess(); // 호출시 innerAccess 자신의 private필드 사용 가능

    }
}
