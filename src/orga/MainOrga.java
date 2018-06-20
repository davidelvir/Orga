/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orga;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class MainOrga extends javax.swing.JFrame {

    /**
     * Creates new form MainOrga
     */
    public MainOrga() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Tarea 1 | Organización de Computadoras");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Opciones = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        bt_SinCacheLectura = new javax.swing.JButton();
        bt_CacheDirectoLectura = new javax.swing.JButton();
        bt_CacheAsociativoLectura = new javax.swing.JButton();
        bt_AsociativoConjuntoLectura = new javax.swing.JButton();
        jd_Tabla = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Lectura = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_leer1 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel2.setText("Opciones");

        bt_SinCacheLectura.setText("Sin Cache");
        bt_SinCacheLectura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_SinCacheLecturaMouseClicked(evt);
            }
        });
        bt_SinCacheLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SinCacheLecturaActionPerformed(evt);
            }
        });

        bt_CacheDirectoLectura.setText("Cache Directo");
        bt_CacheDirectoLectura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_CacheDirectoLecturaMouseClicked(evt);
            }
        });
        bt_CacheDirectoLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CacheDirectoLecturaActionPerformed(evt);
            }
        });

        bt_CacheAsociativoLectura.setText("Cache Asociativo");
        bt_CacheAsociativoLectura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_CacheAsociativoLecturaMouseClicked(evt);
            }
        });
        bt_CacheAsociativoLectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CacheAsociativoLecturaActionPerformed(evt);
            }
        });

        bt_AsociativoConjuntoLectura.setText("Cache Asociativo por Conjunto");
        bt_AsociativoConjuntoLectura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_AsociativoConjuntoLecturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_OpcionesLayout = new javax.swing.GroupLayout(jd_Opciones.getContentPane());
        jd_Opciones.getContentPane().setLayout(jd_OpcionesLayout);
        jd_OpcionesLayout.setHorizontalGroup(
            jd_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OpcionesLayout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(jd_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_SinCacheLectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_CacheDirectoLectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_CacheAsociativoLectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_AsociativoConjuntoLectura, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(jd_OpcionesLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_OpcionesLayout.setVerticalGroup(
            jd_OpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OpcionesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(bt_SinCacheLectura)
                .addGap(34, 34, 34)
                .addComponent(bt_CacheDirectoLectura)
                .addGap(33, 33, 33)
                .addComponent(bt_CacheAsociativoLectura)
                .addGap(40, 40, 40)
                .addComponent(bt_AsociativoConjuntoLectura)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        tb_Lectura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Tipo", "Tiempo de Corrida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_Lectura);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel4.setText("Resultados");

        javax.swing.GroupLayout jd_TablaLayout = new javax.swing.GroupLayout(jd_Tabla.getContentPane());
        jd_Tabla.getContentPane().setLayout(jd_TablaLayout);
        jd_TablaLayout.setHorizontalGroup(
            jd_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TablaLayout.createSequentialGroup()
                .addGroup(jd_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_TablaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_TablaLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel4)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jd_TablaLayout.setVerticalGroup(
            jd_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TablaLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel1.setText("Tarea 1 | Organización de Computadoras");

        bt_leer1.setText("Ordenar numeros");
        bt_leer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_leer1MouseClicked(evt);
            }
        });
        bt_leer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_leer1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(bt_leer1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(bt_leer1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
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

    private void bt_leer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_leer1MouseClicked
        // TODO add your handling code here:
        this.jd_Opciones.setModal(true);
        this.jd_Opciones.pack();
        this.jd_Opciones.setLocationRelativeTo(this);
        this.jd_Opciones.setVisible(true);
    }//GEN-LAST:event_bt_leer1MouseClicked

    private void bt_leer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_leer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_leer1ActionPerformed

    private void bt_SinCacheLecturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_SinCacheLecturaMouseClicked
        // TODO add your handling code here:

        //Llamar Metodos Lectura y Escritura
        this.jd_Tabla.setModal(true);
        this.jd_Tabla.pack();
        this.jd_Tabla.setLocationRelativeTo(this);
        this.jd_Tabla.setVisible(true);

    }//GEN-LAST:event_bt_SinCacheLecturaMouseClicked

    private void bt_CacheDirectoLecturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CacheDirectoLecturaMouseClicked
        // TODO add your handling code here:

        //Llamar Metodos Lectura y Escritura
        this.jd_Tabla.setModal(true);
        this.jd_Tabla.pack();
        this.jd_Tabla.setLocationRelativeTo(this);
        this.jd_Tabla.setVisible(true);

    }//GEN-LAST:event_bt_CacheDirectoLecturaMouseClicked

    private void bt_CacheAsociativoLecturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CacheAsociativoLecturaMouseClicked
        // TODO add your handling code here:

        //Llamar Metodos Lectura y Escritura
        this.jd_Tabla.setModal(true);
        this.jd_Tabla.pack();
        this.jd_Tabla.setLocationRelativeTo(this);
        this.jd_Tabla.setVisible(true);

    }//GEN-LAST:event_bt_CacheAsociativoLecturaMouseClicked

    private void bt_AsociativoConjuntoLecturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_AsociativoConjuntoLecturaMouseClicked
        // TODO add your handling code here:

        //Llamar Metodos Lectura y Escritura
        this.jd_Tabla.setModal(true);
        this.jd_Tabla.pack();
        this.jd_Tabla.setLocationRelativeTo(this);
        this.jd_Tabla.setVisible(true);

    }//GEN-LAST:event_bt_AsociativoConjuntoLecturaMouseClicked

    private void bt_CacheDirectoLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CacheDirectoLecturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_CacheDirectoLecturaActionPerformed

    private void bt_SinCacheLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SinCacheLecturaActionPerformed
        // TODO add your handling code here:
        Memorias m = new Memorias();
        ArrayList<Integer> datos = m.leerDatos();
        System.out.println(datos);
        int time = m.ordenar(1);

        System.out.println("--------------------------------------------------");
        for (int i = 0; i < m.getRAM().length; i++) {
            int j = (m.getRAM())[i];
            System.out.println(j);
        }
        System.out.println("TIEMPO: " + time + "µs");
    }//GEN-LAST:event_bt_SinCacheLecturaActionPerformed

    private void bt_CacheAsociativoLecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CacheAsociativoLecturaActionPerformed
        // TODO add your handling code here:
        Memorias m = new Memorias();
        ArrayList<Integer> datos = m.leerDatos();
        m.ordenar(3);

        System.out.println(datos);

        for (int i = 0; i < m.getRAM().length; i++) {
            int j = (m.getRAM())[i];
            System.out.println(j);
        }

        System.out.println(m.getTiempo());

    }//GEN-LAST:event_bt_CacheAsociativoLecturaActionPerformed

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
            java.util.logging.Logger.getLogger(MainOrga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainOrga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainOrga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainOrga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainOrga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_AsociativoConjuntoLectura;
    private javax.swing.JButton bt_CacheAsociativoLectura;
    private javax.swing.JButton bt_CacheDirectoLectura;
    private javax.swing.JButton bt_SinCacheLectura;
    private javax.swing.JButton bt_leer1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_Opciones;
    private javax.swing.JDialog jd_Tabla;
    private javax.swing.JTable tb_Lectura;
    // End of variables declaration//GEN-END:variables
}
