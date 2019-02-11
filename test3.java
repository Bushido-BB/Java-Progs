class test3     //Order of Execution: static finalize constructor etc
{
    public static void main(String a[])
    {
        System.out.println("Before Object");
        test3 t;
        System.out.println("Before Object Initialization");
        t=new test3();
        System.out.println("After Initialization");
    }
    test3()
    {
        System.out.println("Constructor");
    }
    //test3()
    {
        System.out.println("Destructor");
    }
    protected void finalize()
    {   
        System.out.println("Finalize");
    }
    static
    {
        System.out.println("Static Block");
    }
}