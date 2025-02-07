import java.util.Scanner;
class main{
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       String str=scn.nextLine();
       System.out.println("the string is : "+ str);
       int num=scn.nextInt();
       System.out.println("the number is : "+ num);
       float fnum=scn.nextFloat();
       System.out.println("the float is : "+ fnum);
       double dnum=scn.nextDouble();
       System.out.println("this is a double : "+ dnum);
    }
}