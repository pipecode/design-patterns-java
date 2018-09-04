package co.pipecode.patterns.creacionales.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {

	public static void main(String[] args) {
		List<Forma> formas = new ArrayList<>();
		List<Forma> formasCopy = new ArrayList<>();

		Circulo circulo = new Circulo();
		circulo.x = 10;
		circulo.y = 20;
		circulo.radius = 15;
		formas.add(circulo);

		Circulo aotroCirculo = (Circulo) circulo.clone();
		formas.add(aotroCirculo);

		Cuadrado cuadrado = new Cuadrado();
		cuadrado.width = 10;
		cuadrado.height = 20;
		formas.add(cuadrado);

		cloneAndCompare(formas, formasCopy);
	}

	private static void cloneAndCompare(List<Forma> shapes, List<Forma> shapesCopy) {
		for (Forma shape : shapes) {
			shapesCopy.add(shape.clone());
		}

		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) != shapesCopy.get(i)) {
				System.out.println(i + ": Formas son diferentes");
				if (shapes.get(i).equals(shapesCopy.get(i))) {
					System.out.println(i + ": Estas son Identicas");
				} else {
					System.out.println(i + ": Pero estas no son Identicas");
				}
			} else {
				System.out.println(i + ": Formas son iguales");
			}
		}
	}
}
