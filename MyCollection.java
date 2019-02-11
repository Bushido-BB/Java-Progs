import java.util.*;
class MyCollection
{
    public static void main(String args[])
    {
        Arraylist al=new Arraylist();
        al.showSize();
        al.put("ten");
        al.put("twenty");
        al.put("thirty");
        al.put("forty");
        System.out.println("VAlue at position 1 is " + al.get(0));
        al.show();
    }
}
class Arraylist
{
    private ArrayList<String> al=new ArrayList<String>();
    int showSize()
    {
        return (al.size());
    }
    void put(String a)
    {
       if(al.add(a)){System.out.println(a+" added successfully");}
    }
    String get(int index)
    {
        return (al.get(index));
    }
    void show()
    {
        System.out.println(al);
    }
}
class Linkedlist
{
    private LinkedList<String> ll=new LinkedList<String>();
    void showSize()
    {
        System.out.println("Size:"+ll.size());
    }
    void put(String a)
    {
        if(ll.add(a)){System.out.println(a+" added successfully");}
    }
    String get(int index)
    {
        return(ll.get(index));
    }
    void show()
    {
        System.out.println(ll);
    }
}
class VEctor
{
    private Vector<String> v=new Vector<String>();
    void showSize()
    {
        System.out.println("Size:"+v.size());
    }
    void put(String a)
    {
        if(v.add(a)){System.out.println(a+" added successfully");}
    }
    String get(int index)
    {
        return(v.get(index));
    }
    void show()
    {
        System.out.println(v);
    }
}
class Hashset
{
    HashSet<String> hs=new HashSet<String>();
    void showSize()
    {
        System.out.println("Size:"+hs.size());
    }
    void put(String a)
    {
        if(hs.add(a)){System.out.println(a+" added successfully");}
    }
    String get(int index)
    {
        //return(hs.(""));
        return null;
    }
    void show()
    {
        System.out.println(hs);
    }
}
class Linkedhashset
{}
class Treeset
{}
class Hashmap
{}
class Linkedhashmap
{}