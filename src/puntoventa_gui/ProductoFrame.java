/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa_gui;

import PuntoVenta_dat.BaseDatos;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import puntoVenta_pojos.CategoriaProd;
import puntoVenta_pojos.Producto;
import puntoVenta_pojos.Proveedor;

/**
 *
 * @author USER
 */
public class ProductoFrame extends javax.swing.JDialog {
    
    DefaultComboBoxModel <CategoriaProd> modeloCategorias;
    DefaultComboBoxModel <Proveedor> modeloProveedor;
    BaseDatos base;
    boolean estaActualizando;
    String informacion = "";

    /**
     * Creates new form ProducoFrame
     */
    public ProductoFrame(java.awt.Frame parent, boolean modal, Producto producto, ImageIcon icon, String titulo, boolean actualizando) {
        super(parent, modal);
        /*this.imgArticleFile = new File("C:\\Users\\Zenon\\Dropbox\\Zenon\\DesarrolloWeb\\java\\nofoto.png");*/
        modeloCategorias = new DefaultComboBoxModel<CategoriaProd>();
        modeloProveedor = new DefaultComboBoxModel<Proveedor>();
        base = new BaseDatos();
        cargarModeloCat();
        cargarModeloProv();
        initComponents();
        this.estaActualizando = actualizando;
        this.setTitle(titulo);
        if(producto!=null){
            cargarProducto(producto, icon);
        }
        this.setLocationRelativeTo(null);
    }
    
    private void cargarProducto(Producto producto, ImageIcon icono){
        
        //Redimensión de imagen para ajustarla al tamaño del JLabel.
        Image imgProd = icono.getImage();
        int anchoEtiqueta = lblImagenProducto.getWidth(); //Obtiene ancho de la imagen
        int altoEtiqueta = lblImagenProducto.getHeight(); //Obtiene alto de la imagen
                
        //Se crea un nuevo objeto Image con la imagen redimensionada.
        Image imgRedimensionada = imgProd.getScaledInstance(anchoEtiqueta, altoEtiqueta, Image.SCALE_DEFAULT);
               
        //Se crea un nuevo objeto ImageIcon a partir de la imagen redimensionada.
        ImageIcon iconRedimensionado = new ImageIcon(imgRedimensionada);
        
        lblImagenProducto.setIcon(iconRedimensionado);
        String clave = producto.getIdProducto();
        String nombre = producto.getNomProducto();
        String descripcion = producto.getDescProducto();
        double stockRequerido = producto.getStockProducto();
        String unidad = producto.getUnidadProducto();
        double precioCompra = producto.getPrecioCompraProducto();
        double precioVenta = producto.getPrecioVentaProducto();
        int pro = producto.getIdProveedor();
        
        Proveedor p = new Proveedor();
        p.setIdProveedor(pro);
       
       
        //comboProveedores.setSelectedItem(p);
        
        campoClave.setText(clave);
        campoNombre.setText(nombre);
        campoDesc.setText(descripcion);
        campoStock.setText(String.valueOf(stockRequerido));
        comboUnidades.setSelectedItem(unidad);
        campoPrecioCompra.setText(String.valueOf(precioCompra));
        campoPrecioVenta.setText(String.valueOf(precioVenta));
        campoProveedor.setText(String.valueOf(pro));
        comboProveedores.setSelectedItem(p);
        
        
        campoClave.setEnabled(false);
        /*campoNombre.setEnabled(false);*/
    }
    
    private void cargarModeloCat(){
        ArrayList<CategoriaProd> listaCategorias;
        listaCategorias = base.obtenerCategorias();
        
        for(CategoriaProd categoria : listaCategorias){
            modeloCategorias.addElement(categoria);
        }
    }
    
    private void cargarModeloProv(){
        ArrayList<Proveedor> listaProveedores;
        listaProveedores = base.obtenerProveedores();
        
        for(Proveedor proveedor : listaProveedores){
            modeloProveedor.addElement(proveedor);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDesc = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        comboCategorias = new javax.swing.JComboBox<>();
        btnNuevaCategoria = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboUnidades = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoPrecioCompra = new javax.swing.JTextField();
        campoPrecioVenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoStock = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Proveedor = new javax.swing.JLabel();
        comboProveedores = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblImagenProducto = new javax.swing.JLabel();
        campoClave = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoProveedor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Código");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Descripción");

        campoNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        campoDesc.setColumns(20);
        campoDesc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        campoDesc.setRows(5);
        jScrollPane1.setViewportView(campoDesc);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Categoría");

        comboCategorias.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        comboCategorias.setModel(modeloCategorias);

        btnNuevaCategoria.setText("Nueva Categoría");
        btnNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoriaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Unidad medida");

        comboUnidades.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        comboUnidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pieza", "Caja", "Set", "Kilogramo", "Libra", "Litro", " " }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Precio Compra");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Precio Venta");

        campoPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        campoPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Stock requerido");

        campoStock.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        Proveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Proveedor.setText("Proveedor");

