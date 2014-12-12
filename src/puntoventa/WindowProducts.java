
package puntoventa;

import puntoventa.Models.Model_products;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class WindowProducts extends javax.swing.JFrame {

    private Model_products dbProducts0= new Model_products();

    public WindowProducts() {
        initComponents();
        refreshTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPanel1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        }
        ;
        jPanel1 = new javax.swing.JPanel();
        inputName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputPurchasePrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        inputSalePrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputBarcode = new javax.swing.JTextField();
        chkBulkSale = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        labelMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "P. de Costo", "P. de Venta", "Venta a granel", "Código de Barras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProducts.setSelectionBackground(new java.awt.Color(111, 255, 78));
        tableProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductsMouseClicked(evt);
            }
        });
        jScrollPanel1.setViewportView(tableProducts);
        if (tableProducts.getColumnModel().getColumnCount() > 0) {
            tableProducts.getColumnModel().getColumn(0).setResizable(false);
            tableProducts.getColumnModel().getColumn(0).setPreferredWidth(3);
            tableProducts.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            tableProducts.getColumnModel().getColumn(1).setPreferredWidth(2);
            tableProducts.getColumnModel().getColumn(1).setHeaderValue("P. de Costo");
            tableProducts.getColumnModel().getColumn(2).setResizable(false);
            tableProducts.getColumnModel().getColumn(2).setPreferredWidth(2);
            tableProducts.getColumnModel().getColumn(2).setHeaderValue("P. de Venta");
            tableProducts.getColumnModel().getColumn(3).setResizable(false);
            tableProducts.getColumnModel().getColumn(3).setPreferredWidth(1);
            tableProducts.getColumnModel().getColumn(3).setHeaderValue("Venta a granel");
            tableProducts.getColumnModel().getColumn(4).setResizable(false);
            tableProducts.getColumnModel().getColumn(4).setPreferredWidth(2);
            tableProducts.getColumnModel().getColumn(4).setHeaderValue("Código de Barras");
        }

        jPanel1.setBackground(new java.awt.Color(159, 255, 151));

        inputName.setNextFocusableComponent(inputPurchasePrice);
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        inputPurchasePrice.setNextFocusableComponent(inputSalePrice);
        inputPurchasePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPurchasePriceActionPerformed(evt);
            }
        });
        inputPurchasePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputPurchasePriceKeyTyped(evt);
            }
        });

        jLabel2.setText("P. de Costo");

        btnSave.setForeground(new java.awt.Color(31, 164, 1));
        btnSave.setText("Guardar");
        btnSave.setNextFocusableComponent(inputBarcode);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cerrar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(222, 0, 0));
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("P. de Venta");

        inputSalePrice.setNextFocusableComponent(chkBulkSale);
        inputSalePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSalePriceActionPerformed(evt);
            }
        });
        inputSalePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputSalePriceKeyTyped(evt);
            }
        });

        jLabel4.setText("Código");

        inputBarcode.setNextFocusableComponent(inputName);
        inputBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBarcodeActionPerformed(evt);
            }
        });

        chkBulkSale.setBackground(new java.awt.Color(159, 255, 151));
        chkBulkSale.setText("Venta a granel");
        chkBulkSale.setNextFocusableComponent(btnSave);
        chkBulkSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBulkSaleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel5.setText("Productos");

        labelMessage.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        labelMessage.setText(" ");
        labelMessage.setMaximumSize(new java.awt.Dimension(30, 16));
        labelMessage.setMinimumSize(new java.awt.Dimension(30, 16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkBulkSale)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputBarcode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(inputName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputPurchasePrice, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputSalePrice, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkBulkSale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void tableProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductsMouseClicked
        int row=tableProducts.getSelectedRow();
        String barcode=tableProducts.getModel().getValueAt(row,4).toString();
        Product prod0;
        try {
            prod0 = Model_products.getProduct(barcode);
            this.inputBarcode.setBackground(Color.white);
            this.inputBarcode.setText(barcode);
            this.inputName.setText(prod0.name);
            this.inputPurchasePrice.setText(Integer.toString(prod0.purchase_price));
            this.inputSalePrice.setText(Integer.toString(prod0.sale_price));
            if(prod0.bulk_sale==1) this.chkBulkSale.setSelected(true);
            else this.chkBulkSale.setSelected(false);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(WindowProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableProductsMouseClicked
    
    
    
    private void inputBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBarcodeActionPerformed
        if(inputBarcode.getText().isEmpty()){
            inputBarcode.setBackground(Color.pink);
            labelMessage.setText("Campo \"Código\" vacío");
        }else{
            try {
                Product prod0=Model_products.getProduct(inputBarcode.getText());
                if(prod0!=null){
                    this.inputName.setText(prod0.name);
                    this.inputPurchasePrice.setText(Integer.toString(prod0.purchase_price));
                    this.inputSalePrice.setText(Integer.toString(prod0.sale_price));
                    if(prod0.bulk_sale==1) this.chkBulkSale.setSelected(true);
                    else this.chkBulkSale.setSelected(false);
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(WindowProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
            inputBarcode.setBackground(Color.white);
            labelMessage.setText("");
            inputName.requestFocus();
        }
        inputName.requestFocus();
    }//GEN-LAST:event_inputBarcodeActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        if(inputName.getText().isEmpty()){
            labelMessage.setForeground(Color.red);
            inputName.setBackground(Color.pink);
            labelMessage.setText("Campo \"Nombre\" vacío");
        }else{
            inputName.setBackground(Color.white);
            labelMessage.setText("");
        }
        inputPurchasePrice.requestFocus();
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputPurchasePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPurchasePriceActionPerformed
        if(inputPurchasePrice.getText().isEmpty()){
            labelMessage.setForeground(Color.red);
            inputPurchasePrice.setBackground(Color.pink);
            labelMessage.setText("Campo \"P. de Costo\" vacío");
        }else{
            inputPurchasePrice.setBackground(Color.white);
            labelMessage.setText("");
        }
        inputSalePrice.requestFocus();
    }//GEN-LAST:event_inputPurchasePriceActionPerformed

    private void inputSalePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSalePriceActionPerformed
        if(inputSalePrice.getText().isEmpty()){
            labelMessage.setForeground(Color.red);
            inputSalePrice.setBackground(Color.pink);
            labelMessage.setText("Campo \"P. de Venta\" vacío");
        }else{
            inputSalePrice.setBackground(Color.white);
            labelMessage.setText("");
        }
        chkBulkSale.requestFocus();
    }//GEN-LAST:event_inputSalePriceActionPerformed

    private void chkBulkSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBulkSaleActionPerformed
        btnSave.requestFocus();
    }//GEN-LAST:event_chkBulkSaleActionPerformed
    
    
    
    
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String barcode=inputBarcode.getText();
        String name=inputName.getText();
        int purchase_price=Integer.parseInt(inputPurchasePrice.getText());
        int sale_price=Integer.parseInt(inputSalePrice.getText());
        int bulk=chkBulkSale.isSelected()?1:0;
        if(!(barcode.isEmpty() || name.isEmpty() || purchase_price==0 || sale_price==0)){
            Product prod0=new Product(barcode, name, purchase_price, sale_price, bulk);
            switch(Model_products.storeProduct(prod0)){
                case 0:{
                    labelMessage.setForeground(Color.red);
                    labelMessage.setText("Error guardando");
                    break;
                }
                case 1:{
                    labelMessage.setForeground(Color.decode("#148700"));
                    labelMessage.setText(name + " Agregado");
                    break;
                }
                case 2:{
                    labelMessage.setForeground(Color.decode("#BD5800"));
                    labelMessage.setText(name + " Editado");
                    break;
                }
            }
            refreshTable();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String barcode=this.inputBarcode.getText();
        if(!barcode.isEmpty()){
            try {
                Product prod0=Model_products.getProduct(barcode);
                if(Model_products.eraseProduct(barcode)){
                    labelMessage.setForeground(Color.decode("#BD5800"));
                    labelMessage.setText(prod0.name + " Borrado");
                    refreshTable();
                }else{
                    labelMessage.setForeground(Color.decode("#BD5800"));
                    labelMessage.setText(prod0.name + " Involucrado en ventas\n no borrable");
                    refreshTable();
                }
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(WindowProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void inputPurchasePriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPurchasePriceKeyTyped
        Character c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_inputPurchasePriceKeyTyped

    private void inputSalePriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSalePriceKeyTyped
        Character c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_inputSalePriceKeyTyped



    private void refreshTable(){
        try{
            ArrayList<Product> products=Model_products.getAllProducts();
            DefaultTableModel tablemodel0=new DefaultTableModel();
            this.tableProducts.setModel(tablemodel0);

            tablemodel0.addColumn("Nombre");
            tablemodel0.addColumn("P. de Costo");
            tablemodel0.addColumn("P. de Venta");
            tablemodel0.addColumn("Venta a Granel");
            tablemodel0.addColumn("Código de Barras");
            for(Product product:products){
                Object[] row0=new Object[5];
                row0[0]=product.name;
                row0[1]=product.purchase_price;
                row0[2]=product.sale_price;
                if(product.bulk_sale==0) row0[3]="";
                else row0[3]="Granel";
                row0[4]=product.barcode;
                tablemodel0.addRow(row0);
            }
        }catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkBulkSale;
    private javax.swing.JTextField inputBarcode;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPurchasePrice;
    private javax.swing.JTextField inputSalePrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPanel1;
    private javax.swing.JLabel labelMessage;
    private javax.swing.JTable tableProducts;
    // End of variables declaration//GEN-END:variables
}
