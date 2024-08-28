package aula2;

public class Pessoa {

    String nome;
    int idade;
    String endereco;
	String profissao;
	long Rg;
	long Cpf;
	
	public String getNome () {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
		}
		public int getIdade () {
		return idade;
		}
		public void setIdade (int idade) {
		this.idade = idade;
		}
		public String getEndereco() {
		return endereco;
		}
		public void setEndereco (String endereco) {
		this.endereco = endereco;
		}
		public String getProfissao() {
		return profissao;
		}
		public void setProfissao (String profissao) {
		this.profissao = profissao;
		}
		public long getRg() {
			return Rg;
		}	
		public void setRg (long Rg) {
		this.Rg = Rg;
		}
		public long getCpf() {
			return Cpf;
		}
		public void setCpf (long Cpf) {
			this.Cpf = Cpf;
}
}
