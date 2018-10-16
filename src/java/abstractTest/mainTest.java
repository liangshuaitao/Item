package abstractTest;

public class mainTest  {
    public static void main(String[] args) {
       ExtendsAbstractTest e = new ExtendsAbstractTest(" 继承 ","abstract",3,200.00);

        AbstractTests a = new ExtendsAbstractTest(" 抽象 ","tests",4,300.00);

        System.out.println("继承抽象方法调用mailcheck");
       e.mailCheck();

        System.out.println("\n  方法调用computePay()");
        //a.mailCheck();
        e.computePay();

    }
}
