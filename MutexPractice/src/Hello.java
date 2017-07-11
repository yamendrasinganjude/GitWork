class Hello
{
    int addNumber(int num1,int num2)
    {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Hello hi=new Hello();
        int Addition = hi.addNumber(15,60);
        System.out.println("Addition is "+Addition);
    }
}