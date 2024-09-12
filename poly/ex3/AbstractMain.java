package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundPrint(dog);
        soundPrint(cat);
        soundPrint(caw);
    }

    public static void soundPrint(AbstractAnimal animal){
        System.out.println("동물 울음소리 시작");
        animal.sound();
        animal.move();
        System.out.println("동물 울음소리 종료");
    }
}
