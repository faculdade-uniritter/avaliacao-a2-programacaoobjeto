package exercicio1;

public class Aviao extends Veiculo {
	private int numTurbinas;

	@Override
	public void acelerar() {
		System.out.println("O avi�o acelerou!!!! ram raaaam ");
	}

	@Override
	public void mostrarDetalhes() {

		System.out.println("O avi�o " + this.nome + ", ano " + this.anoFabricacao + " , produzido pela "
				+ this.fabricante.getNome() + " (" + this.fabricante.getPaisDeOrigem() + ")" + " utiliza "
				+ this.numTurbinas + " turbinas" + " e possui capacidade para " + this.capacidade + " pessoas. ");
	}

	public void decolar() {
		System.out.println("O avi�o decolou! ");
	}

	public void pousar() {
		System.out.println("O avi�o pousou! ");
	}

	public int getNumTurbinas() {
		return numTurbinas;
	}

	public void setNumTurbinas(int numTurbinas) {
		this.numTurbinas = numTurbinas;
	}

}
