package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        animalPrint(dog);
        animalPrint(cat);
        animalPrint(caw);
    }

    public static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 울음소리 시작");
        animal.sound();;
        System.out.println("동물 울음소리 종료");
    }

    public static void moveAnimal(AbstractAnimal animal){
        System.out.println("동물 이동소리 시작");
        animal.move();
        System.out.println("동물 이동소리 종료");
    }

    public static void animalPrint(AbstractAnimal animal){
        soundAnimal(animal);
        moveAnimal(animal);
    }
}
