package co.pipecode.patterns.creacionales.prototype;

public class Cuadrado extends Forma {

	public int width;
	public int height;

	public Cuadrado() {
	}

	public Cuadrado(Cuadrado target) {
		super(target);
		if (target != null) {
			this.width = target.width;
			this.height = target.height;
		}
	}

	@Override
	public Forma clone() {
		return new Cuadrado(this);
	}

	@Override
	public boolean equals(Object object2) {
		if (!(object2 instanceof Cuadrado) || !super.equals(object2))
			return false;
		Cuadrado shape2 = (Cuadrado) object2;
		return shape2.width == width && shape2.height == height;
	}
}
