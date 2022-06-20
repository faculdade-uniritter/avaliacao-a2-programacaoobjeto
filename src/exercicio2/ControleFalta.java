package exercicio2;

public class ControleFalta {

	private Aluno aluno;
	private Turma turma;
	private int quantidadeFaltas;

	public ControleFalta(Aluno aluno, Turma turma, int quantidadeFaltas) {
		super();
		this.aluno = aluno;
		this.turma = turma;
		this.quantidadeFaltas = quantidadeFaltas;
	}

	@Override
	public String toString() {
		return "ControleFalta [aluno=" + aluno + ", turma=" + turma + ", quantidadeFaltas=" + quantidadeFaltas + "]";
	}

}
