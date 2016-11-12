import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ContaFrequencia {
	public static Map<String, Integer> contaFrequencia (String diretorio) throws Exception {
		try {
			List<String> linhas = Files.readAllLines(Paths.get(diretorio));
			Map<String, Integer> palavrasTexto = analyser(linhas);
			return palavrasTexto;
		}
		catch (IOException e) {
			System.out.println("Erro");
			throw new Exception (e.getMessage());
		}
	}
	
	private static Map<String, Integer> analyser (List<String> linhas) {
		
		Map<String, Integer> palavrasTexto = new HashMap<>();
		
		for (String linha : linhas) {
			String[] palavras = linha.split(" ");
			
			for (int i = 0; i < palavras.length; i++) {
				String palavra = palavras[i];
				
				if (!palavrasTexto.containsKey(palavra)) {
					palavrasTexto.put(palavra, 1);
				}
				else {
					palavrasTexto.put(palavra, palavrasTexto.get(palavra) + 1);
				}
			}
		}
		return palavrasTexto;
	}
}
