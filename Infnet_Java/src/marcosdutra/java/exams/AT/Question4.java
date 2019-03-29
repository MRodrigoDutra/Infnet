package marcosdutra.java.exams.AT;


public class Question4 {

	public static void main(String[] args) {
		Question4 fat = new Question4();
		for (int i=0 ;i<=20 ;i++)                //Estrutura de repetição iterativa para inserir os 20 primeiros números e calcular os seus fatoriais
		{ 
			System.out.println( i + "! : "+ fat.fatorial(i));
			
		}
	}

	public long fatorial (int number){ 
		if(number == 0)
		{
			return 1;
		}
		else
		{
			return number * this.fatorial(number - 1);
		}
		
	}
	
}