
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static modelo.AcccesoLogin.cn;


public class InformacionDelEquipo {
    private ResultSet rs;
    private PreparedStatement ps;
    private Statement st;
    
    public ResultSet inabilitaInfoEquipo(){
        try {

            cn = Conexion.conectar();
            st = cn.createStatement();
            return rs = st.executeQuery("select username from usuarios where tipo_nivel='Tecnico'");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }
    
    public ResultSet validarIsAdmin(int idequipo){
        int idcliente=codigoCliente(idequipo);
        try {
            
            cn = Conexion.conectar();
            ps = cn.prepareStatement("select nombre_clientes from clientes where id_clientes=" + idcliente);
            return rs = ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
        return null;
    }
    
    public ResultSet mostrarInfoEquipo(int idequipo){
        
        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("select tipo_equipo,marca,modelo,num_serie,dia_ingreso,mes_ingreso,anio_ingreso,observaciones,estatus,ultima_modificacion,comentarios_tecnicos from equipos where id_equipos='" + idequipo + "'");
            return rs = ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }
    
    public PreparedStatement actualizarInfoEquipo(int idequipo){
        try {
            cn = Conexion.conectar();
            return ps = cn.prepareStatement("update equipos set tipo_equipo=?, marca=?, modelo=?,num_serie=?,observaciones=?,estatus=?,ultima_modificacion=?,comentarios_tecnicos=?,revision_tecnica_de=? where id_equipos='" + idequipo + "'");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }
    
    public  int codigoCliente(int idequipo){
        int idcliente=0;
         try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("select id_cliente from equipos where id_equipos='" + idequipo + "'");
             rs = ps.executeQuery();
             while(rs.next()){
                 idcliente=rs.getInt("id_cliente");
             }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return idcliente;
    }
}
