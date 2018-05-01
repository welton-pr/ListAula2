package br.com.welton.model;
import java.util.Comparator;
import java.util.Date;

public class Pessoa implements Comparator<Pessoa>{

	private int codigo;
	private String nome;
	private String sobrenome;
	private Date nascimento;
	
	//Getters e setters
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
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	
	}
	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		int resultado = p1.getNome().compareTo(p2.getNome());
		if(resultado == 0)
			resultado = p1.getSobrenome().compareTo(p2.getSobrenome());
		return resultado;
	}
}
