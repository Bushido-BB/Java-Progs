class test6 //inheritance and references
{
    public static void main(String strs[])
    {
      Super S=new Super();
      Sub s=new Sub();
      S=s;//superclass refernce can be assigned a subclass refernce
      s=(Sub)S;
      //s=S; Not the other way around
    }
}
class Super
{
    int x;
    void func()
    {}
}
class Sub extends Super
{
    int y;
    void meth()
    {}
}