import java.util.Scanner;
class MaximumTwo{
   public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
    System.out.println("Enter first no.:");
    int num1 = sc.nextInt();
    System.out.println("Enter Second No.");
    int num2 = sc.nextInt();
        
 // Logic
    if(num1>num2){
        System.out.println("Maximum No. between "+num1+ " & " +num2+" is "+ num1);
    }else{
		System.out.println("Maximum No. between " +num1+ " & " +num2+" is "+ num2);
		}
   }
}

