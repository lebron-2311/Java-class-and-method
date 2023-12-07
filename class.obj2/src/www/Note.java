package www;
import static java.lang.Math.*;
import static java.lang.System.*;
public class Note {
    public static void staticMethod() {
        // 静态方法的实现
        out.println("这是静态方法");
    }

    public static void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Note.staticMethod(); // 调用静态方法，使用类名

        Note obj = new Note(); // 创建对象实例

        obj.staticMethod(); // 通过对象实例调用静态方法（不推荐，容易产生误导）

        Note.add(5, 10); // 调用add方法，并传递参数
    }
 //   public static void add(int a,int b) {
 //        int c=0;
 //        c=a+b;
 //        out.println(c);
 //    }
    public static void main4(String[] args) {
        Note.add(1,1);
    }

    public static void main3(String[] args) {
        int a=10;
        out.println(a);
    }
    public static void main2(String[] args) {
        int a = 10;
        double b = sqrt(a); // 使用Math类的sqrt()方法计算a的平方根
        System.out.println(b);
    }
    public static void main1(String[] args) {
        int a=10;
        double  b= Math.pow(a,2);
        System.out.println(b);

    }
}
