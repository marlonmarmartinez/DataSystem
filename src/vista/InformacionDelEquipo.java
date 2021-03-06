/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorInfoEquipo;
import controlador.FondoVentana;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Lnv
 */
public class InformacionDelEquipo extends javax.swing.JFrame {
        int idequipo;
        String nomcli,username,tecnico="";
        ControladorInfoEquipo infoequipo=new ControladorInfoEquipo();
    /**
     * Creates new form RegistrarEquipos
     */
    public InformacionDelEquipo() {
        initComponents();
    }
    public InformacionDelEquipo(String nomcli,int idequipo,String username) {
        initComponents();
        this.idequipo=idequipo;
        this.nomcli=nomcli;
        this.username=username;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Equipo del cliente "+nomcli+"-sesion de "+username);
        txtncliente.setText(nomcli);
        
        infoequipo.mostrarInfoEquipos(idequipo, comotipoequipo, combomarca, txtmodelo, txtnumserie, txtfechaingreso, txtareaobservaciones, comboestatus, txtultimamodificaion, txtareacomentariostecnicos);
        infoequipo.inabilitaInfoEquipo(username, comotipoequipo, combomarca, txtmodelo, txtnumserie, txtareaobservaciones, txtareacomentariostecnicos);
        infoequipo.validarIsAdmin(idequipo, username, txtareacomentariostecnicos, txtncliente);
        
        
        FondoVentana fondo=new FondoVentana();
        fondo.FondoVentas(this);
    }
   
    
    @Override
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
       
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtncliente = new javax.swing.JTextField();
        comotipoequipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        combomarca = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnumserie = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtultimamodificaion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfechaingreso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboestatus = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaobservaciones = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareacomentariostecnicos = new javax.swing.JTextArea();
        btnactualizarequipo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informacion del Equipo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del cliente :");

