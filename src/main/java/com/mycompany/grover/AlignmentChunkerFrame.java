/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.grover;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author seaadmin
 */
public class AlignmentChunkerFrame extends javax.swing.JFrame {

    JFileChooser chunkFileSelection;

    /**
     * Creates new form AlignmentChunkerFrame
     */
    public AlignmentChunkerFrame() {
        initComponents();
        addActionListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alignmentChunkerTitleLabel = new javax.swing.JLabel();
        chunkSizeLabel = new javax.swing.JLabel();
        chunkSizeHintLabel = new javax.swing.JLabel();
        chunkFileButton = new javax.swing.JButton();
        selectIntervalFileButton = new javax.swing.JButton();
        intervalFileNameLabel = new javax.swing.JLabel();
        chunkSizeTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        alignmentChunkerTitleLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        alignmentChunkerTitleLabel.setText("Alignment Chunker");

        chunkSizeLabel.setText("Chunk Size:");

        chunkSizeHintLabel.setText("The number of lines each new file should have");

        chunkFileButton.setText("Chunk File");

        selectIntervalFileButton.setText("Select Interval File");

        intervalFileNameLabel.setText("Interval File");

        chunkSizeTextField.setText("Chunk Size");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(alignmentChunkerTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectIntervalFileButton)
                        .addGap(27, 27, 27)
                        .addComponent(intervalFileNameLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chunkSizeHintLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chunkSizeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(chunkSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(chunkFileButton)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(alignmentChunkerTitleLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectIntervalFileButton)
                    .addComponent(intervalFileNameLabel))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chunkSizeLabel)
                    .addComponent(chunkSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chunkSizeHintLabel)
                .addGap(42, 42, 42)
                .addComponent(chunkFileButton)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AlignmentChunkerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlignmentChunkerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlignmentChunkerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlignmentChunkerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlignmentChunkerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alignmentChunkerTitleLabel;
    private javax.swing.JButton chunkFileButton;
    private javax.swing.JLabel chunkSizeHintLabel;
    private javax.swing.JLabel chunkSizeLabel;
    private javax.swing.JTextField chunkSizeTextField;
    private javax.swing.JLabel intervalFileNameLabel;
    private javax.swing.JButton selectIntervalFileButton;
    // End of variables declaration//GEN-END:variables

    private void addActionListeners() {
        AlignmentChunkerFrameActionListener listener = new AlignmentChunkerFrameActionListener();
        selectIntervalFileButton.addActionListener(listener);
        chunkFileButton.addActionListener(listener);
    }

    private File makeFileImportBox() {
        chunkFileSelection = new JFileChooser();
        int result = chunkFileSelection.showOpenDialog(this);
        File pileup = null;
        if (result == JFileChooser.APPROVE_OPTION) {

            intervalFileNameLabel.setText(chunkFileSelection.getSelectedFile().getName());
            pileup = chunkFileSelection.getSelectedFile();
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("Cancel");
            pileup = null;
        }

        return pileup;
    }

    public class AlignmentChunkerFrameActionListener implements ActionListener {

        private File chunkFile;

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if (source.equals(selectIntervalFileButton)) {
                this.chunkFile = makeFileImportBox();
            }

            if (source.equals(chunkFileButton)) {
                try {
                    int chunkSize = new Integer(chunkSizeTextField.getText());
                    AlignmentChunker chunker = new AlignmentChunker(this.chunkFile, chunkSize);
                try {
                    chunker.chunk();
                } catch (IOException ex) {
                    Logger.getLogger(AlignmentChunkerFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Make sure your chunk size is a number");
                }

                
            }
        }

    }

}