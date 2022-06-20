package exercicio2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> alunos;
	private Instrutor instrutor;
	private int duracaoAula;
	private LocalDateTime dataInicial;
	private LocalDateTime dataFinal;
	private String tipoAtividade;
	private Aluno monitor;

	public void setMonitor(Aluno monitor) {
		this.monitor = monitor;
	}

	public Turma() {
		this.alunos = new ArrayList<Aluno>();
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public int getDuracaoAula() {
		return duracaoAula;
	}

	public void setDuracaoAula(int duracaoAula) {
		this.duracaoAula = duracaoAula;
		if (this.dataInicial != null) {
			this.dataFinal = this.dataInicial.plus(duracaoAula, ChronoUnit.MINUTES);
		}
	}

	public LocalDateTime getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDateTime dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDateTime getDataFinal() {
		return dataFinal;
	}

	public String getTipoAtividade() {
		return tipoAtividade;
	}

	public void setTipoAtividade(String tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}

	@Override
	public String toString() {
		return "Turma [alunos=" + alunos + ", instrutor=" + instrutor + ", duracaoAula=" + duracaoAula
				+ ", dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", tipoAtividade=" + tipoAtividade
				+ ", monitor=" + monitor + "]";
	}

}
