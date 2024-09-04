package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()};
        for (Animal animal : animals) {
            animalSound(animal);
        }
    }
    private static void animalSound(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소레 테스트 종료");
    }
}
