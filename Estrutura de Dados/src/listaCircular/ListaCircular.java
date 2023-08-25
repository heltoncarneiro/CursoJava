package listaCircular;


public class ListaCircular {
	private No ref;

	public No getRef() {
		return ref;
	}

	public void setRef(No no) {
		this.ref = no;
	}

	public ListaCircular() {
		super();
		this.ref = null;
	}
	public void inserir(int info) {
		No ultimo = new No(info, null);
		if(ref == null) {
			ultimo.setProx(ultimo);
		}else {
			ultimo.setProx(ref.getProx());
			ref.setProx(ultimo);	
		}
		ref = ultimo;
	}
	public void deletar(int deletar){
		if(ref != ref.getProx()) {
			for(No i = ref.getProx(); i != ref; i = i.getProx()) {
				if(i == ref.getProx() && i.getInfo() == deletar) {
					ref.setProx(i.getProx());
					break;
				}else if (i.getProx().getInfo() == deletar) {
					if(ref == i.getProx()) {
						ref = i;
					}
					i.setProx(i.getProx().getProx());
					break;
				}
			}
		}else if(deletar == ref.getInfo()){
			ref = null;
		}
	}
	public void imprimir() {
		System.out.print("[");
		if(ref != null) {
			for(No i = ref.getProx(); i != ref; i = i.getProx()) {
				System.out.print(i.getInfo() + ", " );
			}
			System.out.println(ref.getInfo()+"]");
		}else {
			System.out.println("]");
		}
	}
	
}
