package Ejercicio5;

public class Categoria {
	
	private int id;
	private String descripcion;
	
	public int getId() {
		return id;
	}
	
	public Categoria(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public Categoria(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		if(id == 0) {
			return descripcion;
		}
		else {
			return id + " - " + descripcion;						
		}
	}
}
