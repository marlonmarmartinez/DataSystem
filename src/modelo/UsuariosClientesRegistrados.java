
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static modelo.AcccesoLogin.cn;

public class UsuariosClientesRegistrados {
    private Statement st;
    private ResultSet rs;
    public DefaultTableModel model;
    public String nombreusuario;
    public int idusuario;
    private boolean validar;
    
    public ResultSet mostrarUsuariosRegistrados(JTable tabla,boolean validar){
        this.validar=validar;
         model=new DefaultTableModel();
         if(validar==true){
                model.addColumn("Id Usuario");
                model.addColumn("Nombre");
                model.addColumn("UserName");
                model.addColumn("Permisos");
                model.addColumn("Estatus");
                tabla.setModel(model);
         }else{
             model.addColumn("Id Cliente");
                model.addColumn("Nombre");
                model.addColumn("E - mail");
                model.addColumn("Telefono");
                model.addColumn("Direccion");
                tabla.setModel(model);
         }
                
            try {
 
                cn = Conexion.conectar();
                st = cn.createStatement();
                if (validar == true) {
                    return rs = st.executeQuery("select id_usuario,nombre_usuario,username,tipo_nivel,estatus from usuarios");
                } else {
                    return rs = st.executeQuery("select id_clientes,nombre_clientes,mail_clientes,tel_clientes,dir_clientes from clientes");
                }
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
            return null;
    }
    
    public void eventoMouseClicked(java.awt.event.MouseEvent evt,JTable tabla){
        int row = tabla.rowAtPoint(evt.getPoint());
        if (row >= 0 && tabla.isEnabled())
        {    
            if(validar==true){
             nombreusuario=tabla.getValueAt(row,2).toString();
             idusuario=Integer.parseInt(tabla.getValueAt(row, 0).toString());
            }else{
                nombreusuario=tabla.getValueAt(row,1).toString();
             idusuario=Integer.parseInt(tabla.getValueAt(row, 0).toString());
            }
        }
    }
    public ResultSet validarUsername(){
        try {  
                cn=Conexion.conectar();
                st=cn.createStatement();
                return rs=st.executeQuery("select username,tipo_nivel from usuarios where tipo_nivel='Administrador'");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error al conectar a la BBDD contacte al administrador: "+e.getMessage());
        }
        return null;
    }
}
