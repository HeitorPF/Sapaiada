/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sapaiada;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaop
 */
public class ListaFuncionarios extends javax.swing.JFrame {
        
    private ListaFuncionarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private static ListaFuncionarios listFunc;
    public static ListaFuncionarios getListFunc(){
        if(listFunc == null){
            listFunc = new ListaFuncionarios();
        }
        return listFunc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabFuncionarios = new javax.swing.JTable();
        cmbItemBusca = new javax.swing.JComboBox<>();
        rotBuscarPor = new javax.swing.JLabel();
        cxBuscar = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        btBusca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "EMAIL", "CARGO", "IDLOJA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabFuncionarios);

        cmbItemBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "escolha uma opção", "Id", "Nome", "Cargo" }));

        rotBuscarPor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotBuscarPor.setText("BUSCAR POR:");

        btVoltar.setText("VOLTAR");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btAdicionar.setText("ADICIONAR");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btBusca.setText("BUSCAR");
        btBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbItemBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBusca)
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbItemBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotBuscarPor)
                    .addComponent(cxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBusca)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btAdicionar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaActionPerformed
        int pos = cmbItemBusca.getSelectedIndex();
        Conexao.getCon().executaBuscaFunc(pos, cxBuscar.getText());
        listarFunc(pos);
    }//GEN-LAST:event_btBuscaActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        AdicionarFuncionario.getAddFuncUnic().setVisible(true);
    }//GEN-LAST:event_btAdicionarActionPerformed
    
    public void listaFuncionario(int pos){
        DefaultTableModel tabModel = (DefaultTableModel) tabFuncionarios.getModel();
        int posLin = 0;
        Funcionario f = new Funcionario();
        f.setIdFunc(Integer.parseInt(cxBuscar.getText()));
        Conexao.getCon().executaBuscaFunc(pos,cxBuscar.getText());
        tabModel.setRowCount(posLin);
        for (int i = 0; i < Banco.getBancoRoupaUnic().bdFuncionario.size(); i++) {
            if (f.getIdFunc() == Banco.getBancoRoupaUnic().bdFuncionario.get(i).getIdFunc()) {
                tabModel.insertRow(posLin, new Object[]{Banco.getBancoRoupaUnic().bdFuncionario.get(i).getIdFunc(),
                    Banco.getBancoRoupaUnic().bdFuncionario.get(i).getNomeFunc(),
                    Banco.getBancoRoupaUnic().bdFuncionario.get(i).getEmail(),
                    Banco.getBancoRoupaUnic().bdFuncionario.get(i).getCargFunc(),
                    Banco.getBancoRoupaUnic().bdFuncionario.get(i).getIdLoja()});
                posLin++;
            }
        }
    }
    
    public void listarFunc(int pos) {
        Banco.getBancoRoupaUnic().getBdFuncionario().clear();
        Conexao.getCon().executaBuscaFunc(pos, cxBuscar.getText());
        DefaultTableModel tabModel = (DefaultTableModel) tabFuncionarios.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        for (Funcionario f : Banco.getBancoRoupaUnic().getBdFuncionario()) {
            tabModel.insertRow(posLin, new Object[]{f.getIdFunc(), f.getNomeFunc(), f.getEmail(), f.getCargFunc(), f.getIdLoja()});
            posLin++;
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
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btBusca;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cmbItemBusca;
    private javax.swing.JTextField cxBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotBuscarPor;
    private javax.swing.JTable tabFuncionarios;
    // End of variables declaration//GEN-END:variables
}
