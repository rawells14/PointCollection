
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class gui extends javax.swing.JFrame {

    public gui() {
        initComponents();
        jPanel2.setVisible(false);
        jCheckBox1.setVisible(false);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(440, 340));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        jLabel2.setText("User Info");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(160, 20, 70, 14);

        jButton2.setText("Sign In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(150, 220, 90, 23);

        jTextField1.setText("Full Name");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(150, 40, 80, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Meeting", "Donation", "Contest", "Volunteer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(150, 80, 130, 20);

        jCheckBox1.setText("TShirt");
        jPanel2.add(jCheckBox1);
        jCheckBox1.setBounds(150, 110, 90, 23);

        jTextField2.setText("Amount Donated");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(150, 110, 130, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 430, 340);

        jLabel1.setText("Point Collection");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 40, 99, 14);

        jButton3.setText("Help");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 260, 80, 23);

        jButton1.setText("Check In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 260, 110, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setVisible(false);
        jButton3.setVisible(false);
        jPanel2.setVisible(true);
        jTextField2.setVisible(false);
        jCheckBox1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        addPoints();
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jCheckBox1.setVisible(false);
        jTextField2.setVisible(false);
        if (jComboBox1.getSelectedIndex() == 0) {
            jCheckBox1.setVisible(true);
        }
        if (jComboBox1.getSelectedIndex() == 1) {
            jTextField2.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    public void reset() {
        jCheckBox1.setSelected(false);
        jTextField2.setText("Amount Donated");
        jComboBox1.setSelectedIndex(0);
        jPanel2.setVisible(false);
        jButton1.setVisible(true);
        jButton3.setVisible(true);
    }

    public void log(String s) {
    }
//meeting, donation, contest, volunteer

    public void addPoints() {
        int tot = 7;
        if (jComboBox1.getSelectedIndex() == 0) {
            tot++;
            if (jCheckBox1.isSelected()) {
                tot++;
            }
        }
        if (jComboBox1.getSelectedIndex() == 1) {
            tot += Integer.parseInt(jTextField2.getText());
        }
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("data.csv"));
            pw.append(jTextField1.getText() + ", " + tot);
            pw.append("");
            pw.close();
        } catch (Exception e) {
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
