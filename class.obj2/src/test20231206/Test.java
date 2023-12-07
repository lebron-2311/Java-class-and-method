package test20231206;

class Animal
{
    public String name;
    public int age;
    public String color;
    public void eat()
    {
        System.out.println(this.name+" 正在吃.... ");
    }
}

class Dog extends Animal{


    public void barks()
    {
        System.out.println(this.name+" 正在叫.... ");
    }

}
class Cat extends Animal{

    public void miaomiao()
    {
        System.out.println(this.name+" 正在喵喵叫.... ");
    }

}
public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="旺财";
        dog.eat();
        dog.barks();
        Cat cat=new Cat();
        cat.name="饺子";
        cat.miaomiao();
    }
}
