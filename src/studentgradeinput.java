
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author Christopher Lawrence
 */
public class studentgradeinput extends javax.swing.JInternalFrame {

    /**
     * Creates new form 
     */
    public studentgradeinput() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        tfExam = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        tfStudent = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        tfQuiz = new javax.swing.JTextField();
        tfAct = new javax.swing.JTextField();
        tfLab = new javax.swing.JTextField();
        javax.swing.JButton btnAdd = new javax.swing.JButton();
        javax.swing.JButton btnDel = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableGrades = new javax.swing.JTable();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 231, 232));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(155, 193, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfExam.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        tfExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfExamActionPerformed(evt);
            }
        });
        jPanel4.add(tfExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 190, 34));

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel3.setText("Activity:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        tfName.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        jPanel4.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 34));

        jLabel4.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel4.setText("Name:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tfStudent.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        tfStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStudentActionPerformed(evt);
            }
        });
        jPanel4.add(tfStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, 34));

        jLabel5.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel5.setText("Written Exam:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel6.setText("Lab Exam:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel7.setText("Student #:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel8.setText("Quiz:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        tfQuiz.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        tfQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuizActionPerformed(evt);
            }
        });
        jPanel4.add(tfQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 190, 34));

        tfAct.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        tfAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActActionPerformed(evt);
            }
        });
        jPanel4.add(tfAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 34));

        tfLab.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        tfLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLabActionPerformed(evt);
            }
        });
        jPanel4.add(tfLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 190, 34));

        btnAdd.setFont(new java.awt.Font("Salina", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel4.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 60, 30));

        btnDel.setFont(new java.awt.Font("Salina", 1, 12)); // NOI18N
        btnDel.setText("Delete");
        btnDel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jPanel4.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 64, 31));

        tableGrades.setBackground(new java.awt.Color(204, 204, 255));
        tableGrades.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tableGrades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Student #", "Quiz", "Activity", "Lab. Exam", "Written Exam", "Total Grade"
            }
        ));
        tableGrades.setOpaque(false);
        jScrollPane1.setViewportView(tableGrades);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfExamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfExamActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStudentActionPerformed

    private void tfQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuizActionPerformed

    private void tfActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfActActionPerformed

    private void tfLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLabActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = tfName.getText();
        String number = tfStudent.getText();
        String quiz = tfQuiz.getText();
        String act = tfAct.getText();
        String lab = tfLab.getText();
        String exam = tfExam.getText();

        if (name.isEmpty() || number.isEmpty() || quiz.isEmpty() || act.isEmpty() || lab.isEmpty() || exam.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please enter all fields.",
                "Try again!",
                JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Convert Strings to doubles for computation
                double quizScore = Double.parseDouble(quiz);
                double actScore = Double.parseDouble(act);
                double labScore = Double.parseDouble(lab);
                double examScore = Double.parseDouble(exam);

                // Compute the total grade
                double tQuiz = (quizScore * 0.10);
                double tAct = (actScore * 0.10);
                double tLab = (labScore * 0.30);
                double tExam = (examScore * 0.50);
                double totalGrade = (quizScore * 0.10) + (actScore * 0.10) + (labScore * 0.30) + (examScore * 0.50);

                // Add the data including totalGrade to the table
                DefaultTableModel model = (DefaultTableModel) tableGrades.getModel();
                model.addRow(new Object[]{name, number, tQuiz, tAct, tLab, tExam, totalGrade});

                // Clear text fields
                tfName.setText("");
                tfStudent.setText("");
                tfQuiz.setText("");
                tfAct.setText("");
                tfLab.setText("");
                tfExam.setText("");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,
                    "Please enter valid numerical values for quiz, act, lab, and exam.",
                    "Invalid Input!",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        int row = tableGrades.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                "No row is selected! Please select one row.",
                "Select row!",
                JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tableGrades.getModel();
            model.removeRow(row);
        }
    }//GEN-LAST:event_btnDelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tableGrades;
    private javax.swing.JTextField tfAct;
    private javax.swing.JTextField tfExam;
    private javax.swing.JTextField tfLab;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfQuiz;
    private javax.swing.JTextField tfStudent;
    // End of variables declaration//GEN-END:variables
}
