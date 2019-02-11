class test1
{
    static 
    {
        System.out.println("Hello2");
    }
    static 
    {
        System.out.println("Hello");
    }
    
    static int x=10;
    static int y;
    int z=0;
    public static void main(String args[])
    {
        test1 t1=new test1();
        int z;test2();
        System.out.println(z=0);
    }
    test1()
    {
        System.out.println("Again");
        this.x=100;
        test2();
    }
    static void test2()
    {
    //    z=10;
    }
    void etc(){
        x=91;
        z=10;
    }
}