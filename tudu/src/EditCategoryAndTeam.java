
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viett
 */
public class EditCategoryAndTeam extends javax.swing.JFrame {

    /**
     * Creates new form EditCategoryAndTeam
     */
    
        /**
     * Creates new form ViewTasks
     */
    private int user_id = 0;
    private String user_name = "None";
    
        
    public int getUser_id(){
        return this.user_id;
    }
    
    public String getUser_name(){
        return this.user_name;
    }
    
    public void setUser_id(int id){
        this.user_id = id;
    }   
    
    public void setUser_name(String username){
        this.user_name = username;
    }
    public EditCategoryAndTeam() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Category_Edit = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Team_Edit = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Team_Name_Edit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Team_Owner_Edit = new javax.swing.JTextField();
        jButton_Edit_Team = new javax.swing.JButton();
        jButton_Delete_Team = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Category_Edit = new javax.swing.JTextField();
        jTextField_Category_Team = new javax.swing.JTextField();
        jButton_Category_Edit = new javax.swing.JButton();
        jButton_Category_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_Category_Edit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category_id", "Category_name", "Team_name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_Category_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Category_EditMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Category_Edit);

        jTable_Team_Edit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team_id", "Team_name", "Owner_name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_Team_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Team_EditMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Team_Edit);

        jLabel1.setText("Team_name");

        jTextField_Team_Name_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Team_Name_EditActionPerformed(evt);
            }
        });

        jLabel2.setText("Team_owner");

        jTextField_Team_Owner_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Team_Owner_EditActionPerformed(evt);
            }
        });

        jButton_Edit_Team.setText("Edit Team");
        jButton_Edit_Team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_TeamActionPerformed(evt);
            }
        });

        jButton_Delete_Team.setText("Delete Team");
        jButton_Delete_Team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_TeamActionPerformed(evt);
            }
        });

        jLabel3.setText("Category_name");

        jLabel4.setText("Team");

        jTextField_Category_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Category_EditActionPerformed(evt);
            }
        });

        jTextField_Category_Team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Category_TeamActionPerformed(evt);
            }
        });

        jButton_Category_Edit.setText("Edit Category");
        jButton_Category_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Category_EditActionPerformed(evt);
            }
        });

        jButton_Category_Delete.setText("Delete Category");
        jButton_Category_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Category_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Category_Edit)
                                    .addComponent(jTextField_Category_Team)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_Team_Name_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_Edit_Team)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton_Delete_Team))
                                    .addComponent(jTextField_Team_Owner_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton_Category_Edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Category_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(395, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Team_Name_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Team_Owner_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Edit_Team)
                    .addComponent(jButton_Delete_Team))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_Category_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_Category_Team, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Category_Edit)
                            .addComponent(jButton_Category_Delete))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(274, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Team_Name_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Team_Name_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Team_Name_EditActionPerformed

    private void jTextField_Team_Owner_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Team_Owner_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Team_Owner_EditActionPerformed

    private void jButton_Edit_TeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_TeamActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable_Team_Edit.getModel();
        int selectedRowIndex = jTable_Team_Edit.getSelectedRow();
        System.out.println("selectedRowIndex = " + Integer.toString(selectedRowIndex));
        String selected_team_id = model.getValueAt(selectedRowIndex, 0).toString();
        editTeam(selected_team_id);
    }//GEN-LAST:event_jButton_Edit_TeamActionPerformed

    private void jTable_Team_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Team_EditMouseClicked

        DefaultTableModel model = (DefaultTableModel)jTable_Team_Edit.getModel();
        int selectedRowIndex = jTable_Team_Edit.getSelectedRow();
        
        jTextField_Team_Name_Edit.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jTextField_Team_Owner_Edit.setText(model.getValueAt(selectedRowIndex, 2).toString());

    }//GEN-LAST:event_jTable_Team_EditMouseClicked

    private void jButton_Delete_TeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_TeamActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable_Team_Edit.getModel();
        int selectedRowIndex = jTable_Team_Edit.getSelectedRow();
        System.out.println("selectedRowIndex = " + Integer.toString(selectedRowIndex));
        String selected_team_id = model.getValueAt(selectedRowIndex, 0).toString();
        deleteTeam(selected_team_id);
        model.removeRow(selectedRowIndex);
    }//GEN-LAST:event_jButton_Delete_TeamActionPerformed

    private void jTextField_Category_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Category_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Category_EditActionPerformed

    private void jButton_Category_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Category_EditActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable_Category_Edit.getModel();
        int selectedRowIndex = jTable_Category_Edit.getSelectedRow();
        System.out.println("selectedRowIndex = " + Integer.toString(selectedRowIndex));
        String selected_category_id = model.getValueAt(selectedRowIndex, 0).toString();
        editCategory(selected_category_id);
    }//GEN-LAST:event_jButton_Category_EditActionPerformed

    private void jTable_Category_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Category_EditMouseClicked
        
        DefaultTableModel model = (DefaultTableModel)jTable_Category_Edit.getModel();
        int selectedRowIndex = jTable_Category_Edit.getSelectedRow();
        jTextField_Category_Edit.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jTextField_Category_Team.setText(model.getValueAt(selectedRowIndex, 2).toString());
    }//GEN-LAST:event_jTable_Category_EditMouseClicked

    private void jButton_Category_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Category_DeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable_Category_Edit.getModel();
        int selectedRowIndex = jTable_Category_Edit.getSelectedRow();
        System.out.println("selectedRowIndex = " + Integer.toString(selectedRowIndex));
        String selected_category_id = model.getValueAt(selectedRowIndex, 0).toString();
        deleteCategory(selected_category_id);
        model.removeRow(selectedRowIndex);
    }//GEN-LAST:event_jButton_Category_DeleteActionPerformed

    private void jTextField_Category_TeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Category_TeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Category_TeamActionPerformed

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
            java.util.logging.Logger.getLogger(EditCategoryAndTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCategoryAndTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCategoryAndTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCategoryAndTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCategoryAndTeam().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Category_Delete;
    private javax.swing.JButton jButton_Category_Edit;
    private javax.swing.JButton jButton_Delete_Team;
    private javax.swing.JButton jButton_Edit_Team;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Category_Edit;
    private javax.swing.JTable jTable_Team_Edit;
    private javax.swing.JTextField jTextField_Category_Edit;
    private javax.swing.JTextField jTextField_Category_Team;
    private javax.swing.JTextField jTextField_Team_Name_Edit;
    private javax.swing.JTextField jTextField_Team_Owner_Edit;
    // End of variables declaration//GEN-END:variables
    
    
    protected void populateList_Team()
    {
        Connection dbconn= DBConnection.connectDB();
        DefaultListModel dmTeamName = new DefaultListModel();
        DefaultListModel dmTeamOwner = new DefaultListModel();
        try {
        String u;
        PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Select * from team where team_owner_id = ?");
        String user_idStr = Integer.toString(this.user_id);
        
        st.setString(1, user_idStr);
        ResultSet rs = st.executeQuery();
        while(rs.next())
        {
            u = rs.getString(2);
            dmTeamName.addElement(u);
            
            u = rs.getString(3);
            dmTeamOwner.addElement(u);
            
            AddRowToJTable(new Object[]{
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            });
        }
        rs.close();
        st.close();
        } catch (Exception ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void populateList_Category()
    {
        Connection dbconn= DBConnection.connectDB();
        DefaultListModel dmCategoryName = new DefaultListModel();
        DefaultListModel dmCategoryOwner = new DefaultListModel();
        try {
        String u;
        PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Select category_id from task where user_id = ?");
        String user_idStr = Integer.toString(this.user_id);
        
        st.setString(1, user_idStr);
        ResultSet rs = st.executeQuery();
        while(rs.next())
        {
            u = rs.getString(1);
            System.out.println("category_id = " + u);
            if (u != null){
                PreparedStatement st2 = (PreparedStatement)
                dbconn.prepareStatement("select category.category_id, category.name, team.team_name FROM category INNER JOIN team ON team.team_id = category.team_category_id WHERE category_id = ?;");
                st2.setString(1, u);
               
                ResultSet rs2 = st2.executeQuery();
                while(rs2.next()){
                    String u2;
                    u2 = rs2.getString(2);
                    System.out.println("u2 = " + u2);

                    dmCategoryName.addElement(u2);

                    u2 = rs2.getString(3);
                    System.out.println("u2 2 = " + u2);
                    dmCategoryOwner.addElement(u2);

                    AddRowToJTable_Category(new Object[]{
                                    rs2.getString(1),
                                    rs2.getString(2),
                                    rs2.getString(3),
                                    });
                }
                rs2.close();
                st2.close();
            }
        }
        rs.close();
        st.close();
        } catch (Exception ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void AddRowToJTable(Object[] dataRow) {
        DefaultTableModel model = (DefaultTableModel)jTable_Team_Edit.getModel();
        model.addRow(dataRow);
    }
    
    private void AddRowToJTable_Category(Object[] dataRow) {
        DefaultTableModel model = (DefaultTableModel)jTable_Category_Edit.getModel();
        model.addRow(dataRow);
    }

    private void editTeam(String selected_team_id) {
        Connection dbconn= DBConnection.connectDB();
        System.out.println("in editTeam" + selected_team_id);

        try {
        PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("UPDATE team SET team_name = ?, team_owner_id = ? where team_id=?");
        st.setString(1, jTextField_Team_Name_Edit.getText());
        st.setString(2, jTextField_Team_Owner_Edit.getText());
        st.setString(3, selected_team_id);

        int rs = st.executeUpdate();
        if (rs == 1){
            System.out.println("in editTeam -- edit successful - ahihi - stupid");
            
            // set value of the row
            DefaultTableModel model = (DefaultTableModel)jTable_Team_Edit.getModel();
            int selectedRowIndex = jTable_Team_Edit.getSelectedRow();
            model.setValueAt(jTextField_Team_Name_Edit.getText(), selectedRowIndex, 1);
            model.setValueAt(jTextField_Team_Owner_Edit.getText(), selectedRowIndex, 2);
        } else {
            System.out.println("in editTeam -- edit fail -- u dumb mtfk");
        }
        st.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "remove null data and try again", "Error", JOptionPane.ERROR_MESSAGE);
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteTeam(String selected_team_id) {
        Connection dbconn= DBConnection.connectDB();
        System.out.println("in deleteTeam " + selected_team_id);

        try {
        PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Delete from team where team_id = ?");
        
        st.setString(1, selected_team_id);
        int rs = st.executeUpdate();
        if (rs == 1){
            System.out.println("in deleteTeam -- delete successful");
        } else {
            System.out.println("in deleteTeam -- delete fail");
        }
        st.close();
        } catch (Exception ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void editCategory(String selected_category_id) {
        Connection dbconn= DBConnection.connectDB();
        System.out.println("in editCategory" + selected_category_id);

        try {
        PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Update\n" +
"Category as C\n" +
"INNER JOIN (\n" +
"SELECT team_id\n" +
"FROM team\n" +
"WHERE team_name = ? )\n" +
"AS T on C.team_category_id = T.team_id\n" +
"SET C.name = ?, C.team_category_id = T.team_id;");
        st.setString(1, jTextField_Category_Team.getText());
        st.setString(2, jTextField_Category_Edit.getText());

        int rs = st.executeUpdate();
        if (rs == 1){
            System.out.println("in editCategory -- edit successful - ahihi - stupid");
            
            // set value of the row
            DefaultTableModel model = (DefaultTableModel)jTable_Category_Edit.getModel();
            int selectedRowIndex = jTable_Category_Edit.getSelectedRow();
            model.setValueAt(jTextField_Category_Edit.getText(), selectedRowIndex, 1);
            model.setValueAt(jTextField_Category_Team.getText(), selectedRowIndex, 2);
        } else {
            System.out.println("in editCategory -- edit fail -- u dumb mtfk");
        }
        st.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "remove null data and try again", "Error", JOptionPane.ERROR_MESSAGE);
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteCategory(String selected_category_id) {
        Connection dbconn= DBConnection.connectDB();
        System.out.println("in deleteCategory " + selected_category_id);

        try {
        PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Delete from category where category_id = ?");
        
        st.setString(1, selected_category_id);
        int rs = st.executeUpdate();
        if (rs == 1){
            System.out.println("in deleteCategory -- delete successful");
        } else {
            System.out.println("in deleteCategory -- delete fail");
        }
        st.close();
        } catch (Exception ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }




}
