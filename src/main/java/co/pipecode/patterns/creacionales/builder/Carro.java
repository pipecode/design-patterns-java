package co.pipecode.patterns.creacionales.builder;

public class Carro {

	private int modelo;
	private boolean airbags;
	private boolean aire;
	private boolean tablet;

	public static class Builder {

		private int modelo;
		private boolean airbags;
		private boolean aire;
		private boolean tablet;

		public Builder(int modelo) {
			this.modelo = modelo;
		}

		public Builder withAirbags(boolean airbags) {
			this.airbags = airbags;
			return this;
		}

		public Builder withAire(boolean aire) {
			this.aire = aire;
			return this;
		}

		public Builder withTablet(boolean tablet) {
			this.tablet = tablet;
			return this;
		}

		public Carro build() {
			Carro carro = new Carro();
			carro.modelo = this.modelo;
			carro.airbags = this.airbags;
			carro.aire = this.aire;
			carro.tablet = this.tablet;
			return carro;
		}
	}

	private Carro() {
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public boolean isAirbags() {
		return airbags;
	}

	public void setAirbags(boolean airbags) {
		this.airbags = airbags;
	}

	public boolean isAire() {
		return aire;
	}

	public void setAire(boolean aire) {
		this.aire = aire;
	}

	public boolean isTablet() {
		return tablet;
	}

	public void setTablet(boolean tablet) {
		this.tablet = tablet;
	}

}