        txtncliente.setEditable(false);
        txtncliente.setBackground(new java.awt.Color(153, 153, 255));
        txtncliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtncliente.setForeground(new java.awt.Color(255, 255, 255));
        txtncliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtncliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnclienteActionPerformed(evt);
            }
        });
        txtncliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnclienteKeyReleased(evt);
            }
        });

        comotipoequipo.setBackground(new java.awt.Color(153, 153, 255));
        comotipoequipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comotipoequipo.setForeground(new java.awt.Color(255, 255, 255));
        comotipoequipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lapton", "Desktop", "Impresora", "Multifuncional", "Otros" }));
        comotipoequipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comotipoequipoItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de Equipo");

        combomarca.setBackground(new java.awt.Color(153, 153, 255));
        combomarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combomarca.setForeground(new java.awt.Color(255, 255, 255));
        combomarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HP", "ACER", "LENOVO", "DELL", "ASUS", "APPLE", "TOSHIBA", "SAMSUMG", "VAIO", "SONY", "LG", "COMPAQ", "IBM", "EPSON", "CANON", "OTROS" }));
        combomarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combomarcaItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marca ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Modelo");

        txtmodelo.setBackground(new java.awt.Color(153, 153, 255));
        txtmodelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtmodelo.setForeground(new java.awt.Color(255, 255, 255));
        txtmodelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmodelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmodeloKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero de serie ");

        txtnumserie.setBackground(new java.awt.Color(153, 153, 255));
        txtnumserie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnumserie.setForeground(new java.awt.Color(255, 255, 255));
        txtnumserie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumserie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnumserieKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ultima modificacion por ");

        txtultimamodificaion.setEditable(false);
        txtultimamodificaion.setBackground(new java.awt.Color(153, 153, 255));
        txtultimamodificaion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtultimamodificaion.setForeground(new java.awt.Color(255, 255, 255));
        txtultimamodificaion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtultimamodificaion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha de ingreso");

        txtfechaingreso.setEditable(false);
        txtfechaingreso.setBackground(new java.awt.Color(153, 153, 255));
        txtfechaingreso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtfechaingreso.setForeground(new java.awt.Color(255, 255, 255));
        txtfechaingreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estatus");

        comboestatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboestatus.setForeground(new java.awt.Color(255, 255, 255));
        comboestatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo ingreso", "No reparado", "En revision", "Reparado", "Entregado", "Otro" }));
        comboestatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboestatusItemStateChanged(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Daño reportado y observaciones");

        txtareaobservaciones.setColumns(20);
        txtareaobservaciones.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtareaobservaciones.setRows(5);
        txtareaobservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtareaobservacionesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtareaobservaciones);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Comentarios y actualizacion de tecnicos");

        txtareacomentariostecnicos.setEditable(false);
        txtareacomentariostecnicos.setColumns(20);
        txtareacomentariostecnicos.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtareacomentariostecnicos.setRows(5);
        txtareacomentariostecnicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtareacomentariostecnicosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtareacomentariostecnicos);

        btnactualizarequipo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnactualizarequipo.setText("Actualizar Equipo");
        btnactualizarequipo.setEnabled(false);
        btnactualizarequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarequipoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Creado por Marlon ®");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2)
                                .addComponent(txtncliente)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(combomarca, 0, 191, Short.MAX_VALUE)
                                .addComponent(comotipoequipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(txtnumserie)
                                .addComponent(txtultimamodificaion, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(comboestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1)
                                .addComponent(jScrollPane2)
                                .addComponent(jLabel11))
                            .addComponent(btnactualizarequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtncliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfechaingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboestatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comotipoequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combomarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtultimamodificaion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnactualizarequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnclienteActionPerformed

    private void btnactualizarequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarequipoActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");
        
         if(confirmar == JOptionPane.YES_OPTION){
             infoequipo.actualizarInfoEquipos(idequipo, username, txtultimamodificaion, comotipoequipo, combomarca, txtmodelo, txtnumserie, txtareaobservaciones, comboestatus, txtareacomentariostecnicos);
             dispose();
         }else{
             txtareaobservaciones.setText("");
             infoequipo.mostrarInfoEquipos(idequipo, comotipoequipo, combomarca, txtmodelo, txtnumserie, txtfechaingreso, txtareaobservaciones, comboestatus, txtultimamodificaion, txtareacomentariostecnicos);
         }
    }//GEN-LAST:event_btnactualizarequipoActionPerformed

    private void txtnclienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnclienteKeyReleased
       
    }//GEN-LAST:event_txtnclienteKeyReleased

    private void comotipoequipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comotipoequipoItemStateChanged
        infoequipo.controlaBotonUpdateEquipos(idequipo);
        if(!infoequipo.tequipo.equals(evt.getItem())){
        btnactualizarequipo.setEnabled(true);
        }else{
        btnactualizarequipo.setEnabled(false);
        }
    }//GEN-LAST:event_comotipoequipoItemStateChanged

    private void combomarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combomarcaItemStateChanged
        if(!infoequipo.marcae.equals(evt.getItem())){
        btnactualizarequipo.setEnabled(true);
        }else{
        btnactualizarequipo.setEnabled(false);
        }
    }//GEN-LAST:event_combomarcaItemStateChanged

    private void txtmodeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmodeloKeyReleased
        infoequipo.controlaBotonUpdateEquipos(idequipo);
        if(!infoequipo.modeloe.equals(txtmodelo.getText())){
            btnactualizarequipo.setEnabled(true);
        }else{
            btnactualizarequipo.setEnabled(false);
        }
    }//GEN-LAST:event_txtmodeloKeyReleased

    private void txtnumserieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumserieKeyReleased
        if(!infoequipo.nserie.equals(txtnumserie.getText())){
            btnactualizarequipo.setEnabled(true);
        }else{
            btnactualizarequipo.setEnabled(false);
        }
    }//GEN-LAST:event_txtnumserieKeyReleased

    private void comboestatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboestatusItemStateChanged
        
        if(!infoequipo.est.equals(evt.getItem())){
        btnactualizarequipo.setEnabled(true);
        }else{
        btnactualizarequipo.setEnabled(false);
        }
    }//GEN-LAST:event_comboestatusItemStateChanged

    private void txtareaobservacionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtareaobservacionesKeyReleased
         if(!infoequipo.obser.equals(txtareaobservaciones.getText())){
        btnactualizarequipo.setEnabled(true);
        }else{
        btnactualizarequipo.setEnabled(false);
        }
    }//GEN-LAST:event_txtareaobservacionesKeyReleased

    private void txtareacomentariostecnicosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtareacomentariostecnicosKeyReleased
        if(!infoequipo.ctecnicos.equals(txtareacomentariostecnicos.getText())){
        btnactualizarequipo.setEnabled(true);
        }else{
        btnactualizarequipo.setEnabled(false);
        }
    }//GEN-LAST:event_txtareacomentariostecnicosKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InformacionDelEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionDelEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionDelEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionDelEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionDelEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizarequipo;
    private javax.swing.JComboBox<String> comboestatus;
    private javax.swing.JComboBox<String> combomarca;
    private javax.swing.JComboBox<String> comotipoequipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtareacomentariostecnicos;
    private javax.swing.JTextArea txtareaobservaciones;
    private javax.swing.JTextField txtfechaingreso;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtncliente;
    private javax.swing.JTextField txtnumserie;
    private javax.swing.JTextField txtultimamodificaion;
    // End of variables declaration//GEN-END:variables
}
