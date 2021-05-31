/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author moham
 */
public class EnglishToFrench extends javax.swing.JFrame {
    
     static Data X;
    
    static WELCOME W;

    /**
     * Creates new form EnglishToFrench
     */
    public EnglishToFrench(Data X,WELCOME W) {
        
                

        this.X=X;
        this.W=W;
                
        this.setTitle("ENGLISH TO FRENCH");
        initComponents();
        
        this.setSize(699,400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        EnglishWord = new javax.swing.JTextField();
        Type = new javax.swing.JLabel();
        FrenchMeaning = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 701, 385));
        getContentPane().setLayout(null);

        Back.setText("← Back");
        Back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(20, 20, 84, 17);

        EnglishWord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EnglishWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnglishWordActionPerformed(evt);
            }
        });
        getContentPane().add(EnglishWord);
        EnglishWord.setBounds(30, 180, 178, 44);

        Type.setBackground(new java.awt.Color(255, 255, 255));
        Type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Type.setOpaque(true);
        getContentPane().add(Type);
        Type.setBounds(30, 230, 178, 56);

        FrenchMeaning.setBackground(new java.awt.Color(255, 255, 255));
        FrenchMeaning.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        FrenchMeaning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FrenchMeaning.setOpaque(true);
        getContentPane().add(FrenchMeaning);
        FrenchMeaning.setBounds(230, 180, 395, 118);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Cherchez");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 310, 59, 29);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Effacez");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 310, 59, 29);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Saisissez le mot anglais ici.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 160, 180, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/faded.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed

        this.setVisible(false);
        W.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void EnglishWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnglishWordActionPerformed

        EnglishWord.setText("");
    }//GEN-LAST:event_EnglishWordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // System.out.println("Inserted Words: "+X.FR.countInserted);

        if(EnglishWord.getText().isEmpty()){
            FrenchMeaning.setText("<html>"+"Veuillez saisir un mot."+"</html>");

        }
        else{

            String EW=EnglishWord.getText().trim().toLowerCase();

            Node M=X.EN.searchEW(EW);

            String FM=M.FrenchMeaning;
            String T=M.Type;

            FrenchMeaning.setText("<html>"+FM+"</html>");

            Type.setText(T);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        EnglishWord.setText("");
        FrenchMeaning.setText("");
        Type.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EnglishToFrench.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnglishToFrench.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnglishToFrench.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnglishToFrench.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnglishToFrench(X,W).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField EnglishWord;
    private javax.swing.JLabel FrenchMeaning;
    private javax.swing.JLabel Type;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}