package co.pipecode.patterns.creacionales.builder;

public class BuilderMain {

	public static void main(String[] args) {
		Carro mazdaCX5 = new Carro.Builder(2018).withAirbags(true).withAire(true).withTablet(true).build();

		Carro mazdaCX3 = new Carro.Builder(2018).withAirbags(true).withAire(true).withTablet(false).build();

		System.out.println("Mazda CX5  Modelo: " + mazdaCX5.getModelo() + "Airbags: " + mazdaCX5.isAirbags() + "Aire: "
				+ mazdaCX5.isAire() + "Tablet: " + mazdaCX5.isTablet());
		
		System.out.println("Mazda CX3 Modelo: " + mazdaCX3.getModelo() + "Airbags: " + mazdaCX3.isAirbags() + "Aire: "
				+ mazdaCX3.isAire() + "Tablet: " + mazdaCX3.isTablet());
	}
}
