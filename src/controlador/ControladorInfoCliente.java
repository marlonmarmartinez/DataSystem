
package controlador;

import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import modelo.InformacionDelCliente;
import vista.InformacionDelEquipo;


public class ControladorInfoCliente {
    private ResultSet rs;
    private PreparedStatement ps;
    InformacionDelCliente infocliente=new InformacionDelCliente();
    public String nombrecli,correocli,telefcli,direccli;
    
     public final void mostrarInfoCliente(int idcliente,JTextField nomcli,JTextField mailcli,JTextField telcli,JTextField dircli,JTextField modificadopor){
         rs=infocliente.consultarInfoCliente(idcliente);
        try {
               
                while(rs.next()){
                   nomcli.setText(rs.getString("nombre_clientes"));
                   mailcli.setText(rs.getString("mail_clientes"));
                   telcli.setText(rs.getString("tel_clientes"));
                   dircli.setText(rs.getString("dir_clientes"));
                   modificadopor.setText(rs.getString("ultima_modificacion"));
                   nombrecli=rs.getString("nombre_clientes");
                   correocli=rs.getString("mail_clientes");
                   telefcli=rs.getString("tel_clientes");
                   direccli=rs.getString("dir_clientes");
                }
                rs.close();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
        finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    
    public void mostrarInfoEquipo(int idcliente,JTable tabla){
        rs=infocliente.consultarInfoEquipo(idcliente, tabla);
        
        try {
             Object []datos=new Object[4];
              while(rs.next()){
                    for (int i = 0; i < 4; i++) {
                        datos[i]=rs.getString(1+i);
                    }
                  infocliente.model.addRow(datos);
                }
                rs.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    
     public void setEventoMouseClicked(JTable tabla,String username,String nomcli){
      
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
 
        @Override
        public void mouseClicked(MouseEvent e) {
            infocliente.eventoMouseClicked(e, tabla);
            new InformacionDelEquipo(nomcli,infocliente.idequipo,username).setVisible(true);
        }
  
        });
    }
     
    public void actualizarInfocliente(int idcliente,JTextField nomcli,JTextField mailcli,JTextField telcli,JTextField dircli,String username){
        ps=infocliente.actualizarInfoCliente(idcliente);
        
        try {
                ps.setString(1, nomcli.getText().trim());
                ps.setString(2, mailcli.getText().trim());
                ps.setString(3, telcli.getText().trim());
                ps.setString(4, dircli.getText().trim());
                ps.setString(5, username);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                ps.close();
        } catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
}
