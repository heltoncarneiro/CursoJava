package leitura_file;

import java.io.File;
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

		/*
		String path = "C:\\Users\\helto\\OneDrive\\Documentos\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String lerfile = br.readLine();
			while(lerfile != null) {
				System.out.println(lerfile);
				lerfile = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}
		*/
		
		/*
		String listaFrase [] = {"asdasdfasdfasd\n","adfssdfa\n","cxzvzxcvasdf\n"};
		String path = "C:\\Users\\helto\\OneDrive\\Documentos\\input.txt";
		// para ao inves de recriar o arquivo e acrescentar nesse aquivo BufferedWriter bw = new BufferedWriter(new FileWriter(path,true)
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String i : listaFrase) {
				bw.write(i);
				//bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		/*
		//C:\Users\helto\OneDrive\Documentos\workspace
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a pasta deseja procurar:");
		String stringPath = sc.nextLine();
		
		File path = new File(stringPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
		System.out.println(folder);
		}
		sc.close();
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a pasta deseja procurar:");
		String stringPath = sc.nextLine();
		
		File path = new File(stringPath);
		
		
		sc.close();
		
	}

}
