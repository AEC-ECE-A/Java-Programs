import java.util.*;
class Employee
{
   public static void main(String args[])
   {
     int empid;
     String empname,desg,company;
     float salary; 

     Scanner sc=new Scanner(System.in);

     System.out.println("Enter an Employee Information");
     System.out.println("Enter Employee ID:");
     empid=sc.nextInt();
     sc.nextLine();
     System.out.println("Enter Employee Name");
     empname=sc.nextLine();
     System.out.println("Enter Employee Desg");
     desg=sc.nextLine();
     System.out.println("Enter Employee Salary");
     salary=sc.nextFloat(); 
     sc.nextLine();
     System.out.println("Enter Company Name");
     company=sc.nextLine();
  
     System.out.println("===============================");
     System.out.println("Employee Information");    
     System.out.println("EMPLOYEE ID: "+empid);
     System.out.println("EMPLOYEE NAME: "+empname);
     System.out.println("EMPLOYEE DESG: "+desg);
     System.out.println("EMPLOYEE SALARY: "+salary);
     System.out.println("COMPANY NAME: "+company);
     System.out.println("===============================");

   }
}