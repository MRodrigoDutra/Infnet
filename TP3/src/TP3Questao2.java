

public class TP3Questao2 {

	public static void main(String[] args) {
		int list [] = {1,5,7,13,10,8,6}; //Lista de Entrada 
		int saida [] = new int [7];
		for (int i=0; i < list.length; i++){
				if((list[i] % 5)==0){
					saida[i] = list[i];
				}
				
				else {
					saida[i] = 0;
			    }
		System.out.println("Entrada: " + list[i]);		
		}
		System.out.println("------------------------");
		for(int j=0;j < saida.length; j++){ //loop de impressão ignorando os resultados zero
			if(saida[j]!=0){
				System.out.println("Saída: " + saida[j]);
			}else{
				continue;
			}
		}
		
			
			
			
	}	
			
}



