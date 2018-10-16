package abstractTest;

public abstract class AbstractTests {
    private String name;
    private String address;
    private int number;
    public AbstractTests(String name, String address, int number)
    {
        System.out.println("抽象方法");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public double computePay()
    {
        System.out.println(" 抽象类方法computePay 继承中没有声明 ");
        return 0.0;
    }
    public void mailCheck()
    {
        System.out.println(" mailcheck  抽象方法  中的name===  " + this.name
                + "   address==== " + this.address);
    }
    public String toString()
    {
        return name + " " + address + " " + number;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    public int getNumber()
    {
        return number;
    }
}
