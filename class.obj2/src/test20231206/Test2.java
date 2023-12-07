package test20231206;

class Money{
    //浅拷贝
    public double money=12.5;
}
class Person implements Cloneable {
      //想访问cloneable的话摁住command然后点进去 cloneable接口是空的，接口是空的证明（空接口/标记接口）如果一个
    //类实现了这个空接口/标记接口 那么证明当前类是可以被克隆的
    public String name;
    public Money m;

    public Person(String name) {
        this.name = name;
         m=new Money();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1=new Person("姚长坤");
        //通过person这个引用来克隆一个对象
        Person person2=(Person) person1.clone();
        //在 Java 中，clone() 方法的返回类型是 Object，而不是具体的类类型，因此要强制转换为Person类型向下转型
        System.out.println(person2.name);
        System.out.println("修改之前："+person1.m.money);
        System.out.println("修改之前："+person2.m.money);
        person2.m.money=99.99;
        System.out.println("修改之后："+person1.m.money);
        System.out.println("修改之后："+person2.m.money);


    }
}
