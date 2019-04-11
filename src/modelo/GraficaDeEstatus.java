
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static modelo.AcccesoLogin.cn;


public class GraficaDeEstatus {
    
    private PreparedStatement ps;
    private ResultSet rs;
    
    public ResultSet nuevoIngreso() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_Estatus(?)}");
            ps.setString(1, "Nuevo ingreso");
            return rs = ps.executeQuery();
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet noReparado() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_Estatus(?)}");
            ps.setString(1, "No reparado");
            return rs = ps.executeQuery();
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet enRevision() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_Estatus(?)}");
            ps.setString(1, "En revision");
            return rs = ps.executeQuery();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet reparado() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_Estatus(?)}");
            ps.setString(1, "Reparado");
            return rs = ps.executeQuery();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet entregado() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_Estatus(?)}");
            ps.setString(1, "Entregado");
            return rs = ps.executeQuery();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet otro() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_Estatus(?)}");
            ps.setString(1, "Otro");
            return rs = ps.executeQuery();
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }
}
