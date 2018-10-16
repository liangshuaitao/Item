package InheritTest;

public class InheritTest extends ConstructorTest {
    //子类是不能够继承父类的构造器，但是要注意的是，如果父类的构造器都是带有参数的，
    //则必须在子类的构造器中显示地通过super关键字调用父类的构造器并配以适当的参数列表。
    public InheritTest(String name) {
        super(name);
    }
}
