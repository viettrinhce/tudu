
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.util.Timer; 
import java.util.TimerTask; 
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viett
 */
public class Dashboard extends javax.swing.JFrame {

    private int user_id = 0;
    private String user_name = "None";
    private JButton button;
    private JTextField textField;
    private int teamID = 0;
    private Timer timer = null;
    private TimerTask task = null;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    private int current_alert = 0;

    /**
     * Creates new form Dashboard
     */
    
    public Dashboard() {
        initComponents();
        setTitle("JButtonTextChange Test");
        this.timer = new Timer();
        this.task = new TimerTask()
        {
            public void run(){
                try{
                    DefaultTableModel model = (DefaultTableModel)jTable_Tasks.getModel();
                    int rowCount = model.getRowCount();
                    //Remove rows one by one from the end of the table
                    int count_alert = 0;
                    for (int i = rowCount - 1; i >= 0; i--) {
                        String str1 = model.getValueAt(i, 1).toString();
                        Date date = sdf.parse(str1);
                        long millis = Math.abs(date.getTime() - System.currentTimeMillis());
                        if (millis <= 2*24*60*60*1000){
                            count_alert += 1;
                        }
                    }
                    if (count_alert > current_alert) {
                        current_alert = count_alert;
                        JOptionPane.showMessageDialog(null, "A task is due within 24 hours!", "Warning",JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                   }
            }
        };
        timer.scheduleAtFixedRate(task,0,1000);
    }
    
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
    

    public void setUserDetailsFromLogin(String username, int id){
        System.out.println("Inside Dashboard() : user_name : " + username);
        profileToggleBtn.setText(username);
        setUser_id(id);
        FillComboBox();
    } 
    
    public void AddRowToJTable(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)jTable_Tasks.getModel();
        model.addRow(dataRow);
        changeCellColor(jTable_Tasks,3);

    }
    
    public void ClearRowsJTable(){
        DefaultTableModel model = (DefaultTableModel)jTable_Tasks.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
    private void changeCellColor(JTable table, int column_index) {
        table.getColumnModel().getColumn(column_index).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                int st_val = Integer.parseInt(table.getValueAt(row, 3).toString());
                System.out.println(st_val);
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
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        profileInternalFrame = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        profileToggleBtn = new javax.swing.JToggleButton();
        deleteAcctBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        createTeamBtn = new javax.swing.JButton();
        newTeamNameField = new javax.swing.JTextField();
        chooseCategoryComboBox = new javax.swing.JComboBox<>();
        chooseTeamComboBox = new javax.swing.JComboBox<>();
        chooseTeamLabel = new javax.swing.JLabel();
        jTextField_categoryName_DB = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        editCategoryTeams = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonDashboardCreatetask = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_Tasks = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 204, 204));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(175, 163, 134));

        profileInternalFrame.setVisible(false);

        javax.swing.GroupLayout profileInternalFrameLayout = new javax.swing.GroupLayout(profileInternalFrame.getContentPane());
        profileInternalFrame.getContentPane().setLayout(profileInternalFrameLayout);
        profileInternalFrameLayout.setHorizontalGroup(
            profileInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        profileInternalFrameLayout.setVerticalGroup(
            profileInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dashboard");

        logoutBtn.setText("logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        profileToggleBtn.setText("profile");
        profileToggleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileToggleBtnActionPerformed(evt);
            }
        });

