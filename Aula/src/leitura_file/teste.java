package leitura_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  
		 
		File file = new File("C:\\Users\\helto\\OneDrive\\Documentos\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()){
			System.out.println(sc.nextLine()); //Ler a partir da primeira linha e verifica a cada while
												//se tem a proxima linha, para não tentar ler uma linha que
												//que não existe
			}
			
		}
		catch(IOException e){
			System.out.println("Erro: "+ e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close(); //apenas se "sc" tiver algum conteudo (Se  o local existe) e deu algum erro
			}				// ele fecha o "sc", apenas se ele foi instaciado
		}
		
		
		*/
		
		
		String path = "C:\\Users\\helto\\OneDrive\\Documentos\\in.txt";
		FileReader fr = null;
		BufferedReader bf = null;
		try {
			fr = new FileReader(path); //instanciação do fr a partir local do arquivo
			bf = new BufferedReader(fr); // instaciação do bf é feita a partir de um FileReader já instaciado anteriomente
			// bf = new BufferedReader(FileReader(path)); outra maneira de instanciar, no caso diretamente
			String lerfile = bf.readLine();
			while(lerfile != null) {
				System.out.println(lerfile);
				lerfile = bf.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
		finally {
			if(fr != null || bf != null) {
				bf.close();
				fr.close();
			}
		}
	}

}
