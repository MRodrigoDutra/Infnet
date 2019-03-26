
public class TP3Questao2 {

	public static void main(String[] args) {
		int list [] = {1,5,7,13,10,8,6}; //Lista de Entrada 
		String saida [] = new String [7];
		//System.out.println ("Hello mother fuckers");
		for (int i=0; i < list.length; i++){
			if((list[i] % 5)==0){
				saida[i] = Integer.toString(list[i]);				
			}else {
				saida[i] = " ";
			}
			
			System.out.println("Entrada: "+ list[i] + "      Saída: " + saida[i] );
		}
		
	}

}