        comboProveedores.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        comboProveedores.setModel(modeloProveedor);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        lblImagenProducto.setBackground(new java.awt.Color(102, 102, 102));
        lblImagenProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblImagenProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImagenProductoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        campoClave.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nombre:");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNuevaCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(comboUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(Proveedor)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Proveedor)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoProveedor)
                        .addComponent(jButton2))
                    .addComponent(comboProveedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File imgArticleFile;
    private void lblImagenProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenProductoMousePressed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Archivos de imagen jpg, gif o png", "jpg", "gif", "png");
        chooser.setFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            int anchoImagen = lblImagenProducto.getWidth();
            int altoImagen = lblImagenProducto.getHeight();
            
            imgArticleFile = chooser.getSelectedFile();
            ImageIcon icono = new ImageIcon(imgArticleFile.getAbsolutePath());
            Image imagen = icono.getImage();
            Image imagenRedimensionada = imagen.getScaledInstance(anchoImagen, altoImagen, Image.SCALE_DEFAULT);
            
            ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
            
            lblImagenProducto.setIcon(iconoRedimensionado);
        }
    }//GEN-LAST:event_lblImagenProductoMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String codigo = campoClave.getText().toLowerCase();
        String nombre = campoNombre.getText().toLowerCase();
        String descripcion = campoDesc.getText().toLowerCase();
        double stock = Double.parseDouble(campoStock.getText());
        double precioCompra = Double.parseDouble(campoPrecioCompra.getText());
        double precioVenta = Double.parseDouble(campoPrecioVenta.getText());
        String unidad = comboUnidades.getSelectedItem().toString();
        CategoriaProd categoria = (CategoriaProd)comboCategorias.getSelectedItem();
        Proveedor proveedor = (Proveedor)comboProveedores.getSelectedItem();
        
        if(estaActualizando){
            if(imgArticleFile == null){
                Producto producto = new Producto(codigo, nombre, descripcion, 
                    stock, null, unidad, precioCompra, precioVenta, 
                    0.0, categoria.getIdCategoriaProd(), proveedor.getIdProveedor());
                
                 base.actualizarProducto(producto, false);
            }
            else{
                Producto producto = new Producto(codigo, nombre, descripcion, 
                    stock, imgArticleFile, unidad, precioCompra, precioVenta, 
                    0.0, categoria.getIdCategoriaProd(), proveedor.getIdProveedor());
                
                 base.actualizarProducto(producto, true);
            }
            
            JOptionPane.showMessageDialog(this, "Se ha guardado el producto");
            this.dispose();
            informacion = "1";
            
            /*if(imgArticleFile == null ){
                JOptionPane.showMessageDialog(this, "No ha elegido una fotografía de producto");
            }
            else{
                Producto producto = new Producto(codigo, nombre, descripcion, 
                    stock, imgArticleFile, unidad, precioCompra, precioVenta, 
                    0.0, categoria.getIdCategoriaProd(), proveedor.getIdProveedor());

                base.insertarProducto(producto);

                JOptionPane.showMessageDialog(this, "Se ha guardado el producto");
                this.dispose();
            }*/
        }else{
            
            
            if(imgArticleFile == null ){
                JOptionPane.showMessageDialog(this, "No ha elegido una fotografía de producto");
            }
            else{
                Producto producto = new Producto(codigo, nombre, descripcion, 
                    stock, imgArticleFile, unidad, precioCompra, precioVenta, 
                    0.0, categoria.getIdCategoriaProd(), proveedor.getIdProveedor());

                base.insertarProducto(producto);

                JOptionPane.showMessageDialog(this, "Se ha guardado el producto");
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public String getInformacion(){
        return this.informacion;
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaActionPerformed
        //aquí instanciaríamos un JDialog para CategoriaFrame
    CategoriaFrame catFrame = new CategoriaFrame(null, true);
    catFrame.setVisible(true);
    
 
    //Aquí hacemos una validación para determinar si la ventana ya se cerró. Esto lo conseguimos mediante
    //una variable que pondremos en la clase CategoriaFrame
    if(catFrame != null){
        //aquí valido que la variable informacion no esté vacía. Si quieres más información sobre esto,
        //ve el video donde se actualiza el articulo.
        if(catFrame.getInformacion()!=""){
           modeloCategorias.removeAllElements();
           cargarModeloCat();
        }
    }
    }//GEN-LAST:event_btnNuevaCategoriaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       Proveedor p = new Proveedor();
       p.setIdProveedor(3);
       
       comboProveedores.setSelectedItem(p);
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProductoFrame dialog = new ProductoFrame(new javax.swing.JFrame(), true, null, null, null, false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Proveedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevaCategoria;
    private javax.swing.JTextField campoClave;
    private javax.swing.JTextArea campoDesc;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPrecioCompra;
    private javax.swing.JTextField campoPrecioVenta;
    private javax.swing.JTextField campoProveedor;
    private javax.swing.JTextField campoStock;
    private javax.swing.JComboBox<CategoriaProd> comboCategorias;
    private javax.swing.JComboBox<Proveedor> comboProveedores;
    private javax.swing.JComboBox comboUnidades;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenProducto;
    // End of variables declaration//GEN-END:variables
}
