
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static modelo.AcccesoLogin.cn;

public class InformacionDelCliente {
    private PreparedStatement ps;
    private ResultSet rs;
    public DefaultTableModel model;
    public int idequipo;
    
    public ResultSet consultarInfoCliente(int idcliente) {
        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement("select nombre_clientes,mail_clientes,tel_clientes,dir_clientes,ultima_modificacion from clientes where id_clientes='" + idcliente + "'");
            return rs = ps.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
        }
        return null;
    }
    
    public ResultSet consultarInfoEquipo(int idcliente,JTable tabla){
         model=new DefaultTableModel();
                
                model.addColumn("Id Equipo");
                model.addColumn("Tipo De Equipo");
                model.addColumn("Marca");
                model.addColumn("Estatus");
                tabla.setModel(model);
                
                try {
               
                cn=Conexion.conectar();
                ps=cn.prepareStatement("select id_equipos,tipo_equipo,marca,estatus from equipos where id_cliente="+idcliente);
                return rs=ps.executeQuery();
             
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
                return null;
    }
    
    public void eventoMouseClicked(java.awt.event.MouseEvent evt,JTable tabla){
        int row = tabla.rowAtPoint(evt.getPoint());
        if (row >= 0 && tabla.isEnabled())
        {
              idequipo=Integer.parseInt(tabla.getValueAt(row, 0).toString());
        }
    }
    
    public PreparedStatement actualizarInfoCliente(int idcliente){
    
            try {
                cn = Conexion.conectar();
                return ps = cn.prepareStatement("update clientes set nombre_clientes=?, mail_clientes=?, tel_clientes=?,dir_clientes=?,ultima_modificacion=? where id_clientes='" + idcliente + "'");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error al conectar a la BBDD contacte al administrador: " + e.getMessage());
            }
        
        return null;
    }        
}
