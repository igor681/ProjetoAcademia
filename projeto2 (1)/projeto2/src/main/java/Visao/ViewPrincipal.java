/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ViewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public ViewPrincipal() {
        initComponents();
    this.setLocationRelativeTo(null);

    }
    
    public void exibirTela(){
        this.setVisible(true);
    }
    

    public void adicionarAcaoCadastraCargo(ActionListener acao){
        miCadastraCargo.addActionListener(acao);
    }
    public void adicionarAcaoCadastrarFuncionario(ActionListener acao){
        miCadastraFuncionario.addActionListener(acao);
    }
    public void adicionarAcaoCadastrarPlanos(ActionListener acao){
        miCadastraPlano.addActionListener(acao);
    }
    public void adicionarAcaoCadastrarCliente(ActionListener acao) {
        miCadastraCliente.addActionListener(acao);
    }
    
    public void exibirMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        miCadastraCargo = new javax.swing.JMenuItem();
        mnFuncionario = new javax.swing.JMenu();
        miCadastraFuncionario = new javax.swing.JMenuItem();
        mnPlano = new javax.swing.JMenu();
        miCadastraPlano = new javax.swing.JMenuItem();
        mnCliente = new javax.swing.JMenu();
        miCadastraCliente = new javax.swing.JMenuItem();
        miBuscarNome = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnCadastro.setText("Cargos");

        miCadastraCargo.setText("Cadastra");
        miCadastraCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastraCargoActionPerformed(evt);
            }
        });
        mnCadastro.add(miCadastraCargo);

        jMenuBar1.add(mnCadastro);

        mnFuncionario.setText("Funcionario");

        miCadastraFuncionario.setText("Cadastra");
        mnFuncionario.add(miCadastraFuncionario);

        jMenuBar1.add(mnFuncionario);

        mnPlano.setText("Plano");

        miCadastraPlano.setText("Cadastra");
        mnPlano.add(miCadastraPlano);

        jMenuBar1.add(mnPlano);

        mnCliente.setText("Cliente");

        miCadastraCliente.setText("Cadastra");
        mnCliente.add(miCadastraCliente);

        miBuscarNome.setText("Buscar por nome");
        mnCliente.add(miBuscarNome);

        jMenuBar1.add(mnCliente);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastraCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastraCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miCadastraCargoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miBuscarNome;
    private javax.swing.JMenuItem miCadastraCargo;
    private javax.swing.JMenuItem miCadastraCliente;
    private javax.swing.JMenuItem miCadastraFuncionario;
    private javax.swing.JMenuItem miCadastraPlano;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenu mnCliente;
    private javax.swing.JMenu mnFuncionario;
    private javax.swing.JMenu mnPlano;
    // End of variables declaration//GEN-END:variables
}
