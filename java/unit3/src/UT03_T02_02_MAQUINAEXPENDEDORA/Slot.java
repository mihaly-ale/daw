package UT03_T02_02_MAQUINAEXPENDEDORA;

public class Slot {
	Producto product;
	int stock;

	// constr
	public Slot(Producto product, int stock) {
		this.product = product;
		this.stock = stock;
	}

	// metodos
	public void reponer(int numero) {
		if (numero <= 0) {
			throw new IllegalArgumentException("No se puede reponer menos que 0 unidades.");
		}
		stock += numero;
		System.out.println("\nReponiendo " + numero + " unidades.");
	}

	public void vender() {	
		
		if (stock <= 0) {
			throw new ProductoAgotadoException("\nEl producto no tiene stock.", product.nombre());
		}
		stock--;
	}

	// getters, setters
	public Producto getProduct() {
		return product;
	}

	public void setProduct(Producto product) {
		this.product = product;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
