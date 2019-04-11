
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import modelo.GestionDeEquipos;


public class ControladorGestionaEquipos {
    private ResultSet rs;
    GestionDeEquipos equipos=new GestionDeEquipos();
    
    public void gestionaEquipos(JComboBox estatus,JTable tabla){
        rs=equipos.mostrarInfoEquipos(estatus, tabla);
        try {
             Object []datos=new Object[4];
            while(rs.next()){
                    for (int i = 0; i < 4; i++) {
                        datos[i]=rs.getString(1+i);
                    }
                  equipos.model.addRow(datos);
                }
                rs.close();
            
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
