package test;
import beans.Cabana;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
	
	public static void main(String[] args) {
		actualizarCabana(3,4);
		listarCabana();

	}


	
	public static void actualizarCabana(int id_cabana, int capacidad){
		
		DBConnection con = new DBConnection();
		String sql = "UPDATE cabana SET capacidad = '" + capacidad + "' WHERE id_cabana = " + id_cabana;
		
		try {
			Statement st = con.getConnection().createStatement();
			st.executeUpdate(sql);
			
		} catch(Exception ex){
			System.out.println(ex.getMessage());
			
		}
		
		finally {
			con.Desconectar();
		}
	}
	
	public static void listarCabana(){
		DBConnection con = new DBConnection();
		String sql = "SELECT * FROM cabana";

		try {
			Statement st = con.getConnection().createStatement();
			ResultSet  rs = st.executeQuery(sql);
			while (rs.next()) {
				int id_cabana = rs.getInt("id_cabana");
				String nombre_cabana = rs.getString("nombre_cabana");
				int capacidad = rs.getInt("capacidad");
				int camas = rs.getInt("camas");
				int terrazas = rs.getInt("terrazas");
				int nidos = rs.getInt("nidos");

				Cabana cabana = new Cabana(id_cabana,nombre_cabana,capacidad,camas,terrazas,nidos);
				System.out.println(cabana.toString());
			}
			st.executeQuery(sql);

		}catch (Exception ex){
			System.out.println(ex.getMessage());

		}finally {
			con.Desconectar();

		}

		
	}
	
}
