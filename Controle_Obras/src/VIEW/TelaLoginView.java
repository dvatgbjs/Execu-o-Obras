

package VIEW;

import DAO.LoginDAO;
import DTO.LoginDTO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class TelaLoginView extends javax.swing.JFrame {

    /**
     * Creates new form TelaLoginView
     */
    public TelaLoginView() {
        initComponents();
        setLocationRelativeTo(null);
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
        Txt_If = new javax.swing.JTextField();
        Txt_Password = new javax.swing.JPasswordField();
        View_PasswordCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_PasswordActionPerformed(evt);
            }
        });
        Txt_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_PasswordKeyPressed(evt);
            }
        });

        View_PasswordCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        View_PasswordCheckBox.setText("Ver Senha");
        View_PasswordCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        View_PasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_PasswordCheckBoxActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("IF:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("SENHA:");

        BtnLogin.setBackground(new java.awt.Color(102, 204, 255));
        BtnLogin.setText("ENTRAR");
        BtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pref png1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_If, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(View_PasswordCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Txt_If, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(View_PasswordCheckBox)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(BtnLogin)
                .addGap(26, 26, 26))
        );

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

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        
        
        try {
            
            String If, Senha;
            
            If = Txt_If.getText();
            Senha = String.valueOf(Txt_Password.getPassword());
            
            
            LoginDTO objlogindto = new LoginDTO();
            
            objlogindto.setIf(If);
            objlogindto.setSenha(Senha);
            
            LoginDAO objlogindao = new LoginDAO();
            
            ResultSet rslogindao = objlogindao.confirmacaoLogin(objlogindto);
            
            if(rslogindao.next()){
                
                JOptionPane.showMessageDialog(null, "Login Realizado com Sucesso!");
                
                TelaMenuView telamenu = new TelaMenuView();
                telamenu.setVisible(true);
                
                this.dispose();
            }
            else {
                
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos!");
            }
                     
        } catch(Exception erro){
            
            JOptionPane.showMessageDialog(null, "Tela Login" + erro);
        }
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void View_PasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_PasswordCheckBoxActionPerformed
       if(View_PasswordCheckBox.isSelected()){
           
           Txt_Password.setEchoChar((char) 0);
       } else{
           Txt_Password.setEchoChar('*');
           
       }
    }//GEN-LAST:event_View_PasswordCheckBoxActionPerformed

    private void Txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_PasswordActionPerformed
        
        
    }//GEN-LAST:event_Txt_PasswordActionPerformed

    private void Txt_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_PasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
        try {
            
            String If, Senha;
            
            If = Txt_If.getText();
            Senha = String.valueOf(Txt_Password.getPassword());
            
            
            LoginDTO objlogindto = new LoginDTO();
            
            objlogindto.setIf(If);
            objlogindto.setSenha(Senha);
            
            LoginDAO objlogindao = new LoginDAO();
            
            ResultSet rslogindao = objlogindao.confirmacaoLogin(objlogindto);
            
            if(rslogindao.next()){
                
                JOptionPane.showMessageDialog(null, "Login Realizado com Sucesso!");
                
                TelaMenuView telamenu = new TelaMenuView();
                telamenu.setVisible(true);
                
                this.dispose();
            }
            else {
                
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha incorretos!");
            }
                     
        } catch(Exception erro){
            
            JOptionPane.showMessageDialog(null, "Tela Login" + erro);
        }
    }//GEN-LAST:event_Txt_PasswordKeyPressed
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
            java.util.logging.Logger.getLogger(TelaLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JTextField Txt_If;
    private javax.swing.JPasswordField Txt_Password;
    private javax.swing.JCheckBox View_PasswordCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
