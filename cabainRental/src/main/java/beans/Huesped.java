package beans;

public class Huesped {
	private String id_huesped;
	private String contrasena;
	private String nombres;
	private String apellidos;
	private String email;
	private double saldo;
	private boolean premium;

	public Huesped(String id_huesped, String contrasena, String nombres, String apellidos, String email, double saldo, boolean premium) {
		this.id_huesped = id_huesped;
		this.contrasena = contrasena;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.saldo = saldo;
		this.premium = premium;
	}

	public String getId_huesped() {
		return id_huesped;
	}

	public void setId_huesped(String id_huesped) {
		this.id_huesped = id_huesped;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "Huesped{" + "id_huesped=" + id_huesped + ", contrasena=" + contrasena + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", saldo=" + saldo + ", premium=" + premium + '}';
	}

	
	
}
