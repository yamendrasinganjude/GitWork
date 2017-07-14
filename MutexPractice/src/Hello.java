class Hello
{
    int addNumber(int num1,int num2)
    {
        return num1 + num2;
    }
    int subNumber(int num1,int num2)
    {
        return num1 - num2;
    }
    int divNumber(int num1,int num2)
    {
        return num1/num2;
    }
    int mulNumber(int num1,int num2)
    {
        return num1*num2;
    }
    public static void main(String[] args)
    {
        Hello hi=new Hello();
        int Addition = hi.addNumber(15,60);
        System.out.println("Addition is "+Addition);
        int substraction = hi.subNumber(15,14);
        System.out.println("Substraction is "+substraction);
        int division = hi.divNumber(10,5);
        System.out.println("Division is "+division);
        int multiplication = hi.mulNumber(5,8);
        System.out.println("Multiplication is "+multiplication);
    }
}