package exercicio1;

public class Exercicio1 {

	public static void main(String[] args) {

		Fabricante fiat = new Fabricante();
		fiat.setNome("FIAT");
		fiat.setPaisDeOrigem("Itália");
		System.out.println(fiat);

		Fabricante peugeot = new Fabricante();
		peugeot.setNome("PEUGEOT");
		peugeot.setPaisDeOrigem("França");
		System.out.println(peugeot);

		Fabricante nxBoats = new Fabricante();
		nxBoats.setNome("NX BOATS");
		nxBoats.setPaisDeOrigem("Brasil");
		System.out.println(nxBoats);

		Fabricante sessaMarine = new Fabricante();
		sessaMarine.setNome("SESSA MARINE");
		sessaMarine.setPaisDeOrigem("Itália");
		System.out.println(sessaMarine);

		Fabricante airbus = new Fabricante();
		airbus.setNome("AIRBUS");
		airbus.setPaisDeOrigem("França");
		System.out.println(airbus);

		Fabricante boeing = new Fabricante();
		boeing.setNome("BOEING");
		boeing.setPaisDeOrigem("Estados Unidos");
		System.out.println(boeing);

		Aviao aviao1 = new Aviao();
		aviao1.setFabricante(boeing);
		aviao1.setCapacidade(178);
		aviao1.setNome("737 - 800 ");
		aviao1.setAnoFabricacao(1997);
		aviao1.setNumTurbinas(4);
		aviao1.mostrarDetalhes();
		aviao1.acelerar();
		aviao1.decolar();
		aviao1.pousar();

		Aviao aviao2 = new Aviao();
		aviao2.setFabricante(airbus);
		aviao2.setCapacidade(220);
		aviao2.setNome("AIRBUS A320 ");
		aviao2.setAnoFabricacao(2000);
		aviao2.setNumTurbinas(2);
		aviao2.mostrarDetalhes();
		aviao2.acelerar();
		aviao2.decolar();
		aviao2.pousar();

		Barco barco1 = new Barco();
		barco1.setFabricante(sessaMarine);
		barco1.setNome("Sessa C44");
		barco1.setAnoFabricacao(2021);
		barco1.setCapacidade(12);
		barco1.setNumVelas(10);
		barco1.mostrarDetalhes();
		barco1.acelerar();
		barco1.icarVelas();
		barco1.recolherVelas();

		Barco barco2 = new Barco();
		barco2.setFabricante(nxBoats);
		barco2.setNome("Nx Boats 400");
		barco2.setAnoFabricacao(2021);
		barco2.setCapacidade(18);
		barco2.setNumVelas(6);
		barco2.mostrarDetalhes();
		barco2.acelerar();
		barco2.icarVelas();
		barco2.recolherVelas();

		Automovel automovel1 = new Automovel();
		automovel1.setFabricante(fiat);
		automovel1.setCapacidade(5);
		automovel1.setNome("Fiat Uno");
		automovel1.setAnoFabricacao(2020);
		automovel1.setDiametroRoda(5);
		automovel1.setQuantidadePortas(4);
		automovel1.mostrarDetalhes();
		automovel1.acelerar();
		automovel1.abrirPortaMalas();
		automovel1.fecharPortaMalas();
		automovel1.desligar();

		Automovel automovel2 = new Automovel();
		automovel2.setFabricante(peugeot);
		automovel2.setCapacidade(5);
		automovel2.setNome("Peugeot 308");
		automovel2.setAnoFabricacao(2008);
		automovel2.setDiametroRoda(20);
		automovel2.setQuantidadePortas(4);
		automovel2.mostrarDetalhes();
		automovel2.acelerar();
		automovel2.abrirPortaMalas();
		automovel2.fecharPortaMalas();
		automovel2.desligar();
	}
}
