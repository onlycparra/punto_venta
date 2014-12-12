/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;
import puntoventa.Models.Model_users;
import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author onlycparra
 */
public class WindowUsers extends javax.swing.JFrame {
    
    private Model_users dbusers0;
    private String tempPass="12345";
    
    public WindowUsers() {
        dbusers0= new Model_users();
        initComponents();
        refreshTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup0 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };
        }
        ;
        jPanel1 = new javax.swing.JPanel();
        inputName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radAdmin = new javax.swing.JRadioButton();
        radVend = new javax.swing.JRadioButton();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        inputPass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        labelMessage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(653, 297));
        setResizable(false);

        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Nombre Usuario", "Nombre", "Nivel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUsers.setSelectionBackground(new java.awt.Color(78, 191, 255));
        tableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableUsers);

        jPanel1.setBackground(new java.awt.Color(186, 220, 253));

        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Contraseña");

        radAdmin.setBackground(new java.awt.Color(186, 220, 253));
        btnGroup0.add(radAdmin);
        radAdmin.setText("Administrador");

        radVend.setBackground(new java.awt.Color(186, 220, 253));
        btnGroup0.add(radVend);
        radVend.setSelected(true);
        radVend.setText("Vendedor");

        saveBtn.setForeground(new java.awt.Color(31, 164, 1));
        saveBtn.setText("Guardar");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cerrar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        deleteBtn.setForeground(new java.awt.Color(222, 0, 0));
        deleteBtn.setText("Eliminar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel3.setText("Usuarios");

        inputPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPassActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator1.setForeground(new java.awt.Color(1, 1, 1));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        labelMessage.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        labelMessage.setText(" ");
        labelMessage.setMaximumSize(new java.awt.Dimension(30, 16));
        labelMessage.setMinimumSize(new java.awt.Dimension(30, 16));

        jLabel4.setText("Usuario");

        inputUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputPass, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(inputName)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(radAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radVend))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputUser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radAdmin)
                    .addComponent(radVend)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(labelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn)
                    .addComponent(deleteBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void tableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsersMouseClicked
        int row=tableUsers.getSelectedRow();
        String username=tableUsers.getModel().getValueAt(row,0).toString();
        try {
            User user0 = Model_users.getUser(username);
            this.inputUser.setBackground(Color.white);
            this.inputUser.setText(user0.username);
            this.inputName.setText(user0.name);
            tempPass=user0.pass;
            this.inputPass.setText("12345");
            switch(user0.level){
                case 1: radVend.setSelected(true);radAdmin.setSelected(false);break;
                case 2: radVend.setSelected(false);radAdmin.setSelected(false);break;
                case 3: radVend.setSelected(false);radAdmin.setSelected(true);break;
                default: radVend.setSelected(false);radAdmin.setSelected(false);break;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(WindowProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableUsersMouseClicked



    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        inputPass.requestFocus();
    }//GEN-LAST:event_inputNameActionPerformed
    
    private void inputPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPassActionPerformed
        saveBtn.requestFocus();
    }//GEN-LAST:event_inputPassActionPerformed



    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String username=inputUser.getText();
        String name=inputName.getText();
        String pass=new String(inputPass.getPassword());
        if(pass.equals("12345")) pass=tempPass;//if passwors hasn't been touched, we just store the original one.
        else try {
            pass=Security.encryptPassword(pass);//otherwise, we encrypt it to be stored
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(WindowUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        int level=radVend.isSelected()?1:3;
        inputUser.setBackground(Color.white);
        if(!(username.isEmpty() || name.isEmpty() || pass.isEmpty())){
            User user0=new User(username,name,pass,level);

            switch(Model_users.storeUser(user0)){
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
        }
        refreshTable();
        tempPass="12345";//reset tempPAss for a possible next user.
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        inputUser.setBackground(Color.white);
        String username=inputUser.getText();
        if(!username.isEmpty()){
            try {
                User user0=Model_users.getUser(username);
                Model_users.eraseUser(username);
                labelMessage.setForeground(Color.decode("#BD5800"));
                labelMessage.setText(user0.name+" Borrado");
                refreshTable();
            } catch (SQLException | ClassNotFoundException ex){
                Logger.getLogger(WindowProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void inputUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUserActionPerformed
        if(inputUser.getText().isEmpty()){
            inputUser.setBackground(Color.pink);
            labelMessage.setText("Campo \"Código\" vacío");
        }else{
            try {
                User user0=Model_users.getUser(inputUser.getText());
                this.inputName.setText(user0.name);
                tempPass=user0.pass;
                this.inputPass.setText("12345");
                switch(user0.level){
                    case 1: radVend.setSelected(true);radAdmin.setSelected(false);break;
                    case 2: radVend.setSelected(false);radAdmin.setSelected(false);break;
                    case 3: radVend.setSelected(false);radAdmin.setSelected(true);break;
                    default: radVend.setSelected(false);radAdmin.setSelected(false);break;
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(WindowProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
            inputUser.setBackground(Color.white);
            labelMessage.setText("");
        }
        inputName.requestFocus();
    }//GEN-LAST:event_inputUserActionPerformed

    
    private void refreshTable(){
        try{
            ArrayList<User> users=Model_users.getAllUsers();
            DefaultTableModel tablemodel0=new DefaultTableModel();
            this.tableUsers.setModel(tablemodel0);

            tablemodel0.addColumn("Usuario");
            tablemodel0.addColumn("Nombre");
            tablemodel0.addColumn("Nivel");
            for(User user:users){
                Object[] row0=new Object[5];
                row0[0]=user.username;
                row0[1]=user.name;
                switch(user.level){
                    case 1: row0[2]="Vendedor";break;
                    case 2: row0[2]="Reponedor";break;
                    case 3: row0[2]="Administrador";break;
                    default: row0[2]="Cargo Místico";
                }
                tablemodel0.addRow(row0);
            }
        }catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup0;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField inputName;
    private javax.swing.JPasswordField inputPass;
    private javax.swing.JTextField inputUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelMessage;
    private javax.swing.JRadioButton radAdmin;
    private javax.swing.JRadioButton radVend;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTable tableUsers;
    // End of variables declaration//GEN-END:variables
}
