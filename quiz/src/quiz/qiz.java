/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Hmc
 */
public class qiz extends javax.swing.JFrame {

    /**
     * Creates new form qiz
     */
    public qiz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    int a=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 2, 36)); // NOI18N
        jLabel1.setText("Biggest country of pakistan is?");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(67, 32, 470, 45);

        jLabel2.setFont(new java.awt.Font("Vivaldi", 2, 36)); // NOI18N
        jLabel2.setText("main city of pakistan is?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(67, 257, 420, 45);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton1.setText("karachi");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(19, 108, 140, 40);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton2.setText("lahore");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(212, 108, 140, 40);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton3.setText("islamabad");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(395, 108, 140, 40);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton4.setText("abotabad");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(540, 110, 140, 40);

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton5.setText("lahore");
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(20, 380, 140, 40);

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton6.setText("islamabad");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6);
        jRadioButton6.setBounds(210, 380, 140, 40);

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton7.setText("karachi");
        getContentPane().add(jRadioButton7);
        jRadioButton7.setBounds(390, 380, 140, 40);

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton8.setText("abotabad");
        getContentPane().add(jRadioButton8);
        jRadioButton8.setBounds(550, 380, 140, 40);

        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 193, 110, 40);

        jButton2.setText("submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(570, 670, 110, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 190, 460, 30);

        jLabel4.setFont(new java.awt.Font("Vivaldi", 2, 36)); // NOI18N
        jLabel4.setText("Who is First Presidenrt of Pakistan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 510, 540, 60);

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton9.setText("Liquat Ali khan");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton9);
        jRadioButton9.setBounds(520, 600, 150, 29);

        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton10.setText("Ayub Khan");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton10);
        jRadioButton10.setBounds(360, 600, 150, 29);

        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton11.setText("Quaid Azam");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton11);
        jRadioButton11.setBounds(30, 600, 140, 29);

        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jRadioButton12.setText("Skindar Mirza");
        getContentPane().add(jRadioButton12);
        jRadioButton12.setBounds(200, 600, 140, 29);

        jButton3.setText("submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(570, 463, 110, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 670, 440, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 460, 450, 30);

        jButton4.setText("Complete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
                li(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(60, 763, 190, 40);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(300, 760, 350, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        if(jRadioButton1.isSelected()==true){
            
            jLabel3.setText("congrates your c.g.p. is now 4.1");
            a++;
        }
        else
            jLabel3.setText("Wrong ans");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
              
              if(jRadioButton12.isSelected()==true){
            
            jLabel5.setText("congrates your c.g.p. is now 4.1");
            a++;
        }
        else
            jLabel5.setText("Wrong ans");                     
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          
              if(jRadioButton6.isSelected()==true){
            
            jLabel6.setText("congrates your c.g.p. is now 4.1");
             a++;
        }
        else
            jLabel6.setText("Wrong ans");                     
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
        jLabel7.setText("Your score is"+a+ " ");
       jButton4.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void li(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_li
        // TODO add your handling code here:
    }//GEN-LAST:event_li

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
            java.util.logging.Logger.getLogger(qiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
