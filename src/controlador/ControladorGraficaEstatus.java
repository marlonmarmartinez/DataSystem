
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import modelo.GraficaDeEstatus;

public class ControladorGraficaEstatus{
    private int cantidad;
    private ResultSet rs;
    GraficaDeEstatus estatus=new GraficaDeEstatus();

    public int nuevoIngreso() {
        rs=estatus.nuevoIngreso();
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

    public int noReparado() {
        rs=estatus.noReparado();
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

    public int enRevision() {
        rs=estatus.enRevision();
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

    public int reparado() {
        rs=estatus.reparado();
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

    public int entregado() {
        rs=estatus.entregado();
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
        rs=estatus.otro();
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
    
    public int mayorValor(int nuevoingreso,int noreparado,int enrevision,int reparado,int entregado,int otro){
        if(nuevoingreso>noreparado && nuevoingreso>enrevision & nuevoingreso>reparado && nuevoingreso>entregado && nuevoingreso>otro){
            return nuevoingreso;
        }else if(noreparado>enrevision && noreparado>reparado && noreparado>entregado && noreparado>otro){
            return noreparado;
        }else if(enrevision>reparado && enrevision>entregado && enrevision>otro){
            return enrevision;
        }else if(reparado>entregado && reparado>otro){
            return reparado;
        }else if(entregado>otro){
            return entregado;
        }
        else{
            return otro;
        }
    }
}
