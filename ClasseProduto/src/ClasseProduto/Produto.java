package ClasseProduto;

public class Produto {
	
	private int codigo;
	private String nome;
	private float preco;
	private int quantidade;
	private int estoque;
		
	public Produto() {
		
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome==null || nome.isEmpty()) {
		this.nome = nome;
		System.out.println("Informar nome do produto.");
		}
		else {
			System.out.println(nome);
		}
	}
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if(preco>0 && preco<20000) {
			this.preco = preco;
			System.out.println("Preço: " +preco);
		}
		else {
			System.out.println("Valor informado inválido.");
	}
		}
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if(quantidade>1 && quantidade<20) {
			this.quantidade = quantidade;
			System.out.println("Quantidade: " +quantidade);
		}
		else {
			System.out.println("Quantidade inválida.");
	}
		}
	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
