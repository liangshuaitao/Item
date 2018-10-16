package InheritTest;

import com.lst.test.InheritTest;

//覆盖只针对非静态方法（动态方法不能被继承，所以就存在覆盖一说了），而隐藏是针对成员变量和静态方法的。
// 这2者之间的区别是：覆盖受RTTI（Runtime type  identification）约束的，而隐藏却不受该约束。
// 也就是说只有覆盖方法才会进行动态绑定，而隐藏是不会发生动态绑定的。在Java中，除了static方法和final方法，
// 其他所有的方法都是动态绑定。因此，就会出现上面的输出结果。
public class ShapeTest {

        public static void main(String[] args)  {
            Shape shape = new Circle();
            System.out.println(shape.name);
            shape.printType();
            shape.printName();
        }
    }

    class Shape {
        public String name = "shape";

        public Shape(){
            System.out.println("shape constructor");
        }

        public void printType() {
            System.out.println("this is shape");
        }

        public static void printName() {
            System.out.println("shape");
        }
    }

    class Circle extends Shape {
        public String name = "circle";

        public Circle() {
            System.out.println("circle constructor");
        }
        //覆盖父类中的该方法
        public void printType() {
            System.out.println("this is circle");
        }
        //
        public static void printName() {
            System.out.println("circle");
        }
    }