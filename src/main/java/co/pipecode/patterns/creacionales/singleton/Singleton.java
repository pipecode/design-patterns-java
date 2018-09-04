package co.pipecode.patterns.creacionales.singleton;

public class Singleton {

	private String nombre;
	private static Singleton singleton;

	private Singleton(String nombre) {
		this.nombre = nombre;
		System.out.println("Mi nombre es: " + this.nombre);
	}

	public static Singleton getSingletonInstance(String nombre) {
		if (singleton == null) {
			singleton = new Singleton(nombre);
		} else {
			System.out.println(
					"No se puede crear el objeto " + nombre + " porque ya existe un objeto de la clase SoyUnico");
		}
		return singleton;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
