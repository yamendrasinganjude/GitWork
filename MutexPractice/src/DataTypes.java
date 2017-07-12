class DataTypes
{
   // int number1,number2;
    //double number3,number4;
    //float number5,number6;
    static int count;
    public int intMultiply(int number1,int number2)
    {
        return number1*number2;
    }
    public float floatMultiply(float number1,float number2)
    {
        return number1*number2;
    }
    public double doubleMultiply(double number1,double number2)
    {
        return number1*number2;
    }
    public void count()
    {
        count++;
    }
    public static void main(String[] args)
    {
    DataTypes data = new DataTypes();
    int intMultiply = data.intMultiply(14,25);
    data.count();
    float floatMultiply = data.floatMultiply(14,3);
    data.count();
    double doubleDivision = data.doubleMultiply(15425,5);
    data.count();
    System.out.println("Multiplying is "+intMultiply);
    System.out.println("Multiplying is "+floatMultiply);
    System.out.println("Multiplying is "+doubleDivision);
    System.out.println("All operation are Performed : "+count);
    }
}
