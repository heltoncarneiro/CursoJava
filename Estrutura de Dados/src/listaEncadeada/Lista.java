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
	public void deletar(int apagar) {
		if(apagar <= 0) {
			ref = ref.getProx();
		}else {
			for(No i = ref; i != null; i = i.getProx()) {
				apagar--;
			if(apagar == 0) {
				i.setProx(i.getProx().getProx());	
				}
			}
		}
		
	}
}
