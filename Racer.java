import java.util.*;
class Racer
{
  public static void main(String args[])
   {
       float r1,r2,r3,r4,r5,R;
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter Five Racers speeds in the race");
       r1=sc.nextFloat();
       r2=sc.nextFloat();
       r3=sc.nextFloat();
       r4=sc.nextFloat();
       r5=sc.nextFloat();

       R=(r1+r2+r3+r4+r5)/5;
       System.out.println("AVERAGE SPEED: "+R);

  if(r1>R)
         System.out.println(r1);
  if(r2>R)
         System.out.println(r2);
  if(r3>R)
         System.out.println(r3);
  if(r4>R)
         System.out.println(r4);
  if(r5>R)
         System.out.println(r5);


   }
}