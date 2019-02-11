class test4     //STRINGS
{
    public static void main(String a[])
    {
        String str="Hello";
        str=str+"bye"; //Immutable
        String str2="Bye";
        str=str2;
        str2="ByeBye";
        System.out.println(str+"   "+str2);
        /*
         * str contains "Bye" at line 8
         * since on execution, str="Bye" and str2="ByeBye"
         * and neither string is not refered to the other
         * therefore they do not refer to same object
         * ultimately str does not seems to be immutable
        */
       str2="Bye";
       if(str==str2)
       {
           System.out.println("str==str2");
           /*
            * Since the condition return true 
            * strings voilate == operation followed by other objects
            * Or we can say Strings overload == operator
            */
       }
       else
       {
           System.out.println("str!=str2");
       }
       String str3=str;
       if(str==str3)
       {
           System.out.println("str==str3");
       }
       else
       {
           System.out.println("str!=str3");
       }
       
       test4 t1=new test4();
       test4 t2=new test4();
       if(t1==t2)
       {
           System.out.println("t1==t2");
       }
       else
       {
           System.out.println("t1!=t2");
       }
    }
}