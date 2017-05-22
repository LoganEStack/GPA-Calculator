package gpacalculator;

import java.text.DecimalFormat;

/**
 * @author Logan Stack
 */
public class GPACalculator extends javax.swing.JFrame {
    public GPA gpa;
    
    public GPACalculator() {
        initComponents();
        gpa = new GPA();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblTitle = new java.awt.Label();
        paneTotal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        textfieldClass1 = new javax.swing.JTextField();
        textfieldGPA1 = new javax.swing.JTextField();
        textfieldGPA2 = new javax.swing.JTextField();
        textfieldGPA3 = new javax.swing.JTextField();
        textfieldGPA4 = new javax.swing.JTextField();
        textfieldGPA5 = new javax.swing.JTextField();
        textfieldGPA6 = new javax.swing.JTextField();
        textfieldGPA7 = new javax.swing.JTextField();
        textfieldClass2 = new javax.swing.JTextField();
        textfieldClass4 = new javax.swing.JTextField();
        textfieldClass3 = new javax.swing.JTextField();
        textfieldClass5 = new javax.swing.JTextField();
        textfieldClass6 = new javax.swing.JTextField();
        textfieldClass7 = new javax.swing.JTextField();
        textArea = new java.awt.TextArea();
        btnCalculate = new javax.swing.JButton();
        textfieldGrade1 = new javax.swing.JTextField();
        textfieldGrade2 = new javax.swing.JTextField();
        textfieldGrade3 = new javax.swing.JTextField();
        textfieldGrade4 = new javax.swing.JTextField();
        textfieldGrade5 = new javax.swing.JTextField();
        textfieldGrade6 = new javax.swing.JTextField();
        textfieldGrade7 = new javax.swing.JTextField();
        btnHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        lblTitle.setText("GPA Calculator");

        paneTotal.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        textfieldClass1.setText("Class 1");

        textfieldGPA1.setText("Credits");
        textfieldGPA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldGPA1ActionPerformed(evt);
            }
        });

        textfieldGPA2.setText("Credits");

        textfieldGPA3.setText("Credits");

        textfieldGPA4.setText("Credits");

        textfieldGPA5.setText("Credits");

        textfieldGPA6.setText("Credits");

        textfieldGPA7.setText("Credits");

        textfieldClass2.setText("Class 2");

        textfieldClass4.setText("Class 4");

        textfieldClass3.setText("Class 3");

        textfieldClass5.setText("Class 5");

        textfieldClass6.setText("Class 6");

        textfieldClass7.setText("Class 7");

        btnCalculate.setText("Calculate GPA");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        textfieldGrade1.setText("Grade");
        textfieldGrade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldGrade1ActionPerformed(evt);
            }
        });

        textfieldGrade2.setText("Grade");
        textfieldGrade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldGrade2ActionPerformed(evt);
            }
        });

        textfieldGrade3.setText("Grade");
        textfieldGrade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldGrade3ActionPerformed(evt);
            }
        });

        textfieldGrade4.setText("Grade");
        textfieldGrade4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldGrade4ActionPerformed(evt);
            }
        });

        textfieldGrade5.setText("Grade");
        textfieldGrade5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldGrade5ActionPerformed(evt);
            }
        });

        textfieldGrade6.setText("Grade");
        textfieldGrade6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldGrade6ActionPerformed(evt);
            }
        });

        textfieldGrade7.setText("Grade");
        textfieldGrade7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldGrade7ActionPerformed(evt);
            }
        });

        btnHelp.setText("?");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textfieldClass1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfieldClass2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfieldClass4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfieldClass3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfieldClass5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfieldClass6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfieldClass7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfieldGrade1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(textfieldGrade2)
                            .addComponent(textfieldGrade3)
                            .addComponent(textfieldGrade4)
                            .addComponent(textfieldGrade5)
                            .addComponent(textfieldGrade6)
                            .addComponent(textfieldGrade7))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textfieldGPA6)
                            .addComponent(textfieldGPA5)
                            .addComponent(textfieldGPA4)
                            .addComponent(textfieldGPA3)
                            .addComponent(textfieldGPA2)
                            .addComponent(textfieldGPA1)
                            .addComponent(textfieldGPA7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHelp)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldClass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldGPA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldGrade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldGPA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldClass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldGrade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldGPA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldClass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldGrade3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldGPA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldClass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldGrade4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldGPA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldClass5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldGrade5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldGPA6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldClass6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldGrade6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldClass7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldGPA7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldGrade7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        paneTotal.addTab("Calculate GPA", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneTotal)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneTotal))
        );

        lblTitle.getAccessibleContext().setAccessibleName("title");

        pack();
    }// </editor-fold>                        

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String gradeScale = "A\t\t4.0\n"
        + "A-\t\t3.67\n"
        + "B+\t\t3.33\n"
        + "B\t\t3.0\n"
        + "B-\t\t2.67\n"
        + "C+\t\t2.33\n"
        + "C\t\t2.0\n"
        + "D\t\t1.0\n"
        + "F\t\t0.0\n";
        gradeScale += "\nProgram developed by Logan Stack\n";

        textArea.setText(gradeScale);
    }                                       

    private void textfieldGrade7ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void textfieldGrade6ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void textfieldGrade5ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void textfieldGrade4ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void textfieldGrade3ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void textfieldGrade2ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void textfieldGrade1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String info = "Class\t\tGrade\t\tWeight\n";
        double average = 0;

        String[] classes = {textfieldClass1.getText(),
            textfieldClass2.getText(),
            textfieldClass3.getText(),
            textfieldClass4.getText(),
            textfieldClass5.getText(),
            textfieldClass6.getText(),
            textfieldClass7.getText()};
        String[] grade = {  textfieldGrade1.getText().toUpperCase(),
            textfieldGrade2.getText().toUpperCase(),
            textfieldGrade3.getText().toUpperCase(),
            textfieldGrade4.getText().toUpperCase(),
            textfieldGrade5.getText().toUpperCase(),
            textfieldGrade6.getText().toUpperCase(),
            textfieldGrade7.getText().toUpperCase()};
        String[] weight = { textfieldGPA1.getText(),
            textfieldGPA2.getText(),
            textfieldGPA3.getText(),
            textfieldGPA4.getText(),
            textfieldGPA5.getText(),
            textfieldGPA6.getText(),
            textfieldGPA7.getText()};

        for(int i=0; i<7; i++) {
            //if a grade has not been entered for a class, ignore it
            if(!grade[i].equals("GRADE") && !weight[i].equals("CREDITS")) {
                //compile all the information
                info += classes[i] + "\t\t" + grade[i] + "\t\t" + weight[i] + '\n';
            }
        }
        //get the GPA
        average = gpa.calculateGPA(grade, weight);
        
        DecimalFormat df = new DecimalFormat("0.00");
        String averageFormated = df.format(average);

        info += "GPA: " + averageFormated;

        textArea.setText(info);
    }                                            

    private void textfieldGPA1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
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
            java.util.logging.Logger.getLogger(GPACalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GPACalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GPACalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GPACalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GPACalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnHelp;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label lblTitle;
    private javax.swing.JTabbedPane paneTotal;
    private java.awt.TextArea textArea;
    private javax.swing.JTextField textfieldClass1;
    private javax.swing.JTextField textfieldClass2;
    private javax.swing.JTextField textfieldClass3;
    private javax.swing.JTextField textfieldClass4;
    private javax.swing.JTextField textfieldClass5;
    private javax.swing.JTextField textfieldClass6;
    private javax.swing.JTextField textfieldClass7;
    private javax.swing.JTextField textfieldGPA1;
    private javax.swing.JTextField textfieldGPA2;
    private javax.swing.JTextField textfieldGPA3;
    private javax.swing.JTextField textfieldGPA4;
    private javax.swing.JTextField textfieldGPA5;
    private javax.swing.JTextField textfieldGPA6;
    private javax.swing.JTextField textfieldGPA7;
    private javax.swing.JTextField textfieldGrade1;
    private javax.swing.JTextField textfieldGrade2;
    private javax.swing.JTextField textfieldGrade3;
    private javax.swing.JTextField textfieldGrade4;
    private javax.swing.JTextField textfieldGrade5;
    private javax.swing.JTextField textfieldGrade6;
    private javax.swing.JTextField textfieldGrade7;
    // End of variables declaration                   
}
