package Task1;
import java.util.Scanner;

public class Calculator {
	
   public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enhanced Console Based Calculator");
	  System.out.print("Enter the number:");
	  double num1 = sc.nextDouble();
	  System.out.println("Enter the operation(+,-,*,/,%,sqrt,log,sin,cos,tan,cbrt,square,cube):");
	  String operation = sc.next() ;
	  double result;
	  
	  switch(operation) {
	  
	  case "+":
		  System.out.print("Enter the second number:");
		  double num2 = sc.nextDouble();
		  result = num1+num2;
		  break;
		  
	  case "-":
		  System.out.print("Enter the second number:");
		  num2 = sc.nextDouble();
		  result = num1-num2;
		  break;
		  
	  case "*":
		  System.out.println("Enter the second number:");
		   num2 = sc.nextDouble();
		  result = num1*num2;
		  break;
		  
	  case "/":
		  System.out.print("Enter the second number");
		  num2 = sc.nextDouble();
		  
		  if(num2==0) {
			  System.out.print("Erro: Division by zero");
			  return;
		  }
		  result= num1/num2;
		  break;
		  
	  case "sqrt":
		  result=Math.sqrt(num1);
		  break;
		  
	  case "log":
		  result=Math.log(num1);
		  break;
		  
	  case "sin":
		  result=Math.sin(Math.toRadians(num1));
		  break;
		  
	  case "cos":
		  result=Math.cos(Math.toRadians(num1));
		  break;
		  
	  case "tan":
		  result=Math.tan(Math.toRadians(num1));;
		  break;
		  
	  case "cbrt":
		  result=Math.cbrt(num1);
		  break;
		  
	  case "square":
		  result=Math.pow(num1,2);
		  break;
		  
	  case "cube":
		  result=Math.pow(num1,3);
		  break;
	  
		  default:
			  System.out.println("Invalid Operation");
			  return;
	 }
	  System.out.println("Result:" +result);
	  sc.close();
   }
	

}
