package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexionBD
{
 	public Connection conexion = null;
    public Statement sentencia = null;   		
    public ResultSet resultado = null;   		
    
    public ConexionBD()
	{
        conectarBD();
    }
    public void conectarBD()
	{
		
		String url = "jdbc:mysql://localhost/concesionario3";

		
		try 
		{			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexion = DriverManager.getConnection(url, "root", "");
			// Crear sentencia
			sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		} catch (Exception e) {JOptionPane.showMessageDialog(null, "La base de datos no esta iniciada.", 
				"Advertencia", JOptionPane.WARNING_MESSAGE);System.exit(1);}
	}

    public void cerrarConexionBD()
	{
        try 
        {
            resultado.close();
            sentencia.close();
            conexion.close();
        } catch (SQLException ex) {ex.printStackTrace();}	               
    }
}
