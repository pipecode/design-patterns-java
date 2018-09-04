package co.pipecode.patterns.creacionales.singleton;

public class SingletonMain {

	public static void main(String[] args) {

		Singleton felipe = Singleton.getSingletonInstance("Felipe Castro");
		Singleton claudia = Singleton.getSingletonInstance("Claudia Patiño");

		System.out.println(felipe.getNombre());
		System.out.println(claudia.getNombre());
	}
}
