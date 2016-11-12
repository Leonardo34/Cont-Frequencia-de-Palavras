import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainClass{
	public static void main (String[] args) {
		System.out.println("Contador de Frequência de palavras em texto");
		System.out.println("Autor: Leonardo Broch de Morais");
		System.out.println("Contato: leo_broch@hotmail.com");
		System.out.println("Digite o diretório do arquivo: ");
		String diretorio = new Scanner (System.in).next();
		
		if (Files.exists(Paths.get(diretorio))) {
			
		}
		else {
			System.out.println("Diretorio Incorreto");
		}
	}
}
