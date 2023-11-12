package arvoreAvl;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVL avl = new AVL(10);
		avl.insere(5);
		avl.insere(16);
		avl.insere(1);
		avl.insere(7);
		avl.insere(20);
		avl.remove(16);
		avl.remove(20);
		System.out.println(avl.getTree().preOrder());
	}

}
