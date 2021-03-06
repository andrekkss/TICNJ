/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.component;

import dao.JsonPersistence;
import java.io.IOException;
import javax.swing.JOptionPane;
import util.ManagementPanel;

/**
 * classe do painel PCALCULOS
 * @author André Kitano
 * @since 29-10-2018
 */
public class PCalculos extends javax.swing.JPanel {
    private ManagementPanel m = new ManagementPanel();
    private JsonPersistence j = new JsonPersistence();
    
    /**
     * Creates new form JCalculos
     */
    public PCalculos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jtGuias = new javax.swing.JTabbedPane();
        jtDictomia = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaDicotomia = new javax.swing.JTable();
        jlValor = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        jlValor2 = new javax.swing.JLabel();
        txtX2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIteracoes = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jlFormula = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtResposta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRespostaX1 = new javax.swing.JLabel();
        txtRespostaX2 = new javax.swing.JLabel();
        jtNewton = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaNewton = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtInteracoes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtX = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jlFormula2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRespostaX3 = new javax.swing.JLabel();
        txtResposta2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(794, 538));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jtDictomia.setBackground(new java.awt.Color(255, 255, 255));

        TabelaDicotomia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "X1", "f(X1)", "X2", "f(X2)", "PM = X1+X2/2", "f(PM)", "|X2 - X1|"
            }
        ));
        jScrollPane2.setViewportView(TabelaDicotomia);

        jlValor.setText("valor de x1:");

        txtX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtX1ActionPerformed(evt);
            }
        });

        jlValor2.setText("valor de x2:");

        txtX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtX2ActionPerformed(evt);
            }
        });

        jLabel1.setText("iterações:");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resposta"));

        jlFormula.setText("Formula: x³(x^3)");

        jLabel5.setText("Resposta de x1:");

        txtResposta.setText("0");

        jLabel4.setText("Aproximação:");

        jLabel7.setText("Resposta de x2:");

        txtRespostaX1.setText("0");

        txtRespostaX2.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFormula)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRespostaX1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRespostaX2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRespostaX1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRespostaX2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResposta)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jtDictomiaLayout = new javax.swing.GroupLayout(jtDictomia);
        jtDictomia.setLayout(jtDictomiaLayout);
        jtDictomiaLayout.setHorizontalGroup(
            jtDictomiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtDictomiaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jtDictomiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtDictomiaLayout.createSequentialGroup()
                        .addComponent(jlValor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jtDictomiaLayout.createSequentialGroup()
                        .addComponent(jlValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(jtDictomiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jtDictomiaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jtDictomiaLayout.setVerticalGroup(
            jtDictomiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtDictomiaLayout.createSequentialGroup()
                .addGroup(jtDictomiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtDictomiaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jtDictomiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlValor)
                            .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtIteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jtDictomiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlValor2)
                            .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jtDictomiaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(jtDictomiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jtDictomiaLayout.createSequentialGroup()
                    .addContainerGap(177, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jtGuias.addTab("Dictomia", jtDictomia);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TabelaNewton.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iterações", "Xi", "F(Xi)", "dF(Xi)", "X(i+1)", "X(i+1) - Xi"
            }
        ));
        TabelaNewton.setGridColor(new java.awt.Color(84, 110, 122));
        jScrollPane3.setViewportView(TabelaNewton);

        jLabel2.setText("Valor de x:");

        txtInteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInteracoesActionPerformed(evt);
            }
        });

        jLabel3.setText("Interações:");

        txtX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resposta"));

        jlFormula2.setText("Formula: x³(x^3)");

        jLabel8.setText("Resposta de x:");

        jLabel9.setText("Aproximação:");

        txtRespostaX3.setText("0");

        txtResposta2.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFormula2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRespostaX3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResposta2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFormula2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtRespostaX3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtResposta2))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInteracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jtNewtonLayout = new javax.swing.GroupLayout(jtNewton);
        jtNewton.setLayout(jtNewtonLayout);
        jtNewtonLayout.setHorizontalGroup(
            jtNewtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jtNewtonLayout.setVerticalGroup(
            jtNewtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jtGuias.addTab("Newton Rapshon", jtNewton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtGuias, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addGap(12, 12, 12)
                .addComponent(btnLimpar)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtX1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtX1ActionPerformed

    private void txtX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtX2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtX2ActionPerformed

    /**
     * aciona o evento de calculo do botao "Calcular"
     * ativa os calculos de dicotomia ou newton
     * @param evt evento
     */
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if(jtGuias.getSelectedComponent() == jtDictomia){ 
            m.removeAllRows(TabelaDicotomia, "Dicotomia");
            TabelaDicotomia.setModel(m.isDicotomia(Double.parseDouble(txtX1.getText()), Double.parseDouble(txtX2.getText()), Double.parseDouble(txtIteracoes.getText())));
            m.getResultDicotomia(txtResposta, txtRespostaX1, txtRespostaX2);
        } 
        if(jtGuias.getSelectedComponent() == jtNewton){
            m.removeAllRows(TabelaNewton, "Newton");
            TabelaNewton.setModel(m.isNewton(Double.parseDouble(txtX.getText()), Double.parseDouble(txtInteracoes.getText())));
            m.getResultNewton(txtResposta2, txtRespostaX3);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtInteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInteracoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInteracoesActionPerformed

    private void txtXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXActionPerformed

    /**
     * aciona o evento de click do botao limpar
     * limpa todos os campos e table.
     * @param evt Evento
     */
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        if(jtGuias.getSelectedComponent() == jtDictomia){ 
                m.removeAllRows(TabelaDicotomia, "Dicotomia");
                txtX1.setText("");
                txtX2.setText("");
                txtIteracoes.setText("");
                txtResposta.setText("0");
                txtRespostaX1.setText("0");
                txtRespostaX2.setText("0");
        }  
        if(jtGuias.getSelectedComponent() == jtNewton){
                m.removeAllRows(TabelaNewton, "Newton");
                txtX.setText("");
                txtInteracoes.setText("");
                txtResposta2.setText("0");
                txtRespostaX3.setText("0");
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    /**
     * aciona o evento de click do botao salvar
     * salva no json os calculos de dicotomia ou newton
     * @param evt evento
     */
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(jtGuias.getSelectedComponent() == jtDictomia){
            j.setListaDicotomia(m.getListDicotomia());         
            try {
                j.writeJSON("json/historicod.json");
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error "+ex);
            } finally {
                JOptionPane.showMessageDialog(this, "salvo no historico");
            }
        } 
        if(jtGuias.getSelectedComponent() == jtNewton){
            j.setListaNewton(m.getListNewtonRp());         
            try {
                j.writeJSON("json/historicon.json");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error "+ex);
            } finally {
                JOptionPane.showMessageDialog(this, "salvo no historico");
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDicotomia;
    private javax.swing.JTable TabelaNewton;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlFormula;
    private javax.swing.JLabel jlFormula2;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLabel jlValor2;
    private javax.swing.JPanel jtDictomia;
    private javax.swing.JTabbedPane jtGuias;
    private javax.swing.JPanel jtNewton;
    private javax.swing.JTextField txtInteracoes;
    private javax.swing.JTextField txtIteracoes;
    private javax.swing.JLabel txtResposta;
    private javax.swing.JLabel txtResposta2;
    private javax.swing.JLabel txtRespostaX1;
    private javax.swing.JLabel txtRespostaX2;
    private javax.swing.JLabel txtRespostaX3;
    private javax.swing.JTextField txtX;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    // End of variables declaration//GEN-END:variables
}
