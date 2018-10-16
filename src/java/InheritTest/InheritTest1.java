package InheritTest;

import com.lst.test.InheritTest;

//如果父类有无参构造器，则在子类的构造器中用super关键字调用父类构造器不是必须的，
// 如果没有使用super关键字，系统会自动调用父类的无参构造器。
public class InheritTest1 extends ConstructorTest1 {
   public InheritTest1(){

   }
}
