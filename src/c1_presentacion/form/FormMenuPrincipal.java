/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1_presentacion.form;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class FormMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormMenuPrincipal
     */
    public FormMenuPrincipal() {
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

        BarraAC = new javax.swing.JToolBar();
        botonACMarca = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        BarraAC.setRollover(true);

        botonACMarca.setText("Marca");
        botonACMarca.setFocusable(false);
        botonACMarca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonACMarca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonACMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonACMarcaActionPerformed(evt);
            }
        });
        BarraAC.add(botonACMarca);

        getContentPane().add(BarraAC, java.awt.BorderLayout.PAGE_START);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonACMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonACMarcaActionPerformed
        // TODO add your handling code here:
        new FormGestionarMarca(this).setVisible(true);
    }//GEN-LAST:event_botonACMarcaActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarraAC;
    private javax.swing.JToggleButton botonACMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
