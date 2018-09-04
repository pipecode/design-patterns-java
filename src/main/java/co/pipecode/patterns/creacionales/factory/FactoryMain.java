package co.pipecode.patterns.creacionales.factory;

public class FactoryMain {

	public static void main(String[] args) {
	      FormaFactory formaFactoruy = new FormaFactory();

	      Forma circulo = formaFactoruy.getForma("Circulo");
	      circulo.dibujar();

	      Forma cuadrado = formaFactoruy.getForma("Cuadrado");
	      cuadrado.dibujar();
	   }
}
