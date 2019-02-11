import java.util.Scanner;
class Pattern{
    public static void main(String args[]){
        int x=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x=Math.abs(x-1));
            }
            System.out.println();
        }
        new Scanner(System.in).nextLine();
    }
}