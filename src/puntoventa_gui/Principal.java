/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa_gui;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.jgoodies.looks.plastic.theme.DesertRed;
import com.jgoodies.looks.plastic.theme.SkyBlue;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author USER
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        setExtendedState(Principal.MAXIMIZED_BOTH);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoModulos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnInventarios = new javax.swing.JToggleButton();
        btnVentas = new javax.swing.JToggleButton();
        contenedorModulos = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        grupoModulos.add(btnInventarios);
        btnInventarios.setText("Inventarios");
        btnInventarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventariosActionPerformed(evt);
            }
        });

        grupoModulos.add(btnVentas);
        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInventarios, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );

        contenedorModulos.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout contenedorModulosLayout = new javax.swing.GroupLayout(contenedorModulos);
        contenedorModulos.setLayout(contenedorModulosLayout);
        contenedorModulosLayout.setHorizontalGroup(
            contenedorModulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        contenedorModulosLayout.setVerticalGroup(
            contenedorModulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorModulos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorModulos)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    InventariosFrame inventarios;
    private void btnInventariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventariosActionPerformed
        if(inventarios==null){
            inventarios = new InventariosFrame();
            contenedorModulos.add(inventarios);
            contenedorModulos.getDesktopManager().maximizeFrame(inventarios);
            inventarios.setVisible(true);
        }else{
            contenedorModulos.getDesktopManager().maximizeFrame(inventarios);
        }
    }//GEN-LAST:event_btnInventariosActionPerformed
    
    VentasFrame ventas;
    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        if(ventas==null){
            ventas = new VentasFrame();
            contenedorModulos.add(ventas);
            contenedorModulos.getDesktopManager().maximizeFrame(ventas);
            ventas.setVisible(true);
        }else{
            contenedorModulos.getDesktopManager().maximizeFrame(ventas);
        }     
    }//GEN-LAST:event_btnVentasActionPerformed

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
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

            /*UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");*/
            /*javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");*/
            
            /*Plastic3DLookAndFeel.setPlasticTheme(new SkyBlue());
            UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticLookAndFeel");*/
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
        getImage(ClassLoader.getSystemResource("resources/icono.png"));
        return retValue;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnInventarios;
    private javax.swing.JToggleButton btnVentas;
    private javax.swing.JDesktopPane contenedorModulos;
    private javax.swing.ButtonGroup grupoModulos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
