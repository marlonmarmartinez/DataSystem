
package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AcccesoLogin {
    private PreparedStatement ps;
    private ResultSet rs;
    public static Connection cn=Conexion.conectar();
    public AcccesoLogin() {
    }

    public ResultSet AccesoPermitido(String user,String pass){
        
            try {
                cn=Conexion.conectar();
                ps=cn.prepareStatement("select nombre_usuario,tipo_nivel,estatus from usuarios where username='"+user+"' and password='"+pass+"'");
                return rs=ps.executeQuery();
                
            }catch (SQLException e) {
                System.err.println("Error en el boton acceder : "+e.getMessage());
                JOptionPane.showMessageDialog(null,"error al iniciar sesion contacte al administrador: "+e.getMessage());
                
            } 
    return null;
    }
}
