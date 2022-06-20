package exercicio1;

public class Automovel extends Veiculo {

	private int diametroRoda;
	private int quantidadePortas;

	@Override
	public void acelerar() {
		System.out.println("O automóvel acelerou!!! ram raaaam ");
	}

	@Override
	public void mostrarDetalhes() {
		System.out.println("O automovel " + this.nome + ", ano " + this.anoFabricacao + " , produzido pela "
				+ this.fabricante.getNome() + "(" + this.fabricante.getPaisDeOrigem() + ")" + " possui "
				+ this.quantidadePortas + " Portas" + " e " + this.diametroRoda + " diâmetro de roda "
				+ "com capacidade para " + this.capacidade + " pessoas. ");
	}

	public void abrirPortaMalas() {
		System.out.println("O porta-malas do carro foi aberto! ");
	}

	public void fecharPortaMalas() {
		System.out.println("O porta-malas do carro foi fechado! ");
	}

	public void desligar() {
		System.out.println("O automóvel foi desligado! ");
	}

	public int getDiametroRoda() {
		return diametroRoda;
	}

	public void setDiametroRoda(int diametroRoda) {
		this.diametroRoda = diametroRoda;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

}
