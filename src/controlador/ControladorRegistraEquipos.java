
package controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import modelo.RegistrarEquipos;


public class ControladorRegistraEquipos {
    private PreparedStatement ps;
    RegistrarEquipos registrar=new RegistrarEquipos();
    
    public void registrareEquipos(String username,int idcliente,JComboBox tipoequipo,JComboBox marca,JTextField modelo,JTextField numserie,JTextArea daños){
        ps=registrar.registrarEquipos();
        Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        String idcli=Integer.toString(idcliente); String user=username;
        try {
           
            ps.setString(1,"0");
            ps.setString(2, idcli);
            ps.setString(3, (String) tipoequipo.getSelectedItem());
            ps.setString(4, (String) marca.getSelectedItem());
            ps.setString(5, modelo.getText().trim());
            ps.setString(6, numserie.getText().trim());
            ps.setInt(7, dia);
            ps.setInt(8, mes);
            ps.setInt(9, año);         
            ps.setString(10, daños.getText().trim());
            ps.setString(11, "Nuevo ingreso");
            ps.setString(12, user);
            ps.setString(13, "");
            ps.setString(14, "");
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
