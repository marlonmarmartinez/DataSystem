
package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static modelo.AcccesoLogin.cn;


public class RegistrarEquipos {
    private PreparedStatement ps;
    
    public PreparedStatement registrarEquipos(){
         try{
            cn=Conexion.conectar();
            return ps=cn.prepareStatement("insert into equipos values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "error al conectar a la base de datos "+e.getMessage());
                System.out.println(e.getLocalizedMessage());
            }
         return null;
    }
}
