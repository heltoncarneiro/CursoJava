package arvoreBinaria;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArvoreBinaria arvore = new ArvoreBinaria("A", new ArvoreBinaria("B", new ArvoreBinaria("C"), new ArvoreBinaria("D")), new ArvoreBinaria("E", null, new ArvoreBinaria("F")));
		System.out.println(arvore.preOrder());
		System.out.println(arvore.emOrder());
		System.out.println(arvore.posOrder());
	}

}
