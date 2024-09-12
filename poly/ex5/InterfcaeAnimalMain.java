package poly.ex5;

public class InterfcaeAnimalMain {
    public static void main(String[] args) {

        //인터페스 생성 불가
        // InterfaceAnimal animal = new InterfaceAnimal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


        printAnimal(dog);
        printAnimal(cat);
        printAnimal(caw);



    }

    public static void animalsound(InterfaceAnimal animal){
        System.out.println("동물 울음소리 시작");
        animal.sound();
        System.out.println("동물 울음소리 종료");
    }
    public static void animalMove(InterfaceAnimal animal){
        System.out.println("동물 이동소리 시작");
        animal.move();
        System.out.println("동물 이동소리 종료");
    }

    static void printAnimal(InterfaceAnimal animal){
        animalsound(animal);
        animalMove(animal);
    }
}
