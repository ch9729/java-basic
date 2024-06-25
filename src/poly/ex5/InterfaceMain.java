package poly.ex5;

import poly.ex2.Animal;

public class InterfaceMain {

    public static void main(String[] args) {

        //인터페이스 생성불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();


        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 울음소리 시작");
        animal.sound();
        System.out.println("동물 울음소리 종료");


    }
}
