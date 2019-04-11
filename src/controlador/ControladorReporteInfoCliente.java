
package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.AcccesoLogin;
import static modelo.AcccesoLogin.cn;
import modelo.Conexion;
import vista.InformacionDelCliente;


public class ControladorReporteInfoCliente {
    
    public void reporte(int idcliente)  throws DocumentException{
        Document documento=new Document();
        
        try {
            String ruta=System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Desktop/Reporte_info_cliente"+idcliente+".pdf"));
            
                URL resUrl = this.getClass().getResource("/images/bannerpdf.png");
                Image header=Image.getInstance(resUrl);
                header.scaleToFit(1000,100);
                header.setAlignment(Chunk.ALIGN_CENTER);
                
                
                
            Paragraph parrafo=new Paragraph();
            Paragraph parrafo1=new Paragraph();
            Paragraph parrafo2=new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo1.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tahoma",18,Font.BOLD,BaseColor.BLUE));
            parrafo1.add("Informacion del Cliente\n\n");      
            parrafo2.add("\n\n");
            documento.open();
            documento.add(parrafo);
            documento.add(header);
            documento.add(parrafo2);
            documento.add(parrafo1);
            
            PdfPTable tabla=new PdfPTable(5);
            tabla.setWidthPercentage(100);
            tabla.addCell("ID");
            tabla.addCell("Nombre");
            tabla.addCell("E - mail");
            tabla.addCell("Telefono");
            tabla.addCell("Direccion");
            
            try {
                cn=Conexion.conectar();
                PreparedStatement ps=cn.prepareStatement("select id_clientes,nombre_clientes,mail_clientes,tel_clientes,dir_clientes from clientes where id_clientes="+idcliente);
                ResultSet rs=ps.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                    documento.add(tabla);
                }
                documento.add(parrafo2);
                rs.close();
            } catch (DocumentException | SQLException e) {
                JOptionPane.showMessageDialog(null, "error en conectar a la BBDD"+e.getMessage());
            }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            
            //reporte de equipos
            try {
                Paragraph parrafoe1=new Paragraph();
            parrafoe1.setAlignment(Paragraph.ALIGN_CENTER);
            parrafoe1.add("Equipos Registrados\n\n");      
            
            PdfPTable tablae=new PdfPTable(4);
            tablae.setWidthPercentage(100);
            tablae.addCell("ID equipo");
            tablae.addCell("Tipo de equipo");
            tablae.addCell("Marca");
            tablae.addCell("Estatus");
            int id=0;
                cn=Conexion.conectar();
                PreparedStatement pse=cn.prepareStatement("select id_equipos,id_cliente,tipo_equipo,marca,estatus from equipos where id_cliente="+idcliente);
                ResultSet rse=pse.executeQuery();
                if(rse.next()){
                      id=Integer.parseInt(rse.getString(2));
                     if(id==idcliente){
                    documento.add(parrafoe1);
                }
                    do {
                        tablae.addCell(rse.getString(1));
                        tablae.addCell(rse.getString(3));
                        tablae.addCell(rse.getString(4));
                        tablae.addCell(rse.getString(5));

                    } while (rse.next());
                    documento.add(tablae);
                }
               
                rse.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error en conectar a la BBDD"+e.getMessage());
            }finally {
                try {
                    cn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AcccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
          
            documento.close();
            JOptionPane.showMessageDialog(null, "reporte creado");
     
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "error en conectar a la BBDD"+e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(InformacionDelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
