import java.util.Scanner;
class Stack
{
    String stack[];
    int stack_pointer=-1;
    int size;
    Stack(int x)
    {
        this.size=x;
        stack=new String[size];
    }
    void push(String value)
    {
        if(stack_pointer<size-1)
        {
            stack[++stack_pointer]=value;
        }
        else
        {
            System.out.println("\nOVERFLOW");
        }
        show();
    }
    String pop()
    {
        if(stack_pointer>-1)
        {
            String value=stack[stack_pointer--];
            show();
            return value;
        }
        else
        {
            System.out.println("\nUNDEERFLOW");
            show();
            return null;
        }
    }
    void show()
    {   
        int i=0;
        System.out.println("\nStack: ");
        for(String value:stack)
        {
            if(i>stack_pointer)break;
            System.out.print(value+" ");
            i++;
        }
        System.out.println();
    }
    public static void main()
    {
        System.out.println("Enter Size of Stack:");
        Stack s1=new Stack(new Scanner(System.in).nextInt());
        Label:
        while(true)
        {
            System.out.println("1:push   2:pop  ->");
            switch(new Scanner(System.in).nextInt())
            {
                case 1:
                    System.out.println("Enter value:");
                    s1.push(new Scanner(System.in).nextLine());
                    break;
                case 2:
                    System.out.println(s1.pop()+" is popped");
                    break;
                default:
                    System.exit(0);
                    break Label;
            }
        }
    }
}