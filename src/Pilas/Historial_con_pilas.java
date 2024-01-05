/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pilas;

import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class Historial_con_pilas extends javax.swing.JFrame {

    /**
     * Creates new form Historial_con_pilas
     */
    public Historial_con_pilas() {
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

        lblTitulo = new javax.swing.JLabel();
        lblIngresePagina = new javax.swing.JLabel();
        txtnombrePagina = new javax.swing.JTextField();
        btnVisitarPagina = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaHistorial = new javax.swing.JTextArea();
        btnRetroceder = new javax.swing.JButton();
        btnMostrarHistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 51));
        lblTitulo.setText("Historial utilizando pilas");

        lblIngresePagina.setText("Ingrese el nombre de la página:");

        txtnombrePagina.setBackground(new java.awt.Color(255, 255, 255));
        txtnombrePagina.setForeground(new java.awt.Color(0, 0, 0));
        txtnombrePagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrePaginaActionPerformed(evt);
            }
        });

        btnVisitarPagina.setBackground(new java.awt.Color(204, 102, 0));
        btnVisitarPagina.setForeground(new java.awt.Color(255, 255, 255));
        btnVisitarPagina.setText("Visitar página ");
        btnVisitarPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitarPaginaActionPerformed(evt);
            }
        });

        txaHistorial.setColumns(20);
        txaHistorial.setForeground(new java.awt.Color(0, 0, 0));
        txaHistorial.setRows(5);
        jScrollPane1.setViewportView(txaHistorial);

        btnRetroceder.setBackground(new java.awt.Color(255, 102, 0));
        btnRetroceder.setForeground(new java.awt.Color(255, 255, 255));
        btnRetroceder.setText("Retroceder");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        btnMostrarHistorial.setBackground(new java.awt.Color(255, 102, 0));
        btnMostrarHistorial.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarHistorial.setText("Mostrar historial");
        btnMostrarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblIngresePagina)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombrePagina)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVisitarPagina)
                        .addGap(65, 65, 65)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRetroceder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarHistorial))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresePagina)
                    .addComponent(txtnombrePagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVisitarPagina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetroceder)
                    .addComponent(btnMostrarHistorial))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombrePaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrePaginaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrePaginaActionPerformed
    public Stack<String> historial = new Stack<>();
    private void btnVisitarPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitarPaginaActionPerformed
        // TODO add your handling code here:
        String pagina = txtnombrePagina.getText();
        historial.push(pagina);
        txaHistorial.append("Página visitada: " + pagina + "\n");
        txtnombrePagina.setText("");
    }//GEN-LAST:event_btnVisitarPaginaActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO add your handling code here:
        if (historial.isEmpty()) {
            txaHistorial.append("El historial está vacío, no se puede retroceder.\n");
        } else {
            String paginaAnterior = historial.pop();
            txaHistorial.append("Retrocediendo a la página anterior: " + paginaAnterior + "\n");
        }
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnMostrarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarHistorialActionPerformed
        // TODO add your handling code here:
        txaHistorial.append("Historial de navegación: " + historial + "\n");
    }//GEN-LAST:event_btnMostrarHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(Historial_con_pilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial_con_pilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial_con_pilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial_con_pilas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial_con_pilas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarHistorial;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btnVisitarPagina;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIngresePagina;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaHistorial;
    private javax.swing.JTextField txtnombrePagina;
    // End of variables declaration//GEN-END:variables
}
