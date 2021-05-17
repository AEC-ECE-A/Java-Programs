import java.util.*;
class SimpleInterest
{
  public static void main(String args[])
   {
      int P,T;
      float R,I;

      Scanner sc=new Scanner(System.in);

      System.out.println("Enter Principle, Time and Rate of Interest");
      P=sc.nextInt();
      T=sc.nextInt();
      R=sc.nextFloat();

      I=(P*T*R)/100;

      System.out.println("PRINCIPLE AMOUNT : "+P);
      System.out.println("TIME : "+T);
      System.out.println("RATE OF INTEREST : "+R);

      System.out.println("SIMPLE INTEREST : "+I);      


   }

}