
package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static modelo.AcccesoLogin.cn;


public class RegistrarClientes {
    PreparedStatement ps;
    
    public PreparedStatement registrarCliente(){
        try{
            cn=Conexion.conectar();
            return ps=cn.prepareStatement("insert into clientes values(?,?,?,?,?,?)");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos "+e.getMessage());
        }
        return null;
    }
}
