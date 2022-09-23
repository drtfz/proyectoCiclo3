package beans;

import java.sql.Date;

public class Alquiler {
	private int id_cabana;
	private String id_huesped;
	private Date fecha;
	private int capacidad;

	public Alquiler(int id_cabana, String id_huesped, Date fecha, int capacidad) {
		this.id_cabana = id_cabana;
		this.id_huesped = id_huesped;
		this.fecha = fecha;
		this.capacidad = capacidad;
	}

	public int getId_cabana() {
		return id_cabana;
	}

	public void setId_cabana(int id_cabana) {
		this.id_cabana = id_cabana;
	}

	public String getId_huesped() {
		return id_huesped;
	}

	public void setId_huesped(String id_huesped) {
		this.id_huesped = id_huesped;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Alquiler{" + "id_cabana=" + id_cabana + ", id_huesped=" + id_huesped + ", fecha=" + fecha + ", capacidad=" + capacidad + '}';
	}
	
	
}
