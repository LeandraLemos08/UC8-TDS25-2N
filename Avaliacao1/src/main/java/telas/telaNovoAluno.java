
package telas;

import banco.bancoSimulado;
import modelo.Aluno;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class telaNovoAluno extends javax.swing.JInternalFrame {

    int idSelecionado = 0;
    
    public telaNovoAluno() {                   
        initComponents();
        rbNome.setSelected(true);
        carregarAlunos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbNome = new javax.swing.JRadioButton();
        rbId = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAluno = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtTurma = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        brnExcluir = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Alunos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        buttonGroup1.add(rbNome);
        rbNome.setText("Nome");
        rbNome.addActionListener(this::rbNomeActionPerformed);

        buttonGroup1.add(rbId);
        rbId.setText("Id");

        tabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaAluno);

        txtPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar por:"));

        btnPesquisa.setText("Pesquisar");
        btnPesquisa.setBorder(null);

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome:"));

        txtTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turma:"));

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail:"));

        brnExcluir.setText("Excluir");
        brnExcluir.setBorder(null);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbId)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNome)
                    .addComponent(rbId))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisa)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(brnExcluir)
                        .addGap(12, 12, 12)))
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNomeActionPerformed

private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
    if (idSelecionado == 0) {

        JOptionPane.showMessageDialog(
                null,
                "Selecione um aluno.");

        return;
        }
        
     int resposta =
            JOptionPane.showConfirmDialog(
                    null,
                    "Deseja excluir?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);

    if (resposta == JOptionPane.YES_OPTION) {

        for (Aluno aluno :
                bancoSimulado.alunos) {

            if (aluno.getId()
                    == idSelecionado) {

                bancoSimulado.alunos
                        .remove(aluno);

                JOptionPane.showMessageDialog(
                        null,
                        "Aluno removido!");

                carregarAlunos();
                limparCampos();

                idSelecionado = 0;

                break;
            }
        }
    }
}

    private void limparCampos() {
    
    txtNome.setText("");
    txtTurma.setText("");
    txtEmail.setText("");
    txtPesquisar.setText("");
  
    idSelecionado = 0;

    txtNome.requestFocus();
}    
    
private void carregarAlunos() {
    
    DefaultTableModel modelo = new DefaultTableModel();

    String pesquisa = txtPesquisar.getText().toLowerCase();

    modelo.addColumn("ID");
    modelo.addColumn("Nome");
    modelo.addColumn("Turma");
    modelo.addColumn("E-mail");

    for (Aluno aluno : bancoSimulado.alunos) {

        boolean encontrou = false;

        if (rbNome.isSelected()) {

            if (aluno.getNome().toLowerCase().contains(pesquisa)) {
                encontrou = true;
            }

        } else if (rbId.isSelected()) {

            try {
                int idPesquisado = Integer.parseInt(pesquisa);

                if (aluno.getId() == idPesquisado) {
                    encontrou = true;
                }

            } catch (NumberFormatException erro) {
                encontrou = false;
            }
        }

        if (encontrou) {
            modelo.addRow(new Object[]{
            aluno.getId(),
            aluno.getNome(),
            aluno.getTurma(),
            aluno.getEmail()
            });
        }
    }

    tabelaAluno.setModel(modelo);
}
    
   
            
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnExcluir;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbId;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JTable tabelaAluno;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtTurma;
    // End of variables declaration//GEN-END:variables
}
