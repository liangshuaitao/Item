package abstractTest;

public class ExtendsAbstractTest extends  AbstractTests{
    private double salary; //Annual salary

    public ExtendsAbstractTest(String name, String address, int number,double
            salary) {
        super(name, address, number);
        setSalary(salary);
    }



    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double newSalary)
    {
        if(newSalary >= 0.0)
        {
            salary = newSalary;
        }
    }

    public void mailCheck()
    {
        System.out.println("mailCheck继承抽象方法 ");
        System.out.println(" mailCheck继承抽象方法 获取getName=== " + getName()
                + "    获取 salary=== " + salary);
    }


}
