class test5     //VARARGS
{
    void sum(double ...values)
    {
        double s=0;
        System.out.print("Sum of ");
        for(double x:values)
        {
            System.out.print(x+" ");
            s+=x;
        }
        System.out.println("is "+s);
    }
    /*void sum2(int x, double ...values,int y, int ...values2)
    {
        
    }
    ALSO VARARGS METHODS CAN BE OVERLOADED
    */
    public static void main(String args[])
    {
        test5 t=new test5();
        t.sum();
        t.sum(10,20,30,40,50);
        t.sum(10);
    }
}