        deleteAcctBtn.setText("delete account");
        deleteAcctBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAcctBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(deleteAcctBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profileToggleBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn)
                    .addComponent(profileToggleBtn)
                    .addComponent(deleteAcctBtn))
                .addContainerGap())
        );

        createTeamBtn.setText("Create Team");
        createTeamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTeamBtnActionPerformed(evt);
            }
        });

        newTeamNameField.setText("Team name");

        chooseCategoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseCategoryComboBoxActionPerformed(evt);
            }
        });

        chooseTeamComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseTeamComboBoxActionPerformed(evt);
            }
        });

        chooseTeamLabel.setText("Ch. Project/Team");

        jTextField_categoryName_DB.setText("Category name");
        jTextField_categoryName_DB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_categoryName_DBActionPerformed(evt);
            }
        });

        jButton2.setText("Create Category");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        editCategoryTeams.setText("Edit Categories & Teams");
        editCategoryTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCategoryTeamsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(chooseTeamLabel))
                    .addComponent(jButton2)
                    .addComponent(createTeamBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editCategoryTeams, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jTextField_categoryName_DB)
                    .addComponent(chooseTeamComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chooseCategoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newTeamNameField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newTeamNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createTeamBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseTeamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseTeamLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_categoryName_DB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editCategoryTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jButtonDashboardCreatetask.setText("Create task");
        jButtonDashboardCreatetask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDashboardCreatetaskActionPerformed(evt);
            }
        });

        jButton1.setText("View Tasks");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDashboardCreatetask)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonDashboardCreatetask)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profileInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(profileInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable_Tasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Due Date", "Recurrent", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDashboardCreatetaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDashboardCreatetaskActionPerformed
        // TODO add your handling code here:
        userCreateTask();
    }//GEN-LAST:event_jButtonDashboardCreatetaskActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userViewTask();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chooseTeamComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseTeamComboBoxActionPerformed

        try {
            String str = chooseTeamComboBox.getSelectedItem().toString();
            int index = str.indexOf(':');
            str = str.substring(0,index);
            teamID = Integer.parseInt(str);
            Connection dbconn= DBConnection.connectDB();
            PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Insert into user_team(user_id, team_id) values (?,?)");
            System.out.println("user_id: " + user_id);
            String sUser_id = Integer.toString(user_id);
            String sTeam_id = Integer.toString(teamID);
            st.setString(1, sUser_id);
            st.setString(2, sTeam_id);
            int res = st.executeUpdate();
            System.out.println("got result - Join Team");
            System.out.println("res: " + res);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_chooseTeamComboBoxActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Login l = new Login();
        l.setVisible(true);
        this.timer.cancel();
        this.task.cancel();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void deleteAcctBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAcctBtnActionPerformed
        // TODO add your handling code here:
       deleteAcct();
    }//GEN-LAST:event_deleteAcctBtnActionPerformed

    private void profileToggleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileToggleBtnActionPerformed
        // TODO add your handling code here:
        //System.out.println("Inside Dashboard() : user_name : " + this.user_name);
        //profileToggleBtn.setText(user_name);
        //viewUserProfile();
    }//GEN-LAST:event_profileToggleBtnActionPerformed

    private void createTeamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTeamBtnActionPerformed
        String teamName = newTeamNameField.getText();
        if (teamName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Team Name should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Start login process
            System.out.println("in DashBoard " + teamName);
            //createTask(taskName, taskDescription, this.user_id, sDate, newColor, selectedStatus);        
            createTeam(teamName, this.user_id);          

        }
        // TODO add your handling code here:
        chooseTeamComboBox.removeAllItems();
        FillComboBox();
    }//GEN-LAST:event_createTeamBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String category_name = jTextField_categoryName_DB.getText();
        if (category_name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Team Name should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Start login process
            System.out.println("in DashBoard " + category_name);
            //createTask(taskName, taskDescription, this.user_id, sDate, newColor, selectedStatus);        
            createCategory(category_name, this.teamID);          

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_categoryName_DBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_categoryName_DBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_categoryName_DBActionPerformed

    private void chooseCategoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseCategoryComboBoxActionPerformed
        // TODO add your handling code here:
        try {
            String str = chooseCategoryComboBox.getSelectedItem().toString();
            int index = str.indexOf(':');
            str = str.substring(0,index);
            teamID = Integer.parseInt(str);
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_chooseCategoryComboBoxActionPerformed

    private void editCategoryTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCategoryTeamsActionPerformed
        userEditCategoryAndTeam();
    }//GEN-LAST:event_editCategoryTeamsActionPerformed

    private void jTable_TasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TasksMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_TasksMouseClicked

    private void FillComboBox()
    {
        Connection dbconn= DBConnection.connectDB();
        try{
            String username, id;
            PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Select team_id,team_name from team");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                id = rs.getString(1);
                username = rs.getString(2);
                chooseTeamComboBox.addItem(id + ": " + username);   
                chooseCategoryComboBox.addItem(id + ": " + username);
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooseCategoryComboBox;
    private javax.swing.JComboBox<String> chooseTeamComboBox;
    private javax.swing.JLabel chooseTeamLabel;
    private javax.swing.JButton createTeamBtn;
    private javax.swing.JButton deleteAcctBtn;
    private javax.swing.JButton editCategoryTeams;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonDashboardCreatetask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable_Tasks;
    private javax.swing.JTextField jTextField_categoryName_DB;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField newTeamNameField;
    private javax.swing.JInternalFrame profileInternalFrame;
    private javax.swing.JToggleButton profileToggleBtn;
    // End of variables declaration//GEN-END:variables

    private void userCreateTask() {
        CreateTask t = new CreateTask();
        t.setUser_id(user_id);
        t.setUser_name(user_name);
        t.setTitle("Create Task");
        t.setVisible(true);
        this.dispose();
    }
    
    private void userViewTask()
    {
        ViewTasks v = new ViewTasks();
        v.setUser_id(user_id);
        v.setUser_name(user_name);
        v.setTitle("View Tasks");
        v.populateList();
        v.setVisible(true);      
        v.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        v.d = this;
    }
    
    private void viewUserProfile()
    {
//        dispose();
        ViewUserProfile p = new ViewUserProfile();
        p.setUser_id(user_id);
        p.setUser_name(user_name);
        p.setVisible(true);
        profileInternalFrame.setVisible(true);
    }

    private void createTeam(String teamName, int user_id) {
        Connection dbconn= DBConnection.connectDB();
        try {
            PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Insert into team(team_name, team_owner_id) values (?,?)");
            String sUser_id = Integer.toString(user_id);
            st.setString(1, teamName);
            st.setString(2, sUser_id);
            int res = st.executeUpdate();       
            System.out.println("res: " + res);
            if (res!=1)
                JOptionPane.showMessageDialog(this, "u r dumbo", "Error", JOptionPane.ERROR_MESSAGE);

        }
        catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void createCategory(String category_name, int teamID) {
        Connection dbconn= DBConnection.connectDB();
        try {
            PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Insert into category(name, team_category_id) values (?,?)");
            String sTeamID = Integer.toString(teamID);
            st.setString(1, category_name);
            st.setString(2, sTeamID);
            int res = st.executeUpdate();       
            System.out.println("res: " + res);
            if (res!=1)
                JOptionPane.showMessageDialog(this, "u r dumbo", "Error", JOptionPane.ERROR_MESSAGE);

        }
        catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void userEditCategoryAndTeam() {
        EditCategoryAndTeam e = new EditCategoryAndTeam();
        e.setUser_id(user_id);
        e.setUser_name(user_name);
        e.setTitle("Edit Category and Team");
        e.populateList_Team();
        e.populateList_Category();
        e.setVisible(true); 
        e.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void deleteAcct() 
    {
        Connection dbconn= DBConnection.connectDB();

        int deleteAcctChoice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete your user account?", "Delete account?", JOptionPane.YES_NO_OPTION);
        System.out.println("deleteAcctChoice: " + Integer.toString(deleteAcctChoice));
        if (deleteAcctChoice == 0)
        {
            try{
                PreparedStatement st = (PreparedStatement)
            dbconn.prepareStatement("DELETE FROM user WHERE (user_id = (?) )");
            String sUser_id = Integer.toString(user_id);
            st.setString(1, sUser_id);
            System.out.println("sUserid: " + sUser_id);
            int res = st.executeUpdate();
            System.out.println("res: " + res);
            //delete
            //DELETE FROM `tudu`.`user` WHERE (`user_id` = '4');
            }
            catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        else
        {
            //do nothing
        }
        
    }
    protected void populateList()
    {
        Connection dbconn= DBConnection.connectDB();
        DefaultListModel dmTaskName = new DefaultListModel();
        DefaultListModel dmTaskDueDate = new DefaultListModel();
        DefaultListModel dmTaskStatus = new DefaultListModel();
        DefaultListModel dmRecurrentStatus = new DefaultListModel();
        try {
        String u;
        PreparedStatement st = (PreparedStatement)
                dbconn.prepareStatement("Select * from task where user_id = ?");
        String user_idStr = Integer.toString(this.user_id);
        
        st.setString(1, user_idStr);
        ResultSet rs = st.executeQuery();
        while(rs.next())
        {
           
            u = rs.getString(10);
            dmTaskStatus.addElement(u);
            System.out.println("due-date" +rs.getString(5));
            switch(u) {
                case "1":
                    u = "Daily";
                    break;
                case "2":
                    u = "Weekly";
                  break;
                case "3":
                    u = "Monthly";
                    break;
                default:
                    u = "One time only bruh";
            }
            AddRowToJTable(new Object[]{
                            rs.getString(2),
                            rs.getString(5),
                            u,
                            rs.getString(7)
                            });
        }
        rs.close();
        st.close();
        } catch (Exception ex) {
             Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class MyTableCellRenderer2 extends DefaultTableCellRenderer {
        @Override
        public Color getBackground() {
            return super.getBackground();
        }
  }

