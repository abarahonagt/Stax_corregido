package UI;

import javax.swing.ImageIcon;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class adicion extends javax.swing.JFrame {

    /**
     * Creates new form adicion
     */
   
    public adicion() {
        initComponents();
        //edicion de ventana
        setIconImage(new ImageIcon(getClass().getResource("/iconos/principal.png")).getImage());
        this.setLocationRelativeTo(this);
        rsutilities.RSUtilities.setCentrarVentana(this);
        rsutilities.RSUtilities.setMoverVentana(this);
        rsutilities.RSUtilities.setOpaqueVentana(this, false);
        //fin de la edicion de ventana
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajita1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajita2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cajita3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cajita4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        botoncalcular1 = new javax.swing.JButton();
        botonlimpiar1 = new javax.swing.JButton();
        cajita5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cajita6 = new javax.swing.JTextField();
        cajita7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        botonregresar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stax | Calculo de Probabilidad por Ley de la Adicion");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("P(A U B)  =");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("P");

        cajita1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cajita1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajita1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("+");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("P");

        cajita2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cajita2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajita2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("-");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("P  (");

        cajita3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("???");

        cajita4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText(")  =");

        botoncalcular1.setBackground(new java.awt.Color(255, 255, 255));
        botoncalcular1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botoncalcular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/calcular.png"))); // NOI18N
        botoncalcular1.setToolTipText("Calcular");
        botoncalcular1.setBorder(null);
        botoncalcular1.setBorderPainted(false);
        botoncalcular1.setContentAreaFilled(false);
        botoncalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncalcular1ActionPerformed(evt);
            }
        });

        botonlimpiar1.setBackground(new java.awt.Color(255, 255, 255));
        botonlimpiar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonlimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar todo.png"))); // NOI18N
        botonlimpiar1.setToolTipText("Limpiar");
        botonlimpiar1.setBorder(null);
        botonlimpiar1.setBorderPainted(false);
        botonlimpiar1.setContentAreaFilled(false);
        botonlimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonlimpiar1ActionPerformed(evt);
            }
        });

        cajita5.setEditable(false);
        cajita5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cajita5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajita5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("R//");

        cajita6.setEditable(false);
        cajita6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cajita6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajita6ActionPerformed(evt);
            }
        });

        cajita7.setEditable(false);
        cajita7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cajita7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajita7ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("-");

        botonregresar1.setBackground(new java.awt.Color(255, 255, 255));
        botonregresar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonregresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/regresar.png"))); // NOI18N
        botonregresar1.setToolTipText("Regresar");
        botonregresar1.setBorder(null);
        botonregresar1.setBorderPainted(false);
        botonregresar1.setContentAreaFilled(false);
        botonregresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregresar1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas.png"))); // NOI18N
        jLabel1.setText("Ley de la adici??n");

        bt_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        bt_salir.setToolTipText("Bye, bye...");
        bt_salir.setBorderPainted(false);
        bt_salir.setContentAreaFilled(false);
        bt_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/llorar.png"))); // NOI18N
        bt_salir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/llorar.png"))); // NOI18N
        bt_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajita1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(cajita6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cajita2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajita3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajita4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cajita7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajita5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botoncalcular1)
                .addGap(18, 18, 18)
                .addComponent(botonlimpiar1)
                .addGap(18, 18, 18)
                .addComponent(botonregresar1)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cajita1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cajita2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(cajita3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cajita4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cajita5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajita6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajita7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonregresar1)
                    .addComponent(botonlimpiar1)
                    .addComponent(botoncalcular1))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoncalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncalcular1ActionPerformed
        // TODO add your handling code here:
        //int c1,c2,c6;
        double c1,c2,c6,c3,c4,c5,c7;
        
        c1=Double.parseDouble(cajita1.getText());
        c2=Double.parseDouble(cajita2.getText());
        c3=Double.parseDouble(cajita3.getText());
        c4=Double.parseDouble(cajita4.getText());
        
        c6=(c1+c2);
        c7=(double) (c3/c4);
        c5=(double) (c6-c7)*100;
        
        cajita6.setText(String.valueOf(c6));
        cajita7.setText(String.valueOf(c7));
        cajita5.setText(String.format("%.2f",c5));
    }//GEN-LAST:event_botoncalcular1ActionPerformed

    private void cajita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajita1ActionPerformed
    
// TODO add your handling code here:
    }//GEN-LAST:event_cajita1ActionPerformed

    private void cajita2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajita2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajita2ActionPerformed

    private void cajita5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajita5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajita5ActionPerformed

    private void cajita6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajita6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajita6ActionPerformed

    private void cajita7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajita7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajita7ActionPerformed

    private void botonlimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonlimpiar1ActionPerformed
        // TODO add your handling code here:
        cajita1.setText(" ");
        cajita2.setText(" ");
        cajita3.setText(" ");
        cajita4.setText(" ");
        cajita5.setText(" ");
        cajita6.setText(" ");
        cajita7.setText(" ");
    }//GEN-LAST:event_botonlimpiar1ActionPerformed

    private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_bt_salirActionPerformed

    private void botonregresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregresar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonregresar1ActionPerformed

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
            java.util.logging.Logger.getLogger(adicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoncalcular1;
    private javax.swing.JButton botonlimpiar1;
    private javax.swing.JButton botonregresar1;
    private javax.swing.JButton bt_salir;
    private javax.swing.JTextField cajita1;
    private javax.swing.JTextField cajita2;
    private javax.swing.JTextField cajita3;
    private javax.swing.JTextField cajita4;
    private javax.swing.JTextField cajita5;
    private javax.swing.JTextField cajita6;
    private javax.swing.JTextField cajita7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
