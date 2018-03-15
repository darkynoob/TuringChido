/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhv1.Vistas;

import javax.swing.table.TableModel;
import uhv1.Negocio.Casa;
import uhv1.Negocio.ControlHistorial;
import uhv1.Negocio.Responsable;
import uhv1.Negocio.pagos;



/**
 *
 * @author Jose Luis
 */
public class VistaHistorial extends javax.swing.JFrame {

    ControlHistorial control;
    Casa casa;
    String telefono;
    String numCasa;
    pagos pagos[];
    
    public VistaHistorial(ControlHistorial control, pagos pagos[]) {
        this.control = control;
        this.pagos = pagos;
        initComponents();
    }

    
    //Metodo que recibe entidad Responsable y muestra datos en Vista Historial (nombre, apellidos, tel, casa)
    public void MuestaHistorial(Responsable hab){
        
        jtxtNombre.setText(hab.getNombre());
        jtxtApellidoPat.setText(hab.getaPat());
        jtxtApellidoMat.setText(hab.getaMat());
        telefono = Integer.toString((int) hab.getTelefono());  // cast de entero a String
        jtxtTelefono.setText(telefono);
        casa = hab.getCasa();
        numCasa = Integer.toString(casa.getNumero());    // cast de entero a String
        jtxtNumCasa.setText(numCasa);
        jtxtSeccion.setText(casa.getSeccion());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtApellidoPat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtApellidoMat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtNumCasa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtSeccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtTelefono = new javax.swing.JTextField();
        Object arr[][] = new Object[pagos.length][3];
        
        
        
        for (int i = 0; i < pagos.length; i++) {
            System.out.println(pagos[i].getFecha());
            arr[i][0] = pagos[i].getFecha();
            System.out.println(pagos[i].getMonto());
            arr[i][1] = pagos[i].getMonto();
            System.out.println(pagos[i].getConcepto());
            arr[i][2] = pagos[i].getConcepto();                                   
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cancelar");
        jButton2.setText("Imprimir");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("HISTORIAL HABITANTE");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(               
            arr,
               
            new String [] {"Fecha",
                            "Monto",
                            "Concepto",
                            "Saldo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        //jTable1.setValueAt("hola", 1, 1);

        jLabel2.setText("Nombre");

        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido Paterno");

        jtxtApellidoPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApellidoPatActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellido Materno");

        jtxtApellidoMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApellidoMatActionPerformed(evt);
            }
        });

        jLabel5.setText("Num casa");

        jtxtNumCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNumCasaActionPerformed(evt);
            }
        });

        jLabel6.setText("Seccion");

        jtxtSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSeccionActionPerformed(evt);
            }
        });

        jLabel7.setText("Tel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel3)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jtxtApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addComponent(jButton2)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtApellidoPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApellidoPatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApellidoPatActionPerformed

    private void jtxtApellidoMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApellidoMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApellidoMatActionPerformed

    private void jtxtSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSeccionActionPerformed

    private void jtxtNumCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNumCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNumCasaActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        dispose();
        control.imprime();
    }   

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxtApellidoMat;
    private javax.swing.JTextField jtxtApellidoPat;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtNumCasa;
    private javax.swing.JTextField jtxtSeccion;
    private javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
