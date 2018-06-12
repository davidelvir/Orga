/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orga;

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

        jd_OpcionesLeer = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        bt_SinCacheLectura = new javax.swing.JButton();
        bt_CacheDirectoLectura = new javax.swing.JButton();
        bt_CacheAsociativoLectura = new javax.swing.JButton();
        bt_AsociativoConjuntoLectura = new javax.swing.JButton();
        bt_tablaLectura = new javax.swing.JButton();
        jd_TablaLeer = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Lectura = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jd_OpcionesEscribir = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        bt_SinCacheEscritura = new javax.swing.JButton();
        bt_CacheDirectoEscritura = new javax.swing.JButton();
        bt_CacheAsociativoEscritura = new javax.swing.JButton();
        bt_AsociativoConjuntoEscritura = new javax.swing.JButton();
        bt_tablaEscritura = new javax.swing.JButton();
        jd_TablaEscribir = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_escritura = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bt_leer = new javax.swing.JButton();
        bt_escribir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel2.setText("Lectura");

        bt_SinCacheLectura.setText("Sin Cache");

        bt_CacheDirectoLectura.setText("Cache Directo");

        bt_CacheAsociativoLectura.setText("Cache Asociativo");

        bt_AsociativoConjuntoLectura.setText("Cache Asociativo por Conjunto");

        bt_tablaLectura.setText("Ver Tabla");
        bt_tablaLectura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_tablaLecturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_OpcionesLeerLayout = new javax.swing.GroupLayout(jd_OpcionesLeer.getContentPane());
        jd_OpcionesLeer.getContentPane().setLayout(jd_OpcionesLeerLayout);
        jd_OpcionesLeerLayout.setHorizontalGroup(
            jd_OpcionesLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OpcionesLeerLayout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(jd_OpcionesLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_SinCacheLectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_CacheDirectoLectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_CacheAsociativoLectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_AsociativoConjuntoLectura, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(jd_OpcionesLeerLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_OpcionesLeerLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(bt_tablaLectura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_OpcionesLeerLayout.setVerticalGroup(
            jd_OpcionesLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OpcionesLeerLayout.createSequentialGroup()
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
                .addGap(42, 42, 42)
                .addComponent(bt_tablaLectura)
                .addContainerGap(50, Short.MAX_VALUE))
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
        jLabel4.setText("Resultados Lectura");

        javax.swing.GroupLayout jd_TablaLeerLayout = new javax.swing.GroupLayout(jd_TablaLeer.getContentPane());
        jd_TablaLeer.getContentPane().setLayout(jd_TablaLeerLayout);
        jd_TablaLeerLayout.setHorizontalGroup(
            jd_TablaLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TablaLeerLayout.createSequentialGroup()
                .addGroup(jd_TablaLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_TablaLeerLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel4))
                    .addGroup(jd_TablaLeerLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jd_TablaLeerLayout.setVerticalGroup(
            jd_TablaLeerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TablaLeerLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel3.setText("Escritura");

        bt_SinCacheEscritura.setText("Sin Cache");

        bt_CacheDirectoEscritura.setText("Cache Directo");

        bt_CacheAsociativoEscritura.setText("Cache Asociativo");

        bt_AsociativoConjuntoEscritura.setText("Cache Asociativo por Conjunto");

        bt_tablaEscritura.setText("Ver Tabla");
        bt_tablaEscritura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_tablaEscrituraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_OpcionesEscribirLayout = new javax.swing.GroupLayout(jd_OpcionesEscribir.getContentPane());
        jd_OpcionesEscribir.getContentPane().setLayout(jd_OpcionesEscribirLayout);
        jd_OpcionesEscribirLayout.setHorizontalGroup(
            jd_OpcionesEscribirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OpcionesEscribirLayout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(jd_OpcionesEscribirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_SinCacheEscritura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_CacheDirectoEscritura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_CacheAsociativoEscritura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_AsociativoConjuntoEscritura, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(jd_OpcionesEscribirLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_OpcionesEscribirLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(bt_tablaEscritura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_OpcionesEscribirLayout.setVerticalGroup(
            jd_OpcionesEscribirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_OpcionesEscribirLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(bt_SinCacheEscritura)
                .addGap(38, 38, 38)
                .addComponent(bt_CacheDirectoEscritura)
                .addGap(47, 47, 47)
                .addComponent(bt_CacheAsociativoEscritura)
                .addGap(49, 49, 49)
                .addComponent(bt_AsociativoConjuntoEscritura)
                .addGap(40, 40, 40)
                .addComponent(bt_tablaEscritura)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        tb_escritura.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tb_escritura);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jLabel5.setText("Resultados Escritura");

        javax.swing.GroupLayout jd_TablaEscribirLayout = new javax.swing.GroupLayout(jd_TablaEscribir.getContentPane());
        jd_TablaEscribir.getContentPane().setLayout(jd_TablaEscribirLayout);
        jd_TablaEscribirLayout.setHorizontalGroup(
            jd_TablaEscribirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TablaEscribirLayout.createSequentialGroup()
                .addGroup(jd_TablaEscribirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_TablaEscribirLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel5))
                    .addGroup(jd_TablaEscribirLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jd_TablaEscribirLayout.setVerticalGroup(
            jd_TablaEscribirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_TablaEscribirLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_leer.setText("Leer");
        bt_leer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_leerMouseClicked(evt);
            }
        });

        bt_escribir.setText("Escribir");
        bt_escribir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_escribirMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel1.setText("Tarea 1 | Organización de Computadoras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_leer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_escribir, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(bt_leer, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(bt_escribir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
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

    private void bt_leerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_leerMouseClicked
        // TODO add your handling code here:
        this.jd_OpcionesLeer.setModal(true);
        this.jd_OpcionesLeer.pack();
        this.jd_OpcionesLeer.setLocationRelativeTo(this);
        this.jd_OpcionesLeer.setVisible(true);
    }//GEN-LAST:event_bt_leerMouseClicked

    private void bt_escribirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_escribirMouseClicked
        // TODO add your handling code here:
        this.jd_OpcionesEscribir.setModal(true);
        this.jd_OpcionesEscribir.pack();
        this.jd_OpcionesEscribir.setLocationRelativeTo(this);
        this.jd_OpcionesEscribir.setVisible(true);
    }//GEN-LAST:event_bt_escribirMouseClicked

    private void bt_tablaEscrituraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_tablaEscrituraMouseClicked
        // TODO add your handling code here:
        this.jd_TablaEscribir.setModal(true);
        this.jd_TablaEscribir.pack();
        this.jd_TablaEscribir.setLocationRelativeTo(this);
        this.jd_TablaEscribir.setVisible(true);
    }//GEN-LAST:event_bt_tablaEscrituraMouseClicked

    private void bt_tablaLecturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_tablaLecturaMouseClicked
        // TODO add your handling code here:
        this.jd_TablaLeer.setModal(true);
        this.jd_TablaLeer.pack();
        this.jd_TablaLeer.setLocationRelativeTo(this);
        this.jd_TablaLeer.setVisible(true);
    }//GEN-LAST:event_bt_tablaLecturaMouseClicked

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
    private javax.swing.JButton bt_AsociativoConjuntoEscritura;
    private javax.swing.JButton bt_AsociativoConjuntoLectura;
    private javax.swing.JButton bt_CacheAsociativoEscritura;
    private javax.swing.JButton bt_CacheAsociativoLectura;
    private javax.swing.JButton bt_CacheDirectoEscritura;
    private javax.swing.JButton bt_CacheDirectoLectura;
    private javax.swing.JButton bt_SinCacheEscritura;
    private javax.swing.JButton bt_SinCacheLectura;
    private javax.swing.JButton bt_escribir;
    private javax.swing.JButton bt_leer;
    private javax.swing.JButton bt_tablaEscritura;
    private javax.swing.JButton bt_tablaLectura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_OpcionesEscribir;
    private javax.swing.JDialog jd_OpcionesLeer;
    private javax.swing.JDialog jd_TablaEscribir;
    private javax.swing.JDialog jd_TablaLeer;
    private javax.swing.JTable tb_Lectura;
    private javax.swing.JTable tb_escritura;
    // End of variables declaration//GEN-END:variables
}
