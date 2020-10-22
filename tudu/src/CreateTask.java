
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import tuduDateTime.tuduDateTime;
import GroupButtonUtils.GroupButtonUtils;
import java.sql.ResultSet;
//import tuduDateTime.tuduDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viett
 */

public class CreateTask extends javax.swing.JFrame implements ChangeListener {

    private int user_id = 0;
    private String user_name = "None";
    Color newColor;
    private int assignTo_id;
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
        FillComboBox();
    }
    
    public void stateChanged(ChangeEvent e) 
    { 
        newColor = Jcc.getColor(); 
        tfTaskName_CreateTask.setForeground(newColor); 
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfTaskDescription_CreateTask = new javax.swing.JTextField();
        tfTaskName_CreateTask = new javax.swing.JTextField();
        jButtonCreate_CreateTask = new javax.swing.JButton();
        jDateChooserCreate = new com.toedter.calendar.JDateChooser();
        Jcc = new javax.swing.JColorChooser(tfTaskName_CreateTask.getForeground());
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

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

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("not started");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("doing");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("done");

        jLabel2.setText("Staus");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Assign task to:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCreate_CreateTask)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfTaskDescription_CreateTask, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(jDateChooserCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRadioButton2)
                                    .addGap(57, 57, 57)
                                    .addComponent(jLabel2))
                                .addComponent(jRadioButton3)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(Jcc, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(tfTaskName_CreateTask, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jcc, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75)
                        .addComponent(tfTaskDescription_CreateTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonCreate_CreateTask)
                        .addGap(33, 33, 33)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(tfTaskName_CreateTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(227, Short.MAX_VALUE)))
        );

        Jcc.getSelectionModel().addChangeListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        String sDate = "";
        GroupButtonUtils buttonUtilityObj = new GroupButtonUtils();
        String selectedStatusText = buttonUtilityObj.getSelectedButtonText(buttonGroup1);
        String selectedStatus = "1";
        switch(selectedStatusText) {
            case "not started":
                selectedStatus = "1";
                break;
            case "doing":
                selectedStatus = "2";
              break;
            case "done":
                selectedStatus = "3";
                break;
            default:
              selectedStatus = "1";
        }
        System.out.println("create task to db: color is " + newColor.toString());
        java.util.Date taskDate = jDateChooserCreate.getDate();
        if (taskDate == null) {
            System.out.println("No date specified!");
        } else {
            java.sql.Date date = new java.sql.Date(taskDate.getTime());
            // Do something with sqldate
            System.out.println("in create task " + date);
            sDate = date.toString();
        }
        System.out.println("in create task " + taskName);
        System.out.println("in create task " + taskDescription);

        if (taskName.isEmpty() || taskDescription.isEmpty()) {
            JOptionPane.showMessageDialog(this, "taskName/taskDescription should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Start login process
            System.out.println("in create task " + this.getUser_name());
            createTask(taskName, taskDescription, this.user_id, sDate, newColor, selectedStatus);          
        }
    }//GEN-LAST:event_jButtonCreate_CreateTaskActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
            String str = jComboBox1.getSelectedItem().toString();
            int index = str.indexOf(':');
            str = str.substring(0,index);
            assignTo_id = Integer.parseInt(str);
            //System.out.println(assignTo_id);
        
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private void FillComboBox()
    {
        Connection dbconn= DBConnection.connectDB();
        try{
            String username, id;
            PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Select user_id,username from user");
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                id = rs.getString(1);
                username = rs.getString(2);
                jComboBox1.addItem(id + ": " + username);                
            }
            
        }catch (Exception ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private javax.swing.JColorChooser Jcc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCreate_CreateTask;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooserCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField tfTaskDescription_CreateTask;
    private javax.swing.JTextField tfTaskName_CreateTask;
    // End of variables declaration//GEN-END:variables

    //color data type converted to a string in this function
    private void createTask(String taskName, String taskDescription, int user_id, String date, Color newColor, String selectedStatus) {
        Connection dbconn= DBConnection.connectDB();
        System.out.println("in dbconn - Create Task");
        System.out.println("passed in date: " + date);
        java.util.Date currentDate = new java.util.Date();
        long currentDateTime = currentDate.getTime();
        SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTimeStr = dateTimeFormatter.format(currentDateTime);
        try {
            PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Insert into task(task_name, task_description, user_id, task_duedate, color, date_created, status) values (?,?,?,?,?,?,?)");
            String sUser_id = Integer.toString(user_id);
            st.setString(1, taskName);
            st.setString(2, taskDescription);
            st.setString(3, sUser_id);
            st.setString(4, date);
            st.setString(5, newColor.toString());
            st.setString(6, dateTimeStr); //fix for date_Created
            st.setString(7, selectedStatus);
            int res = st.executeUpdate();

            System.out.println("got result - Create Task");
            
            System.out.println("res: " + res);

            
            if(res == 1){
                //display dashboard or new page after login.
                dispose();
                System.out.println("taskName: " + taskName);
                System.out.println("taskDescription: " + taskDescription);
                System.out.println("date: " + date);
                //query for task id
                PreparedStatement st2 = (PreparedStatement)
                dbconn.prepareStatement("insert into task_user(task_id,user_id) select task.task_id ,user.user_id from task, user where task.task_name = ? and user.user_id = ?");
                st2.setString(1, taskName);
                st2.setInt(2, assignTo_id);
                int res2 = st2.executeUpdate();
                if (res2 ==1)
                {
                    System.out.println("Successful query");
                    System.out.println(st2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Wrong input data", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
