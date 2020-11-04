
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arben
 */
public class ViewTasks extends javax.swing.JFrame {

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
    public ViewTasks() {
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_Tasks = new javax.swing.JTable();
        jTextField_tasks_taskname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_tasks_taskDescription = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_tasks_taskStatus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton_tasks_deleteButton = new javax.swing.JButton();
        jDateChooser_tasks_duedate = new com.toedter.calendar.JDateChooser();
        jTextField_tasks_taskDuedate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton_tasks_edit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jTable_Tasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task_id", "Name", "Description", "Due Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_Tasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TasksMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_Tasks);

        jTextField_tasks_taskname.setText("jTextField1");

        jLabel5.setText("Task name");

        jLabel6.setText("Description");

        jTextField_tasks_taskDescription.setText("jTextField1");
        jTextField_tasks_taskDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tasks_taskDescriptionActionPerformed(evt);
            }
        });

        jLabel7.setText("DueDate");

        jTextField_tasks_taskStatus.setText("jTextField1");
        jTextField_tasks_taskStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tasks_taskStatusActionPerformed(evt);
            }
        });

        jLabel8.setText("Status");

        jButton_tasks_deleteButton.setText("Delete");
        jButton_tasks_deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_tasks_deleteButtonActionPerformed(evt);
            }
        });

        jTextField_tasks_taskDuedate.setText("jTextField1");
        jTextField_tasks_taskDuedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tasks_taskDuedateActionPerformed(evt);
            }
        });

        jLabel9.setText("New DueDate");

        jButton_tasks_edit.setText("Edit");
        jButton_tasks_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_tasks_editActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("ViewTask");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_tasks_edit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_tasks_deleteButton)
                    .addComponent(jTextField_tasks_taskname)
                    .addComponent(jTextField_tasks_taskDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jTextField_tasks_taskStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jDateChooser_tasks_duedate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_tasks_taskDuedate, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_tasks_taskname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_tasks_taskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_tasks_taskDuedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_tasks_duedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField_tasks_taskStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_tasks_deleteButton)
                            .addComponent(jButton_tasks_edit))))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_TasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TasksMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable_Tasks.getModel();
        int selectedRowIndex = jTable_Tasks.getSelectedRow();
        
        jTextField_tasks_taskname.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jTextField_tasks_taskDescription.setText(model.getValueAt(selectedRowIndex, 2).toString());
        jTextField_tasks_taskDuedate.setText(model.getValueAt(selectedRowIndex, 3).toString());
        jTextField_tasks_taskStatus.setText(model.getValueAt(selectedRowIndex, 4).toString());

    }//GEN-LAST:event_jTable_TasksMouseClicked

    private void jTextField_tasks_taskDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tasks_taskDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tasks_taskDescriptionActionPerformed

    private void jTextField_tasks_taskStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tasks_taskStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tasks_taskStatusActionPerformed

    private void jButton_tasks_deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_tasks_deleteButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable_Tasks.getModel();
        int selectedRowIndex = jTable_Tasks.getSelectedRow();
        System.out.println("selectedRowIndex = " + Integer.toString(selectedRowIndex));
        String selected_task_id = model.getValueAt(selectedRowIndex, 0).toString();
        deleteTask(selected_task_id);
        model.removeRow(selectedRowIndex);
    }//GEN-LAST:event_jButton_tasks_deleteButtonActionPerformed

    private void jTextField_tasks_taskDuedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tasks_taskDuedateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tasks_taskDuedateActionPerformed

    private void jButton_tasks_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_tasks_editActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable_Tasks.getModel();
        int selectedRowIndex = jTable_Tasks.getSelectedRow();
        System.out.println("selectedRowIndex = " + Integer.toString(selectedRowIndex));
        String selected_task_id = model.getValueAt(selectedRowIndex, 0).toString();
        editTask(selected_task_id);
    }//GEN-LAST:event_jButton_tasks_editActionPerformed
    
    
    public void AddRowToJTable(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)jTable_Tasks.getModel();
        model.addRow(dataRow);
        changeCellColor(jTable_Tasks,4);

    }
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
            java.util.logging.Logger.getLogger(ViewTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTasks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTasks().setVisible(true);
                
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_tasks_deleteButton;
    private javax.swing.JButton jButton_tasks_edit;
    private com.toedter.calendar.JDateChooser jDateChooser_tasks_duedate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_Tasks;
    private javax.swing.JTextField jTextField_tasks_taskDescription;
    private javax.swing.JTextField jTextField_tasks_taskDuedate;
    private javax.swing.JTextField jTextField_tasks_taskStatus;
    private javax.swing.JTextField jTextField_tasks_taskname;
    // End of variables declaration//GEN-END:variables
    protected void populateList()
    {
        Connection dbconn= DBConnection.connectDB();
        DefaultListModel dmTaskName = new DefaultListModel();
        DefaultListModel dmTaskDesc = new DefaultListModel();
        DefaultListModel dmTaskDueDate = new DefaultListModel();
        DefaultListModel dmTaskStatus = new DefaultListModel();
        
        try {
        String u;
        PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Select * from task where user_id = ?");
        String user_idStr = Integer.toString(this.user_id);
        
        st.setString(1, user_idStr);
        ResultSet rs = st.executeQuery();
        while(rs.next())
        {
            u = rs.getString(2);
            dmTaskName.addElement(u);
            
            u = rs.getString(3);
            dmTaskDesc.addElement(u);
            
            u = rs.getString(5);
            dmTaskDueDate.addElement(u);
            
            u = rs.getString(7);
            dmTaskStatus.addElement(u);
            AddRowToJTable(new Object[]{
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(5),
                            rs.getString(7)
                            });
        }
        rs.close();
        st.close();
        } catch (Exception ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteTask(String task_id)
    {
        Connection dbconn= DBConnection.connectDB();
        System.out.println("in ViewTasks " + task_id);

        try {
        PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Delete from task where task_id = ?");
        
        st.setString(1, task_id);
        int rs = st.executeUpdate();
        if (rs == 1){
            System.out.println("in ViewTasks -- delete successful");
        } else {
            System.out.println("in ViewTasks -- delete fail");
        }
        st.close();
        } catch (Exception ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void editTask(String task_id) {
        
        Connection dbconn= DBConnection.connectDB();
        System.out.println("in ViewTasks" + task_id);

        try {
        PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("UPDATE task SET task_name = ?, task_description = ?,"
                        + " task_duedate = ?, status = ? where task_id = ?;");
        st.setString(1, jTextField_tasks_taskname.getText());
        st.setString(2, jTextField_tasks_taskDescription.getText());
        
        //get date
        java.util.Date taskDate = jDateChooser_tasks_duedate.getDate();
        if (taskDate != null){
            java.sql.Date date = new java.sql.Date(taskDate.getTime());
            String sDate = date.toString();
            st.setString(3, sDate);
        } else {
            st.setString(3, jTextField_tasks_taskDuedate.getText());
        }
        
        st.setString(4, jTextField_tasks_taskStatus.getText());
        st.setString(5, task_id);
        int rs = st.executeUpdate();
        if (rs == 1){
            System.out.println("in ViewTasks -- edit successful");
            
            // set value of the row
            DefaultTableModel model = (DefaultTableModel)jTable_Tasks.getModel();
            int selectedRowIndex = jTable_Tasks.getSelectedRow();
            model.setValueAt(jTextField_tasks_taskname.getText(), selectedRowIndex, 1);
            model.setValueAt(jTextField_tasks_taskDescription.getText(), selectedRowIndex, 2);
            if (taskDate != null){
                java.sql.Date date = new java.sql.Date(taskDate.getTime());
                String sDate= date.toString();
                model.setValueAt(sDate, selectedRowIndex, 3);
            } else {
                st.setString(3, jTextField_tasks_taskDuedate.getText());
            }
            model.setValueAt(jTextField_tasks_taskStatus.getText(), selectedRowIndex, 4);
        } else {
            System.out.println("in ViewTasks -- edit fail");
        }
        st.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "remove null data and try again", "Error", JOptionPane.ERROR_MESSAGE);
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void changeCellColor(JTable table, int column_index) {
        table.getColumnModel().getColumn(column_index).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                int st_val = Integer.parseInt(table.getValueAt(row, 4).toString());
                final Color notStarted = new Color(153,255,153);
                final Color inProgress = new Color(255,255,102);
                final Color done = new Color(102,204,255);
                final Color abandon = new Color(255,153,153);
                if (st_val == 1) {
                    c.setBackground(notStarted);
                } else if(st_val == 2) {
                    c.setBackground(inProgress);
                }else if(st_val == 3) {
                    c.setBackground(done);
                }else if(st_val == 4) {
                    c.setBackground(abandon);
                }
                return c;
            }
        });
    }
 


}
  class MyTableCellRenderer extends DefaultTableCellRenderer {
        @Override
        public Color getBackground() {
            return super.getBackground();
        }
  }
