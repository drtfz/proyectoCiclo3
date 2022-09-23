package beans;

public class Cabana {
	private int id_cabana;
	private String nombre_cabana;
	private int capacidad;
	private int camas;
	private int terrazas;
	private int nidos;

	public Cabana(int id_cabana, String nombre_cabana, int capacidad, int camas, int terrazas, int nidos) {
		this.id_cabana = id_cabana;
		this.nombre_cabana = nombre_cabana;
		this.capacidad = capacidad;
		this.camas = camas;
		this.terrazas = terrazas;
		this.nidos = nidos;
	}

	public int getId_cabana() {
		return id_cabana;
	}

	public void setId_cabana(int id_cabana) {
		this.id_cabana = id_cabana;
	}

	public String getNombre_cabana() {
		return nombre_cabana;
	}

	public void setNombre_cabana(String nombre_cabana) {
		this.nombre_cabana = nombre_cabana;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCamas() {
		return camas;
	}

	public void setCamas(int camas) {
		this.camas = camas;
	}

	public int getTerrazas() {
		return terrazas;
	}

	public void setTerrazas(int terrazas) {
		this.terrazas = terrazas;
	}

	public int getNidos() {
		return nidos;
	}

	public void setNidos(int nidos) {
		this.nidos = nidos;
	}

	@Override
	public String toString() {
		return "Caban{" + "id_cabana=" + id_cabana + ", nombre_cabana=" + nombre_cabana + ", capacidad=" + capacidad + ", camas=" + camas + ", terrazas=" + terrazas + ", nidos=" + nidos + '}';
	}
	
	
}
