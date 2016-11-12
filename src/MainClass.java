import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;

public class MainClass{
	
	public static void main (String[] args) throws Exception {
		System.out.println("Contador de Frequência de palavras em texto");
		System.out.println("Autor: Leonardo Broch de Morais");
		System.out.println("Contato: leo_broch@hotmail.com");
		System.out.println("Digite o diretório do arquivo: ");
		String diretorio = new Scanner (System.in).next();
		
		if (Files.exists(Paths.get(diretorio))) {
			Map<String, Integer> palavrasTexto = ContaFrequencia.contaFrequencia(diretorio);
			ContaFrequencia.printPalavrasTexto(palavrasTexto);
		}
		else {
			System.out.println("Diretorio Incorreto");
		}
	}
}
