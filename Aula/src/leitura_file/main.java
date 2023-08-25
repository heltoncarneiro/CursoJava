package leitura_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		String pathSource = "C:\\Users\\helto\\OneDrive\\Documentos\\fileJava\\Source.csv";
		String pathSumary = "C:\\Users\\helto\\OneDrive\\Documentos\\fileJava\\out\\summary.csv";
		ArrayList<Product> listProducts = new ArrayList<>(); 
		try(BufferedReader br = new BufferedReader(new FileReader(pathSource))){
			String stringProduct = br.readLine();
			while(stringProduct != null) {
				String[] a = stringProduct.split(",");
				listProducts.add(new Product(a[0], a[1], a[2]));
				stringProduct = br.readLine();
			}
		}
		catch (IOException e) {
			e.getMessage();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathSumary))){
			for(Product p : listProducts) {
				bw.write(p.toString());
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.getMessage();
		}
	}
}
