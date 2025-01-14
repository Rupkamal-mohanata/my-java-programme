import java.util.Scanner;
class DivByNo4{
   public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
    System.out.println("Enter  no.:");
    int num = sc.nextInt();

    if (num%5==0 && num%11==0){
        System.out.println("divisible by 5 & 11");   
    }
    else if (num%5==0){
        System.out.println("  divisible by 5 "); 
    }
    else if (num%11==0){
        System.out.println("  divisible by 11 "); 
    }
    else{
        System.out.println("None");
    }

   }

}

