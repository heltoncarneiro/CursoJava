package listaEncadeada;
public class Lista {
	private No ref;

	public No getRef() {
		return ref;
	}

	public void setRef(No ref) {
		this.ref = ref;
	}
	public Lista() {
		ref = null;
	}
	public void Inserir(String info) {
		ref = new No(info, ref);
	}
	public void Imprimir(){
		if(ref != null) {
			System.out.print("[");
			for(No i = ref; i != null; i = i.getProx()) {
				System.out.print(i.getInfo());
				if(i.getProx() != null) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}else {
			System.out.println("[]");;
		}
	}
	public void deletar(String info) {
		if(ref.getInfo().equals(info)) {
			ref = ref.getProx();
			return ;
		}
		for(No i = ref; i!= null; i = i.getProx()) {
			if(i.getProx() != null && i.getProx().getInfo().equals(info)) {
				i.setProx(i.getProx().getProx());
				return ;
			}
		}
		System.out.println(info+ " ,não foi deletado pois o elemento não existe");
	}
	public boolean procurar(String info) {
		for(No i = ref; i!= null;  i = i.getProx()) {
			if(i.getInfo().equals(info)) {
				return true;
			}
		}
		return false;
	}
	
}
