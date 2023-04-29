package ClasseCliente;

public class Cliente {
	
	public String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	public String email;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
			public void mostrarInformacoes() {
				System.out.println("----------------------------------------");
				System.out.println("Nome: " + nome);
				System.out.println("CPF: " + cpf);
				System.out.println("Endereco: " + endereco);
				System.out.println("Telefone: " + telefone);
				System.out.println("Email: " + email);
				System.out.println("----------------------------------------");
	}

			public void lerInformacoes(String nome, String cpf, String telefone, String endereco,
					String email) {
				this.nome = nome;
				this.cpf = cpf;
				this.endereco = endereco;
				this.telefone = telefone;
				this.email = email;
				
	}
}

		
	
