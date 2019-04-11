package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import vista.Administrador;
import vista.Capturista;
import vista.Login;
import vista.Tecnico;

public class ControladorAccesoLogin extends JFrame {

    private String nombreusuario, tiponivel, estatus;
    ResultSet rs;
    AcccesoLogin acceso = new AcccesoLogin();

    public ControladorAccesoLogin(String user, String pass) {
        
        rs = acceso.AccesoPermitido(user, pass);
        
        try {
            
            if (rs.next()) {
                
                tiponivel = rs.getString("tipo_nivel");
                estatus = rs.getString("estatus");
                nombreusuario = rs.getString("nombre_usuario");
                
                if (tiponivel.equalsIgnoreCase("Administrador") && estatus.equalsIgnoreCase("Activo")) {

                    new Administrador(user, nombreusuario).setVisible(true);
                    
                } else if (tiponivel.equalsIgnoreCase("Capturista") && estatus.equalsIgnoreCase("Activo")) {

                    new Capturista(user, nombreusuario).setVisible(true);
                    
                } else if (tiponivel.equalsIgnoreCase("Tecnico") && estatus.equalsIgnoreCase("Activo")) {

                    new Tecnico(user, nombreusuario).setVisible(true);
                }
            } else {
                
                JOptionPane.showMessageDialog(null, " datos de acceso incorrecto");
                new Login().setVisible(true);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorAccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    }
}
