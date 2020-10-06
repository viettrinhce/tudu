
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;
import java.awt.Color;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.colorchooser.*; 


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viett
 */


public class CreateTask extends javax.swing.JFrame implements ChangeListener{
    
    private int user_id = 0;
    private String user_name = "None";
    public Color color;
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

    /**
     * Creates new form CreateTask
     */
    public CreateTask() {
        initComponents();
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        Color newColor = jColorPane.getColor();
        label.setForeground(newColor);
        System.out.println("color change: ");
        System.out.println(newColor.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        utilCalendarModel1 = new org.jdatepicker.impl.UtilCalendarModel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfTaskDescription_CreateTask = new javax.swing.JTextField();
        tfTaskName_CreateTask = new javax.swing.JTextField();
        jButtonCreate_CreateTask = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Create Task");

        tfTaskDescription_CreateTask.setText("Enter task's description");
        tfTaskDescription_CreateTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTaskDescription_CreateTaskActionPerformed(evt);
            }
        });

        tfTaskName_CreateTask.setText("Enter task's name ");
        tfTaskName_CreateTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTaskName_CreateTaskActionPerformed(evt);
            }
        });

        jButtonCreate_CreateTask.setText("Create");
        jButtonCreate_CreateTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreate_CreateTaskActionPerformed(evt);
            }
        });

        label.setText("Color Chooser");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(jButtonCreate_CreateTask))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tfTaskDescription_CreateTask, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfTaskName_CreateTask, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tfTaskName_CreateTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTaskDescription_CreateTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButtonCreate_CreateTask))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(391, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTaskDescription_CreateTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTaskDescription_CreateTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTaskDescription_CreateTaskActionPerformed

    private void tfTaskName_CreateTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTaskName_CreateTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTaskName_CreateTaskActionPerformed

    private void jButtonCreate_CreateTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreate_CreateTaskActionPerformed
        // TODO add your handling code here:
        String taskName = tfTaskName_CreateTask.getText();
        String taskDescription = tfTaskDescription_CreateTask.getText();
        System.out.println("in create task " + taskName);
        System.out.println("in create task " + taskDescription);

        if (taskName.isEmpty() || taskDescription.isEmpty()) {
            JOptionPane.showMessageDialog(this, "taskName/taskDescription should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Start login process
            System.out.println("in create task " + this.getUser_name());
            createTask(taskName, taskDescription, this.user_id, color.toString());          
        }
    }//GEN-LAST:event_jButtonCreate_CreateTaskActionPerformed

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
            java.util.logging.Logger.getLogger(CreateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate_CreateTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JTextField tfTaskDescription_CreateTask;
    private javax.swing.JTextField tfTaskName_CreateTask;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel1;
    // End of variables declaration//GEN-END:variables

//should be renamed to be descriptive of writing to database
    private void createTask(String taskName, String taskDescription, int user_id, String color) {
        Connection dbconn= DBConnection.connectDB();
        System.out.println("in dbconn - Create Task");

        try {
            PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Insert into task(task_name, task_description, user_id, color) values (?,?,?,?)");
            String sUser_id = Integer.toString(user_id);
            st.setString(1, taskName);
            st.setString(2, taskDescription);
            st.setString(3, sUser_id);
            st.setString(4, color);
            int res = st.executeUpdate();
            
            System.out.println("got result - Create Task");
            
            System.out.println("res: " + res);

            
            if(res == 1){
                //display dashboard or new page after login.
                dispose();
                System.out.println("taskName: " + taskName);
                System.out.println("taskDescription: " + taskDescription);
            } else {
                JOptionPane.showMessageDialog(this, "Wrong input data", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
