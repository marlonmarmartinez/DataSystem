
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static modelo.AcccesoLogin.cn;


public class GraficaDeMarcas {
    
    private final String HP = "select count(marca)as numero from equipos where marca='HP'";
    private final String ACER = "select count(marca)as numero from equipos where marca='ACER'";
    private final String LENOVO = "select count(marca)as numero from equipos where marca='LENOVO'";
    private final String DELL = "select count(marca)as numero from equipos where marca='DELL'";
    private final String ASUS = "select count(marca)as numero from equipos where marca='ASUS'";
    private final String APPLE = "select count(marca)as numero from equipos where marca='APPLE'";
    private final String TOSHIBA = "select count(marca)as numero from equipos where marca='TOSHIBA'";
    private final String SAMSUMG = "select count(marca)as numero from equipos where marca='SAMSUMG'";
    private final String VAIO = "select count(marca)as numero from equipos where marca='VAIO'";
    private final String SONY = "select count(marca)as numero from equipos where marca='SONY'";
    private final String LG = "select count(marca)as numero from equipos where marca='LG'";
    private final String COMPAQ = "select count(marca)as numero from equipos where marca='COMPAQ'";
    private final String EPSON = "select count(marca)as numero from equipos where marca='EPSON'";
    private final String IBM = "select count(marca)as numero from equipos where marca='IBM'";
    private final String CANON = "select count(marca)as numero from equipos where marca='CANON'";
    private final String otro = "select count(marca)as numero from equipos where marca='OTROS'";
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;
   
      public ResultSet HP() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "HP");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet ACER() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "ACER");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet LENOVO() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "LENOVO");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet DELL() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "DELL");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet ASUS() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "ASUS");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet APPLE() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "APPLE");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet TOSHIBA() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "TOSHIBA");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet SAMSUMG() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "SAMSUMG");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet VAIO() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "VAIO");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet SONY() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "SONY");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet LG() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "LG");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet COMPAQ() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "COMPAQ");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet EPSON() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "EPSON");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet IBM() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "IBM");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet CANON() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "CANON");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }

    public ResultSet otro() {

        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("{call consulta_marcas(?)}");
            ps.setString(1, "OTROS");
            return rs = ps.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    } 
}
