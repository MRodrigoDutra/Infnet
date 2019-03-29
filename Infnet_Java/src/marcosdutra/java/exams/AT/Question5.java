package marcosdutra.java.exams.AT;
import java.util.Scanner;

public class Question5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.println("POTENCIAÇÃO");
			System.out.println("-----------------------");
			System.out.println("Insira o valor de X: ");
			double x = input.nextDouble();
			System.out.println("Insira o valor de Y: ");
			double y = input.nextDouble();
			System.out.println("-----------------" + "\nx: " + x + "\ny: " + y + "\nResultado: "+ Math.pow(x,y)); 
		}catch (ArithmeticException e) 
		{
			System.out.println("Números inválidos! \nAmbos os números não podem ser iguais a zero.\n Insira novamente!");
		}
	}

}
