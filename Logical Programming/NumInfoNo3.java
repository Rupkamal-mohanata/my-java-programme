import java.util.Scanner;

class NumInfoNo3{
	//main method
    public static void main(String[] args) {
        
		// variable declaration
		int num ;
		
		// created Scanner Object "scanner"
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		num = scanner.nextInt();
		
        if(num == 0){
            System.out.println("Number is Zero");
        }else if(num >0){
            System.out.println(num+" is Postive ");
        }else{
            System.out.println(num+"is Negative");
        }
    }
}