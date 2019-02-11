class test2 //NESTED CLASSES
{
    static int x;
    int y;
    static Sub1 sub1=new Sub1();
    Sub2 sub2=new Sub2();
    test2()
    {
        Sub1 s1=new Sub1();
        Sub2 s2=new Sub2();
    }
    static void sayHi()
    {
        System.out.println("Hello");
    }
    void sayBye()
    {
        System.out.println("Bye Bye");
    }
    static class Sub1
    {
        int x=10;
        Sub1()
        {
            System.out.println("Static nested class");
        }
    }
    class Sub2
    {
        int y=20;
        Sub2()
        {
            System.out.println("Inner nested class");
        }
    }
    public static void main(String args[])
    {
        test2 array[]=new test2[5];
        array[0].sayHi();
        test2.sayHi();
        array[0]=new test2();
        array[0].sayBye();
        System.out.println(array[0].sub1.x);
        System.out.println(array[0].sub2.y);
    }
}