
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static modelo.AcccesoLogin.cn;


public class GestionDeEquipos {
    private ResultSet rs;
    private PreparedStatement enviatodosestatus,enviafiltroestatus;
    public DefaultTableModel model;
    private String estatus,todosestatus,filtroestatus;
    
     public ResultSet mostrarInfoEquipos(JComboBox comboestatus,JTable tabla){
         estatus=(String) comboestatus.getSelectedItem();
         todosestatus="select id_equipos,tipo_equipo,marca,estatus from equipos";
         filtroestatus="select id_equipos,tipo_equipo,marca,estatus from equipos where estatus=?";

         model=new DefaultTableModel();
                
                model.addColumn("Id Equipo");
                model.addColumn("Tipo De Equipo");
                model.addColumn("Marca");
                model.addColumn("Estatus");
                tabla.setModel(model);
                
                    try {
                
                cn=Conexion.conectar();
                if(estatus.equals("Todos")){
                    enviatodosestatus=cn.prepareStatement(todosestatus);
                    return rs=enviatodosestatus.executeQuery();
                }
                if(estatus.equals("Nuevo ingreso") || estatus.equals("No reparado") || estatus.equals("En revision") || estatus.equals("Reparado") || estatus.equals("Entregado") || estatus.equals("Otro")){
                    enviafiltroestatus=cn.prepareStatement(filtroestatus);
                    enviafiltroestatus.setString(1, estatus);
                    return rs=enviafiltroestatus.executeQuery();
                }
               
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
                    return null;
     }
}
