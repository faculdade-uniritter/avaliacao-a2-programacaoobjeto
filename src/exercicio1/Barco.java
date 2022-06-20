package exercicio1;

public class Barco extends Veiculo {
	private int numVelas;

	@Override
	public void acelerar() {
		System.out.println("O barco acelerou!!!! ram raaaam ");
	}

	@Override
	public void mostrarDetalhes() {
		System.out.println("O barco " + this.nome + ", ano " + this.anoFabricacao + " , produzido pela "
				+ this.fabricante.getNome() + " (" + this.fabricante.getPaisDeOrigem() + ")" + " possui "
				+ this.numVelas + " Velas" + " e capacidade para " + this.capacidade + " pessoas. ");
	}

	public void icarVelas() {
		System.out.println("O barco está com as velas içadas! ");
	}

	public void recolherVelas() {
		System.out.println("O barco está com as velas recolhidas! ");

	}

	public int getNumVelas() {
		return numVelas;
	}

	public void setNumVelas(int numVelas) {
		this.numVelas = numVelas;
	}

}
