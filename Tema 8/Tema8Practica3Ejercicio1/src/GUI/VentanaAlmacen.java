/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Excepciones.ProductoNoValido;
import Excepciones.DatoObligatorio;
import java.awt.Color;
import java.util.ArrayList;
import tema8practica3ejercicio1.Tema8Practica3Ejercicio1;

/**
 *
 * @author 1gdaw07
 */
public class VentanaAlmacen extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAlmacen
     */
    public VentanaAlmacen() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.lightGray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Operaciones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNomProd = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rCompra = new javax.swing.JRadioButton();
        rVenta = new javax.swing.JRadioButton();
        panCompra = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfPrecioC = new javax.swing.JTextField();
        cProv = new javax.swing.JComboBox<>();
        tfImporteC = new javax.swing.JTextField();
        panVenta = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfPrecioV = new javax.swing.JTextField();
        tfCliente = new javax.swing.JTextField();
        panDescu = new javax.swing.JPanel();
        cbVol = new javax.swing.JCheckBox();
        cbPago = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        tfImporteV = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        tfUni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ALMACEN");

        jLabel2.setText("Nombre del producto");

        jLabel3.setText("Unidades");

        tfNomProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomProdActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Operacion a contabilizar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N

        Operaciones.add(rCompra);
        rCompra.setText("Compra");
        rCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCompraActionPerformed(evt);
            }
        });

        Operaciones.add(rVenta);
        rVenta.setText("Venta");
        rVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rCompra)
                .addGap(18, 18, 18)
                .addComponent(rVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rCompra)
                    .addComponent(rVenta))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos sobre la compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N
        panCompra.setEnabled(false);

        jLabel4.setText("Precio");

        jLabel5.setText("Proveedor");

        jLabel6.setText("Importe de la compra:");

        tfPrecioC.setEnabled(false);

        tfImporteC.setEnabled(false);

        javax.swing.GroupLayout panCompraLayout = new javax.swing.GroupLayout(panCompra);
        panCompra.setLayout(panCompraLayout);
        panCompraLayout.setHorizontalGroup(
            panCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCompraLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(61, 61, 61)
                        .addComponent(tfImporteC, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCompraLayout.createSequentialGroup()
                        .addGroup(panCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(panCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPrecioC, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cProv, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCompraLayout.setVerticalGroup(
            panCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPrecioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfImporteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        panVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos sobre la venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N
        panVenta.setEnabled(false);

        jLabel7.setText("Precio");

        jLabel8.setText("Cliente");

        tfPrecioV.setEnabled(false);

        tfCliente.setEnabled(false);

        panDescu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Descuentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 51, 255))); // NOI18N
        panDescu.setEnabled(false);

        cbVol.setText("Por Volumen");
        cbVol.setEnabled(false);

        cbPago.setText("Por pronto pago");
        cbPago.setEnabled(false);

        javax.swing.GroupLayout panDescuLayout = new javax.swing.GroupLayout(panDescu);
        panDescu.setLayout(panDescuLayout);
        panDescuLayout.setHorizontalGroup(
            panDescuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDescuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbVol)
                .addGap(37, 37, 37)
                .addComponent(cbPago)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        panDescuLayout.setVerticalGroup(
            panDescuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDescuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panDescuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVol)
                    .addComponent(cbPago))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel9.setText("Importe de venta:");

        tfImporteV.setEnabled(false);

        javax.swing.GroupLayout panVentaLayout = new javax.swing.GroupLayout(panVenta);
        panVenta.setLayout(panVentaLayout);
        panVentaLayout.setHorizontalGroup(
            panVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panDescu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panVentaLayout.createSequentialGroup()
                        .addGroup(panVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(37, 37, 37)
                        .addGroup(panVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panVentaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(27, 27, 27)
                        .addComponent(tfImporteV, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        panVentaLayout.setVerticalGroup(
            panVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVentaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(tfPrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panDescu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfImporteV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        bAceptar.setText("Aceptar");
        bAceptar.setEnabled(false);

        bCancelar.setText("Cancelar");

        tfUni.setEnabled(false);
        tfUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfUni, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel1)))
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(bAceptar)
                .addGap(102, 102, 102)
                .addComponent(bCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNomProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(panVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomProdActionPerformed
    try
    {
        if(tfNomProd.getText().isEmpty())
        {
            throw new DatoObligatorio();
        }
        if(Tema8Practica3Ejercicio1.validarProd(tfNomProd.getText())==false)
        {
            throw new ProductoNoValido();
        }
        tfUni.setEnabled(true);
        tfUni.requestFocus();
        
    }
    catch(DatoObligatorio e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "Dato obligatorio");
          tfNomProd.requestFocus();
      }
      catch(ProductoNoValido e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "No existe");
          tfNomProd.requestFocus();
      }
      catch(Exception e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "Problema de tipo: "+e.getMessage());
          tfNomProd.requestFocus();
      }
    }//GEN-LAST:event_tfNomProdActionPerformed

    private void rVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rVentaActionPerformed
    panCompra.setEnabled(false); 
    tfPrecioC.setEnabled(false); 
    cProv.setEnabled(false); 
    panVenta.setEnabled(true); 
    panDescu.setEnabled(true); 
    tfCliente.setEnabled(true); 
    tfImporteV.setEnabled(true); 
    cbPago.setEnabled(true); 
    cbVol.setEnabled(true); 
    }//GEN-LAST:event_rVentaActionPerformed

    private void rCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCompraActionPerformed
    panCompra.setEnabled(true); 
    tfPrecioC.setEnabled(true); 
    cProv.setEnabled(true); 
    panVenta.setEnabled(false); 
    panDescu.setEnabled(false); 
    tfCliente.setEnabled(false); 
    tfImporteV.setEnabled(false); 
    cbPago.setEnabled(false); 
    cbVol.setEnabled(false);
    ArrayList comboboxProveedores = Tema8Practica3Ejercicio1.validarProveedor();
    for(int x=0;x<comboboxProveedores.size();x++)
    {
        cProv.insertItemAt(comboboxProveedores.get(x).toString(),x);
    }
    }//GEN-LAST:event_rCompraActionPerformed

    private void tfUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUniActionPerformed
try
      {
          if (tfUni.getText().isEmpty())
              throw new DatoObligatorio();
          Float.parseFloat(tfUni.getText());
          bAceptar.setEnabled(true);
          bAceptar.requestFocus();
      }
      catch(DatoObligatorio e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "Es obligatorio indicar el precio ");
          tfUni.requestFocus();
      }
      catch(NumberFormatException e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "El precio tiene que ser numérico");
          tfUni.requestFocus();
      }
      catch(Exception e)
      {
          javax.swing.JOptionPane.showMessageDialog(this, "Problemas con el precio de tipo: "+e.getMessage());
          tfUni.requestFocus();
      }
    }//GEN-LAST:event_tfUniActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Operaciones;
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JComboBox<String> cProv;
    private javax.swing.JCheckBox cbPago;
    private javax.swing.JCheckBox cbVol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panCompra;
    private javax.swing.JPanel panDescu;
    private javax.swing.JPanel panVenta;
    private javax.swing.JRadioButton rCompra;
    private javax.swing.JRadioButton rVenta;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfImporteC;
    private javax.swing.JTextField tfImporteV;
    private javax.swing.JTextField tfNomProd;
    private javax.swing.JTextField tfPrecioC;
    private javax.swing.JTextField tfPrecioV;
    private javax.swing.JTextField tfUni;
    // End of variables declaration//GEN-END:variables
}