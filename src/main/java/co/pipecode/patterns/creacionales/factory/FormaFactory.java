package co.pipecode.patterns.creacionales.factory;

public class FormaFactory {

	public Forma getForma(String tipoForma) {
		if (tipoForma == null) {
			return null;
		}
		if (tipoForma.equalsIgnoreCase("Circulo")) {
			return new Circulo();

		} else if (tipoForma.equalsIgnoreCase("Cuadrado")) {
			return new Cuadrado();

		}
		return null;
	}
}
