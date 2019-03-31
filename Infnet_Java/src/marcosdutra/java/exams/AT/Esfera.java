package marcosdutra.java.exams.AT;

import java.util.Scanner;

public class Esfera {

	public final double pi = 3.14159;
	public double raio;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cálculo da área e do volume de uma esfera");
		System.out.println("------------------------------------------");
		System.out.println("Insira o valor do raio");
		Esfera esf = new Esfera();
		esf.setRaio(scan.nextDouble());
		System.out.println("O volume da esfera é: " + esf.volume() +" m³" + "\n" + "A área da esfera é: " + esf.area()+" m²" );
		scan.close();
	}
	public  double getRaio(){
		return raio;
	}
	public void setRaio(double raio)
	{
		this.raio = raio;
	}
	public double volume()
	{
		double V = (4 * pi * Math.pow(getRaio(),3))/3;
		return V;
	}
	public double area()
	{
		double A = 4 * pi * Math.pow(getRaio(), 2);
		return A;
	}
	
}
