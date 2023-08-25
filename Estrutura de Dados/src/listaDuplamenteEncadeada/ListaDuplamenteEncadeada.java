package listaDuplamenteEncadeada;
public class ListaDuplamenteEncadeada {
	private No ref; 

	public No getRef() {
		return ref;
	}

	public void setRef(No ref) {
		this.ref = ref;
	}
	public ListaDuplamenteEncadeada() { //construtor padr�o da lista
		ref = null;
	}
	public void inserir(int info) { //metodo inserir que insere elementos na lista em ordem crescente
		if(ref == null) { //Se a lista � nula ele insere esse primeiro elemento atualizando o ref.
			ref = new No(info, null, null);
		}else if (ref != null) { //Se a lista n�o for nula, ele entra nesse caso para ser inserido em ordem crecente
			No refno = ref; //Uso de uma variavel para navegar nos valores da lista
			do {// uso do while para varrer lista
				if(refno.getInfo() > info) {//verificador para achar quando a informa��o do refno � maior que a int info que quer adicionar
					if(refno == ref){ //insere o int info na primeira posi��o da lista por ser menor que o primeiro elemento
						ref = new No(info, refno, null);
						refno.setAnt(ref);
						break;
					}else{ // insere no meio da lista
						No novo = new No(info, refno, refno.getAnt());
						refno.setAnt(novo);
						novo.getAnt().setProx(novo);
						break;
					}
				}else if(refno.getProx() == null) { //ultimo caso de inser��o quando o int info a ser inserido � maior que todos na lista, sendo colocado na ultima posi��o
					refno.setProx(new No(info, null, refno));
					break;
				}else{// incrementador do refno para varrer a lista
					refno = refno.getProx();
				}
			}while(refno != null);
		}
	}
	public void imprimir(){
		if(ref != null) { // verifica se a lista � nula para imprimir
			No ultimo = null; //Variavel para salvar o ultimo elemento para ajudar na impress�o reversa
			System.out.print("[");
			for(No i = ref; i != null; i = i.getProx()) { // impress�o  na ordem crescente com o uso de ref
				System.out.print(i.getInfo());
				if(i.getProx() != null) { //apenas uma condi��o para ir colocando virgula e separando os elementos
					System.out.print(", ");
				}else {
					ultimo = i; //verificador do ultimo elemento da lista para salva na variavel ultimo
				}
			}
			System.out.println("]");
			
			System.out.print("[");
			for(No i = ultimo; i != null; i = i.getAnt()) { // impress�o  na ordem decrescente com o uso da variavel ultimo
				System.out.print(i.getInfo());
				if(i.getAnt() != null) {
					System.out.print(", "); //apenas uma condi��o para ir colocando virgula e separando os elementos
				}
			}
			System.out.println("]");
		
		}else { //impress�o da lista quando ela for nula
			System.out.println("[]");
			System.out.println("[]");
		}
	}
	public void deletar(int apagar) {
		No i = ref; // variavel apenas para navegar na lista
		while(i != null) { //uso de um while para varrer a lista at� o final
			if(i.getInfo() == apagar) { //verificador se a informa��o do ponteiro � igual ao inteiro apagar
				if(i == ref) { //caso de como apagar se for o primeiro elemento da lista
					ref = i.getProx();
					if(i.getProx() != null) { // verifica se est� apontando para um elemento ou para null
						i.getProx().setAnt(null); //  se n�o aponta para null ele muda a referencia anterior desse elemento para nulo
					}else {
						break; // caso aponte para null ele encerra o metodo
					}
				}else if (i.getProx() == null) { //caso de como apagar se for o ultimo elemento da lista
					i.getAnt().setProx(null);
					break; //encerrando a varredura da lista por est� no ultimo elemento
				}else { // caso de como apagar um elemento caso esteja no meio da lista
					i.getAnt().setProx(i.getProx());
					i.getProx().setAnt(i.getAnt());
				}
				if(i.getProx() == null || i.getProx().getInfo()> apagar) { // verificador se ainda tem algum elemento para apagar, caso n�o tenha � encerrada a verredura
					break;
				}
			}else if(i.getProx() == null || i.getProx().getInfo()> apagar) { // verificador se ainda tem algum elemento na lista e se a infor��o ja foi apagada
				break;
			}
			i = i.getProx(); // incremetador do while
		}
	}
	public boolean listaVazia() { //metodo verificador se a lista est� vazia
		if(ref == null) { // se a lista for vazia retorna true
			return true;
		}else {
			return false; // se a lista n�o for vazia retorna false
		}
	}
}