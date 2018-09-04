package co.pipecode.patterns.creacionales.prototype;

public class Circulo extends Forma {

	public int radius;

	public Circulo() {
	}

	public Circulo(Circulo target) {
		super(target);
		if (target != null) {
			this.radius = target.radius;
		}
	}

	@Override
	public Forma clone() {
		return new Circulo(this);
	}

	@Override
	public boolean equals(Object object2) {
		if (!(object2 instanceof Circulo) || !super.equals(object2))
			return false;
		Circulo shape2 = (Circulo) object2;
		return shape2.radius == radius;
	}

}
