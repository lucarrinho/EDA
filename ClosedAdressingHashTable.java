
public class ClosedAdressingHashTable {
	private Object[] tabela;
	
	public ClosedAdressingHashTable() {
		this.tabela = new Object[32];
	}
	
	private int hash(int chave) {
		return chave % this.tabela.length;
	}
	
	public Object get(int chave) {
		int hash = hash(chave);
		return this.tabela[hash];
	}
	
	public void put(int chave, Object valor) {
		int hash = hash(chave);
		this.tabela[hash] = valor;
	}
	
	public Object remove(int chave) {
		int hash = hash(chave);
		Object valor = this.tabela[hash];
		this.tabela[hash] = null;
		return valor;
	}
}
