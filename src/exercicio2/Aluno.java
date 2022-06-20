package exercicio2;

import java.time.LocalDate;
import java.util.Date;

public class Aluno {
	private String codigoMatricula;
	private LocalDate dataMatricula;
	private String nome;
	private String endereco;
	private String telefone;
	private LocalDate dataNascimento;
	private double altura;
	private double peso;

	public String getCodigoMatricula() {
		return codigoMatricula;
	}

	public void setCodigoMatricula(String codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}

	public LocalDate getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(LocalDate dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Aluno [codigoMatricula=" + codigoMatricula + ", dataMatricula=" + dataMatricula + ", nome=" + nome
				+ ", endereco=" + endereco + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento
				+ ", altura=" + altura + ", peso=" + peso + "]";
	}

}
