package marcosdutra.java.exams.AT;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;


public class Question6 {

	public static void main(String[] args) {
		try{
		//System.out.println("It works");
			//arquivo tem 16 números desordenados de 0 a 15
			
			String linha = "";
			String divisorNum = ",";
			BufferedReader file = new BufferedReader(new FileReader("/home/cloudera/numeros.txt"));
			String Str;
			String ArqLine [] = new String[1000];
			String  numbers[] = new String[1000];
			int      sorter[] = new int [1000];
			while((Str = file.readLine())!= null)
			{
				for(int i=0; i <= numbers.length; i++)
				{
					//ArqLine = 
							System.out.println(Str.split(","));
					//numbers[i] = ArqLine[i];
					//sorter[i] = Integer.parseInt(numbers[i]);
				}
				for(int j=0;j<=sorter.length;j++)
				{
					for(int k=0; k <= sorter.length;k++)
					{
						if(sorter[j] > sorter[k])
							{
								int maiorValor = sorter[j];
								sorter[j] = sorter[k];
								sorter[k] = maiorValor;
							}
					}
					
				}
			
			//Scanner scan = new Scanner (new FileReader("/home/cloudera/numeros.txt")).useDelimiter(",||\\n||\\"); //Usando delimitadores para ler o arquivo
			
			for(int a=0;a<=15;a++){
				System.out.println("Vetor ordenado: " + sorter[a]);
			}
		
		}
			}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("Falha ao ler o arquivo!!");
		}
		

	}

}
