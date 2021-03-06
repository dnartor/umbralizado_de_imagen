package com.mycompany.practica6;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FilenameUtils;
import org.opencv.core.Core;


public class Practica6 extends javax.swing.JFrame {
    
    JFileChooser fc = new JFileChooser();
    JFileChooser saveFC = new JFileChooser();
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imágenes", "jpg", "jpeg");
    
    Boolean imagenOpened = false;

    
    public Practica6() throws IOException {
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        initComponents();
        fc.addChoosableFileFilter(filtro);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lienzo1 = new com.mycompany.practica6.Lienzo();
        jPanel1 = new javax.swing.JPanel();
        umbral = new javax.swing.JTextField();
        umbralizarBtn = new javax.swing.JButton();
        originalBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Barra = new javax.swing.JMenuBar();
        Ficheros = new javax.swing.JMenu();
        Abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        AcercaDe = new javax.swing.JMenuItem();
        FuncionamientoItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lienzo1.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout Lienzo1Layout = new javax.swing.GroupLayout(Lienzo1);
        Lienzo1.setLayout(Lienzo1Layout);
        Lienzo1Layout.setHorizontalGroup(
            Lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        Lienzo1Layout.setVerticalGroup(
            Lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        umbral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umbralActionPerformed(evt);
            }
        });

        umbralizarBtn.setText("Umbralizar");
        umbralizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umbralizarBtnActionPerformed(evt);
            }
        });

        originalBtn.setText("Imagen original");
        originalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originalBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Umbral:");

        jLabel2.setText("Alejandro Santana Amador");

        jLabel3.setText("Daniel Naranjo Torres");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(umbral, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(umbralizarBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(originalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(umbral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(umbralizarBtn))
                .addGap(18, 18, 18)
                .addComponent(originalBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        Ficheros.setText("Ficheros");
        Ficheros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FicherosActionPerformed(evt);
            }
        });

        Abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        Ficheros.add(Abrir);

        guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        Ficheros.add(guardar);
        Ficheros.add(jSeparator1);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        Ficheros.add(salir);

        Barra.add(Ficheros);

        Ayuda.setText("Ayuda");

        AcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        AcercaDe.setText("Acerca de");
        AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaDeActionPerformed(evt);
            }
        });
        Ayuda.add(AcercaDe);

        FuncionamientoItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        FuncionamientoItem.setText("Funcionamiento");
        FuncionamientoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionamientoItemActionPerformed(evt);
            }
        });
        Ayuda.add(FuncionamientoItem);

        Barra.add(Ayuda);

        setJMenuBar(Barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lienzo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FicherosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FicherosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FicherosActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
   
        int res = fc.showOpenDialog(null);
        if(res == JFileChooser.APPROVE_OPTION){
            File fichero = fc.getSelectedFile();
            try {
                imagenOpened=true;
                Lienzo1.setImg(fichero.getAbsolutePath());
            } catch (IOException ex) {
                Logger.getLogger(Practica6.class.getName()).log(Level.SEVERE, null, ex);
            }
            repaint();
        }
    }//GEN-LAST:event_AbrirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if(imagenOpened){
            saveFC.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int res = saveFC.showSaveDialog(null);
            if(res == JFileChooser.APPROVE_OPTION){
                File fichero = saveFC.getSelectedFile();
                try {
                    ImageIO.write(Lienzo1.getImageModify(), FilenameUtils.getExtension(fichero.getAbsolutePath()), fichero);
                    JOptionPane.showMessageDialog(rootPane, "Imagen guardada");  
                } catch (IOException ex) {
                    Logger.getLogger(Practica6.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar una imagen antes","Selecciona una imagen",2);
        }
       
    }//GEN-LAST:event_guardarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void umbralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umbralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umbralActionPerformed

    private void umbralizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umbralizarBtnActionPerformed
        // TODO add your handling code here:
        String umbralTxt = umbral.getText();
        if(umbralTxt.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar un umbral","Selecciona un umbral",2);
        }else if(!imagenOpened){
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar una imagen","Selecciona una imagen",2);
        }else{
            Lienzo1.umbralizar(Integer.parseInt(umbralTxt));
            repaint();
        }
    }//GEN-LAST:event_umbralizarBtnActionPerformed

    private void originalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originalBtnActionPerformed
        if(imagenOpened){
            Lienzo1.imagenOriginal();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar una imagen","Selecciona una imagen",2);
        }
        repaint();
    }//GEN-LAST:event_originalBtnActionPerformed

    private void AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaDeActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Esta aplicación te permite seleccionar una imagen y umbralizarla según un valor.\n Además puedes guardar la imagen.","Acerca de la aplicación",1);
    }//GEN-LAST:event_AcercaDeActionPerformed

    private void FuncionamientoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionamientoItemActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Debes abrir una imagen de tu equipo y definir un valor umbral que servirá como instersección al convertir la imagen en una imagen umbralizada.\n "
                + "Una vez hecho esto, si que desea volver a la imagen original basta con pulsar en el botón \"original\".\n"
                + "Si se desea guardar debes pulsar en el botón \"guardar\" y, a la ruta del fichero, añadir el nombre de la nueva imagen y la extensión.","Funcionamiento de la aplicación",1);

    }//GEN-LAST:event_FuncionamientoItemActionPerformed

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
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Practica6().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Practica6.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JMenuItem AcercaDe;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuBar Barra;
    private javax.swing.JMenu Ficheros;
    private javax.swing.JMenuItem FuncionamientoItem;
    private com.mycompany.practica6.Lienzo Lienzo1;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton originalBtn;
    private javax.swing.JMenuItem salir;
    private javax.swing.JTextField umbral;
    private javax.swing.JButton umbralizarBtn;
    // End of variables declaration//GEN-END:variables
}
