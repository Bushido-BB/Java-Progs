class test7{
    public static void main(String args[]){
        test7 ob1=new test7();
        final int primitive=10;
        Integer user_defined=10;
        System.out.println(primitive +" "+user_defined);
        ob1.proof(primitive,user_defined);
        System.out.println(primitive +" "+user_defined);
        System.out.println(ob1);
    }
    void proof(int x, Integer y){
        x++;
        y++;
        System.out.println(x+" "+y);
    }
}