package marcosdutra.java.exams.AT;

import java.io.*;


public class QuestionSix {
	public static void main(String [] args) 
	{
		String csvArquivo = "/home/cloudera/numeros.txt";
		String separadorCampo = ",";
		String linha = "";
		BufferedReader arquivo = null;
		
		try {
			
			arquivo = new BufferedReader (new FileReader (csvArquivo));
			while((linha = arquivo.readLine())!= null)
			{
				String [] numbers = linha.split(separadorCampo);
				int sorter[] = new int[numbers.length];
				
				System.out.println("Números do arquivo: \n"  +
								   numbers[1] + " " + numbers[2] + " " + numbers[3] + " " + numbers[4] + " " + numbers[5] + " " + numbers[6] + " " +
						           numbers[7] + " " + numbers[8] + " " + numbers[9] + " " + numbers[10] + " " + numbers[11] + " " + numbers[12] + " " +
						           numbers[13]  + " " + numbers[14] + " " + numbers[15]);
			
				
				for(int b=0; b <= 15;b++) //Leva os números de um vetor String para um Inteiro
				{	
				sorter[b] = Integer.parseInt(numbers[b]);
				}
				
				for(int j=0;j<=15;j++) //Estrutura de ordenação dos números
				{
					for(int k=0; k <= 15;k++)
					{
						if(sorter[j] < sorter[k])
							{
								int maiorValor = sorter[j];
								sorter[j] = sorter[k];
								sorter[k] = maiorValor;
							}
					}
					
				}
				
				System.out.println("Números Ordenados: \n"  +
						   sorter[1] + " " + sorter[2] + " " + sorter[3] + " " + sorter[4] + " " + sorter[5] + " " + sorter[6] + " " +
				           sorter[7] + " " + sorter[8] + " " + sorter[9] + " " + sorter[10] + " " + sorter[11] + " " + sorter[12] + " " +
				           sorter[13]  + " " + sorter[14] + " " + sorter[15]);
			}
			
		
		
		
		
		
	}catch(FileNotFoundException e){
		System.out.println("Arquivo não encontrado: \n" + e.getMessage());
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("IndexOutOfBoundsException: \n" + e.getMessage());
	}catch(IOException e) {
		System.out.println("IO Erro: \n" + e.getMessage());
	}finally {
		if(arquivo != null){
			try {
				arquivo.close();
			}catch (IOException e){
				System.out.println("IO Erro: \n" + e.getMessage());
			}
		}
	}
}
}