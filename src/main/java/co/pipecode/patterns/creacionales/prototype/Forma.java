package co.pipecode.patterns.creacionales.prototype;

import java.util.Objects;

public abstract class Forma {

	public int x;
    public int y;
    public String color;

    public Forma() {
    }

    public Forma(Forma target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Forma clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Forma)) return false;
        Forma forma2 = (Forma) object2;
        return forma2.x == x && forma2.y == y && Objects.equals(forma2.color, color);
    }
}
