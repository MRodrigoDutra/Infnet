  import java.io.IOException;
  import java.nio.charset.Charset;
  import java.nio.file.Files;
  import java.nio.file.Path;
  import java.nio.file.Paths;
  import java.util.ArrayList;
  import java.util.List;

public class Tp3Questao1 {

	public static String inversao (String string){
		String inverso = "";
		char palavra[] = string.toCharArray();
		for (int i = palavra.length - 1; i >= 0; i--) {
			inverso = inverso + palavra[i];
		}
		return inverso;		
	}
	
	public static void main(String[] args) {
		List lines = new ArrayList();
	    Path file = Paths.get("TP3_Questão1.txt");
	    lines.add("String em ordem correta: " + "Essa questão pede que escrevamos uma string ao contrario\n" + "String em ordem inversa:" + Tp3Questao1.inversao("Essa questão pede que escrevamos uma string ao contrario"));
		
	    try {
	        Files.write(file, lines, Charset.forName("UTF-8"));
	      } catch (IOException e) {
	        e.printStackTrace();
	      }
	      
	      System.out.println("Terminamos de escrever no arquivo!");
	    }
	}


