package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import modelo.GraficaDeMarcas;

public class ControladorGraficaDeMarcas {

    private ResultSet rs;
    private int cantidad;
    GraficaDeMarcas marca = new GraficaDeMarcas();

    public int HP() {
        rs=marca.HP();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int ACER() {
        rs=marca.ACER();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int LENOVO() {
        rs=marca.LENOVO();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int DELL() {
        rs=marca.DELL();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int ASUS() {
        rs=marca.ASUS();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int APPLE() {
        rs=marca.APPLE();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int TOSHIBA() {
        rs=marca.TOSHIBA();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int SAMSUMG() {
        rs=marca.SAMSUMG();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int VAIO() {
       rs=marca.VAIO();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int SONY() {
       rs=marca.SONY();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int LG() {
        rs=marca.LG();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int COMPAQ() {
       rs=marca.COMPAQ();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int EPSON() {
        rs=marca.EPSON();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int IBM() {
        rs=marca.IBM();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int CANON() {
        rs=marca.CANON();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }

    public int otro() {
        rs=marca.otro();
        try {

            while (rs.next()) {
                cantidad = Integer.parseInt(rs.getString("numero"));

            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return cantidad;
    }
}
