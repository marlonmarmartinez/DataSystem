
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import modelo.InformacionDelEquipo;


public class ControladorInfoEquipo {
    private ResultSet rs;
    private PreparedStatement ps;
    private String tecnico;
    public String tequipo,marcae,modeloe,nserie,obser,est,ctecnicos;
    InformacionDelEquipo infoequipo=new InformacionDelEquipo();
    ControladorUsuariosClientesRegistrados admin=new ControladorUsuariosClientesRegistrados();
   
    
    public void inabilitaInfoEquipo(String username,JComboBox tipoequipo,JComboBox marca,JTextField modelo,JTextField numserie,JTextArea observaciones,JTextArea comentariostecnicos){
        rs=infoequipo.inabilitaInfoEquipo();
        String  validarusername;
        try {
            while(rs.next()){
                  validarusername=rs.getString("username");
                    //tecnico=validarusername;
                    if(username.equals(validarusername)){
                        tecnico=validarusername;
                        tipoequipo.setEnabled(false);
                        marca.setEnabled(false);
                        modelo.setEditable(false);
                        numserie.setEditable(false);
                        observaciones.setEditable(false);
                        comentariostecnicos.setEditable(true);
                        }
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
    
    public void validarIsAdmin(int idequipo,String username,JTextArea comentariostecnicos,JTextField ncliente){
        rs=infoequipo.validarIsAdmin(idequipo);
        if(admin.validarUsername().equals(username)){
             comentariostecnicos.setEditable(true);
             try {
                while(rs.next()){
                   ncliente.setText(rs.getString("nombre_clientes"));
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
    }
    
    public void mostrarInfoEquipos(int idequipo,JComboBox tipoequipo,JComboBox marca,JTextField modelo,JTextField numserie,JTextField fechaingreso,JTextArea observaciones,JComboBox estatus,JTextField ultimamodificacion,JTextArea comentariostecnicos){
        rs=infoequipo.mostrarInfoEquipo(idequipo);
        
        try {
             while(rs.next()){
                    String dia=rs.getString("dia_ingreso");
                    String mes=rs.getString("mes_ingreso");
                    String anio=rs.getString("anio_ingreso");
                    String fecha=dia+" de "+mes+" del "+anio;
                   tipoequipo.setSelectedItem(rs.getString("tipo_equipo"));
                   marca.setSelectedItem(rs.getString("marca"));
                   modelo.setText(rs.getString("modelo"));
                   numserie.setText(rs.getString("num_serie"));
                   fechaingreso.setText(fecha);
                   observaciones.append(rs.getString("observaciones"));
                   estatus.setSelectedItem(rs.getString("estatus"));
                   ultimamodificacion.setText(rs.getString("ultima_modificacion"));
                   comentariostecnicos.setText(rs.getString("comentarios_tecnicos"));
                  
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
    
    public void actualizarInfoEquipos(int idequipo,String username,JTextField ultimamodificacion,JComboBox tipoequipo,JComboBox marca,JTextField modelo,JTextField numserie,JTextArea observaciones,JComboBox estatus,JTextArea comentariostecnicos){
        ps=infoequipo.actualizarInfoEquipo(idequipo);
        if(!tecnico.equals("")){
        username=ultimamodificacion.getText().trim();
        }
        try {
                ps.setString(1, (String)tipoequipo.getSelectedItem());
                ps.setString(2, (String)marca.getSelectedItem());
                ps.setString(3, modelo.getText().trim());
                ps.setString(4, numserie.getText().trim());
                ps.setString(5, observaciones.getText().trim());
                ps.setString(6, (String) estatus.getSelectedItem());
                ps.setString(7, username);
                ps.setString(8, comentariostecnicos.getText().trim());
                ps.setString(9, tecnico);
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                ps.close();
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    
    public void controlaBotonUpdateEquipos(int idequipo){
        rs=infoequipo.mostrarInfoEquipo(idequipo);
        try {
            if(rs.next()){
                   tequipo=rs.getString("tipo_equipo");
                   marcae=rs.getString("marca");
                   modeloe=rs.getString("modelo");
                   nserie=rs.getString("num_serie");
                   obser=rs.getString("observaciones");
                   est=rs.getString("estatus");
                   ctecnicos=rs.getString("comentarios_tecnicos");
            }
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage()); 
        }
    }
}
