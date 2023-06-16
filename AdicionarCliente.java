/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sapaiada;

import javax.swing.JOptionPane;

/**
 *
 * @author joaop
 */
public class AdicionarCliente extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarCliente
     */
    private AdicionarCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private static AdicionarCliente addClienteUnic;
    public static AdicionarCliente getAddClienteUnic(){
        if(addClienteUnic == null){
            addClienteUnic = new AdicionarCliente();
        }
        return addClienteUnic;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotId = new javax.swing.JLabel();
        rotNome = new javax.swing.JLabel();
        rotTelefone = new javax.swing.JLabel();
        rotEmail = new javax.swing.JLabel();
        rotSenha = new javax.swing.JLabel();
        rotIdLoja = new javax.swing.JLabel();
        cxId = new javax.swing.JTextField();
        cxNome = new javax.swing.JTextField();
        cxTelefone = new javax.swing.JTextField();
        cxEmail = new javax.swing.JTextField();
        cxSenha = new javax.swing.JPasswordField();
        cxIdLoja = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente");

        rotId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotId.setText("ID:");

        rotNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotNome.setText("NOME:");

        rotTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotTelefone.setText("TELEFONE:");

        rotEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotEmail.setText("EMAIL:");

        rotSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotSenha.setText("SENHA:");

        rotIdLoja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotIdLoja.setText("ID LOJA:");

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btVoltar.setText("VOLTAR");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("LIMPAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(btCadastrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotTelefone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxNome))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotId)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxId))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotIdLoja)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxIdLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotSenha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rotEmail)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotId)
                    .addComponent(cxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotTelefone)
                    .addComponent(cxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotEmail)
                    .addComponent(cxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotSenha)
                    .addComponent(cxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotIdLoja)
                    .addComponent(cxIdLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btCadastrar)
                    .addComponent(jButton1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Conexao.getCon().adicionarCliente(Integer.parseInt(cxId.getText()), cxNome.getText(), cxTelefone.getText(), cxEmail.getText(), cxSenha.getText(), Integer.parseInt(cxIdLoja.getText()));
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!",
                "Cadastro", 1);
        limpar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpar();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void limpar(){
        cxId.setText("");
        cxNome.setText("");
        cxTelefone.setText("");
        cxEmail.setText("");
        cxSenha.setText("");
        cxIdLoja.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxEmail;
    private javax.swing.JTextField cxId;
    private javax.swing.JTextField cxIdLoja;
    private javax.swing.JTextField cxNome;
    private javax.swing.JPasswordField cxSenha;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel rotEmail;
    private javax.swing.JLabel rotId;
    private javax.swing.JLabel rotIdLoja;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotSenha;
    private javax.swing.JLabel rotTelefone;
    // End of variables declaration//GEN-END:variables
}
