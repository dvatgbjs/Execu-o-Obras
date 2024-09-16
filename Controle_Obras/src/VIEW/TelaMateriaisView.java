/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import javax.swing.JOptionPane;
import DTO.MateriaisDTO;
import DAO.MateriaisDAO;
import javax.swing.table.DefaultTableModel;
import java.util.List;


public class TelaMateriaisView extends javax.swing.JFrame {

    /**
     * Creates new form TelaMateriaisView
     */
    public TelaMateriaisView() {
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
        jLabel1 = new javax.swing.JLabel();
        VoltarTelaMateriais = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaListaMateriais = new javax.swing.JTable();
        NovoMaterialBtn = new javax.swing.JButton();
        ConsultaMateriaisBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Materiais");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pref png1.png"))); // NOI18N

        VoltarTelaMateriais.setBackground(new java.awt.Color(102, 204, 255));
        VoltarTelaMateriais.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        VoltarTelaMateriais.setText("Voltar");
        VoltarTelaMateriais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VoltarTelaMateriais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarTelaMateriaisActionPerformed(evt);
            }
        });

        TabelaListaMateriais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código Item", "Nome Item", "Valor Item", "Unidade de Medida"
            }
        ));
        jScrollPane1.setViewportView(TabelaListaMateriais);

        NovoMaterialBtn.setBackground(new java.awt.Color(102, 204, 255));
        NovoMaterialBtn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        NovoMaterialBtn.setText("Cadastrar Novo Material");
        NovoMaterialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoMaterialBtnActionPerformed(evt);
            }
        });

        ConsultaMateriaisBtn.setText("Consultar");
        ConsultaMateriaisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaMateriaisBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NovoMaterialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(VoltarTelaMateriais, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultaMateriaisBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(ConsultaMateriaisBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarTelaMateriais)
                    .addComponent(NovoMaterialBtn))
                .addGap(41, 41, 41))
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

    private void VoltarTelaMateriaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarTelaMateriaisActionPerformed
        TelaMenuView telaMenu = new TelaMenuView();
        telaMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarTelaMateriaisActionPerformed

    private void NovoMaterialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoMaterialBtnActionPerformed
        TelaCadastroMaterial telaNovoMaterial = new TelaCadastroMaterial();
        telaNovoMaterial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NovoMaterialBtnActionPerformed

    private void ConsultaMateriaisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaMateriaisBtnActionPerformed
        try{
            listarValores();
        } catch(Exception erro){
            System.out.println("Tela Materiais try/catch" + erro);
        }
    }//GEN-LAST:event_ConsultaMateriaisBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMateriaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMateriaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMateriaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMateriaisView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMateriaisView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultaMateriaisBtn;
    private javax.swing.JButton NovoMaterialBtn;
    private javax.swing.JTable TabelaListaMateriais;
    private javax.swing.JButton VoltarTelaMateriais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

private void listarValores(){
    try{
        
        MateriaisDAO materiaisDao = new MateriaisDAO();
        DefaultTableModel model = (DefaultTableModel) TabelaListaMateriais.getModel();
                model.setNumRows(0);
                
                String CódigoItem = null;
                String NomeItem = null;
                String ValorItem = null;
                String UniMedida = null;
                
                List<MateriaisDTO> lista = materiaisDao.consultarMateriais(CódigoItem, NomeItem, ValorItem, UniMedida);
                
                for (int i = 0; i < lista.size(); i++) {
                    
                    model.addRow(new Object[] {
                        lista.get(i).getCódigoItem(),
                        lista.get(i).getNomeItem(),
                        lista.get(i).getValorItem(),
                        lista.get(i).getUniMedida()
                        ,});
                }
                } catch(Exception erro){
                    JOptionPane.showMessageDialog(null, "TelaMateriais" + erro);
    }
}

}

