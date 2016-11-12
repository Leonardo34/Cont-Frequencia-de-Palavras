import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;


public class ContaFrequencia {
	public static Map<String, Integer> contaFrequencia (String diretorio) throws Exception {
		try {
			List<String> linhas = Files.readAllLines(Paths.get(diretorio));
		}
		catch (IOException e) {
			System.out.println("Erro");
			throw new Exception (e.getMessage());
		}
		return null;
	}
	
	private static Map<String, Integer> analyser (List<String> linhas) {
		return null;
	}
}
