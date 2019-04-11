
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static modelo.AcccesoLogin.cn;


public class InformacionDelUsuario {
    private PreparedStatement ps;
    private ResultSet rs;
    
    public ResultSet consultarInformacionUsuario(int idusuario){
        
         try {
                cn=Conexion.conectar();
                ps=cn.prepareStatement("select nombre_usuario,email,telefono,username,tipo_nivel,estatus,registrado_por from usuarios where id_usuario='"+idusuario+"'");
                return rs=ps.executeQuery();
          
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
         return null;
    }
    
    public PreparedStatement actualizarUsuario(int idusuario){
        try {
                 cn=Conexion.conectar();
                 return ps=cn.prepareStatement("update usuarios set nombre_usuario=?, email=?, telefono=?,username=?,tipo_nivel=?,estatus=? where id_usuario='"+idusuario+"'");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
        return null;
    }
    
    public PreparedStatement restaurarPassword(int idusuario){
         try {
                cn=Conexion.conectar();
                return ps=cn.prepareStatement("update usuarios set password=? where id_usuario='"+idusuario+"'");
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
         }
         return null;
    }
    
}
