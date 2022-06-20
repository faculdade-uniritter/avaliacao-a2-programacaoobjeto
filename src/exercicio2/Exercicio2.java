package exercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercicio2 {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setCodigoMatricula("alu20223156");
		aluno1.setDataMatricula(LocalDate.of(2022, 1, 03));
		aluno1.setNome("Carolina Fernandes");
		aluno1.setEndereco("Av. Professor Oscar Pereira 3223 Glória Porto Alegre RS");
		aluno1.setDataNascimento(LocalDate.of(1986, 3, 22));
		aluno1.setTelefone("997854678");
		aluno1.setAltura(1.72);
		aluno1.setPeso(59.0);
		System.out.println(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.setCodigoMatricula("alu20223157");
		aluno2.setDataMatricula(LocalDate.of(2021, 11, 16));
		aluno2.setNome("Samantha Garcia");
		aluno2.setEndereco("Rua Carlos Huber 110 Três Figueiras Porto Alegre RS");
		aluno2.setDataNascimento((LocalDate.of(1984, 12, 19)));
		aluno2.setTelefone("999748576");
		aluno2.setAltura(1.68);
		aluno2.setPeso(63.0);
		System.out.println(aluno2);
		System.out.println();
		Instrutor instrutor1 = new Instrutor();
		instrutor1.setNome("Carlos Eduardo de Almeida");
		instrutor1.setRg("4078962578");
		instrutor1.setTitulacao("Bacharel");
		instrutor1.setDataNascimento(LocalDate.of(1980, 2, 25));
		instrutor1.getTelefones().add("997412367");
		instrutor1.getTelefones().add("987568912");
		instrutor1.getTelefones().add("34342969");
		System.out.println(instrutor1);

		Instrutor instrutor2 = new Instrutor();
		instrutor2.setNome("Luciano Ortiz");
		instrutor2.setRg("7083967978");
		instrutor2.setTitulacao("Estudante");
		instrutor2.setDataNascimento(LocalDate.of(1986, 1, 31));
		instrutor2.getTelefones().add("981997896");
		instrutor2.getTelefones().add("999278963");
		instrutor2.getTelefones().add("33364545");
		System.out.println(instrutor2);
		System.out.println();
		Turma turma1 = new Turma();
		turma1.setDataInicial(LocalDateTime.of(2022, 1, 03, 19, 00));
		turma1.setDuracaoAula(60);
		turma1.setTipoAtividade("Jump");
		turma1.getAlunos().add(aluno1);
		turma1.getAlunos().add(aluno2);
		turma1.setInstrutor(instrutor1);
		turma1.setMonitor(aluno2);
		System.out.println(turma1);

		Turma turma2 = new Turma();
		turma2.setDataInicial(LocalDateTime.of(2022, 1, 03, 18, 00));
		turma2.setDuracaoAula(60);
		turma2.setTipoAtividade("Pilates");
		turma2.getAlunos().add(aluno1);
		turma2.getAlunos().add(aluno2);
		turma2.setInstrutor(instrutor2);
		turma2.setMonitor(aluno1);
		System.out.println(turma2);
		System.out.println();
		ControleFalta controleFalta = new ControleFalta(aluno1, turma1, 2);
		ControleFalta controleFalta1 = new ControleFalta(aluno2, turma1, 4);
		ControleFalta controleFalta2 = new ControleFalta(aluno2, turma2, 0);
		ControleFalta controleFalta3 = new ControleFalta(aluno1, turma2, 2);
		System.out.println(controleFalta);
		System.out.println(controleFalta1);
		System.out.println(controleFalta2);
		System.out.println(controleFalta3);
	}

}
