
package controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import modelo.RegistrarClientes;


public class ControladorRegistrarCliente {
    
    PreparedStatement ps;
    RegistrarClientes registrar=new RegistrarClientes();
    
    public void registrarClientes(JTextField nomcli,JTextField correocli,JTextField telcli,JTextField dircli,String username){
        ps=registrar.registrarCliente();
        
        try {
            ps.setString(1,"0");
            ps.setString(2, nomcli.getText().trim());
            ps.setString(3, correocli.getText().trim());
            ps.setString(4, telcli.getText().trim());
            ps.setString(5, dircli.getText().trim());
            ps.setString(6, username);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos "+e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
}
