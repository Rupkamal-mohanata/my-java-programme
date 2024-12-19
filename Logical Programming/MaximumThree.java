import java.util.Scanner;
class MaximumThree{
 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
 
  System.out.println("Enter first no.:");
  int num1 = sc.nextInt();
  System.out.println("Enter 2nd no.:");
  int num2 = sc.nextInt();
  System.out.println("Enter third no.:");
  int num3 = sc.nextInt();
  

  if(num1>num2 && num1>num3){
      System.out.println("The Max between"+num1+","+num2+" & "+num3+" is "+num1);
   }else if(num2>num1 && num2>num3){
	   System.out.println("The Max between"+num1+" , "+num2+" & "+num3+" is "+num2); 
   } else  if(num1==num2 && num1==num3){
	   System.out.println("The Three no.are  all equal ");
   }else {
	   System.out.println("The Max between"+num1+" , "+num2+" & "+num3+" is "+num3);
   }
  
  }
 }

