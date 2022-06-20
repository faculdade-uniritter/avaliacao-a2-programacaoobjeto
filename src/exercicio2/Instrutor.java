package exercicio2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Instrutor {
	private String rg;
	private String nome;
	private String titulacao;
	private ArrayList<String> telefones;
	private LocalDate dataNascimento;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public Instrutor() {
		this.telefones = new ArrayList<String>();
	}

	public ArrayList<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(ArrayList<String> telefones) {
		this.telefones = telefones;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Instrutor [rg=" + rg + ", nome=" + nome + ", titulacao=" + titulacao + ", telefones=" + telefones
				+ ", dataNascimento=" + dataNascimento + "]";
	}

}
