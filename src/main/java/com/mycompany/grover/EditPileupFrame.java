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
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author seaadmin
 */
public class EditPileupFrame extends javax.swing.JFrame {

    private JFileChooser importPileupBox;

    /**
     * Creates new form EditPileupFrame
     */
    public EditPileupFrame() {
        initComponents();
        addActionListeners();
        populateDropdowns();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editPileupFrameTitleLabel = new javax.swing.JLabel();
        importPileupFileButton = new javax.swing.JButton();
        startEditButton = new javax.swing.JButton();
        selectedFileLabel = new javax.swing.JLabel();
        columnSpecificationLabel = new javax.swing.JLabel();
        sampleNameColumnLabel = new javax.swing.JLabel();
        nucleotideColumnLabel = new javax.swing.JLabel();
        countColumnLabel = new javax.swing.JLabel();
        sampleNamePositionComboBox = new javax.swing.JComboBox();
        nucleotidePositionComboBox = new javax.swing.JComboBox();
        countPositionComboBox = new javax.swing.JComboBox();
        hitsLabel = new javax.swing.JLabel();
        hitsPositionComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        editPileupFrameTitleLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        editPileupFrameTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editPileupFrameTitleLabel.setText("Edit Pileup");

        importPileupFileButton.setText("Pileup File");

        startEditButton.setText("Edit");

        selectedFileLabel.setText("Selected File");

        columnSpecificationLabel.setText("Column Specification:");

        sampleNameColumnLabel.setText("Sample Name:");

        nucleotideColumnLabel.setText("Nucleotide:");

        countColumnLabel.setText(" Nucleotide Number:");

        sampleNamePositionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        nucleotidePositionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        countPositionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        hitsLabel.setText("Number of Hits");

        hitsPositionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(importPileupFileButton)
                        .addGap(34, 34, 34)
                        .addComponent(selectedFileLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(columnSpecificationLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sampleNameColumnLabel)
                            .addComponent(nucleotideColumnLabel)
                            .addComponent(countColumnLabel)
                            .addComponent(hitsLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sampleNamePositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nucleotidePositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countPositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hitsPositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(editPileupFrameTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(startEditButton)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(editPileupFrameTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importPileupFileButton)
                    .addComponent(selectedFileLabel))
                .addGap(28, 28, 28)
                .addComponent(columnSpecificationLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sampleNameColumnLabel)
                    .addComponent(sampleNamePositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nucleotideColumnLabel)
                    .addComponent(nucleotidePositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countPositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countColumnLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hitsLabel)
                    .addComponent(hitsPositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(startEditButton)
                .addContainerGap())
        );

        countColumnLabel.getAccessibleContext().setAccessibleName("nucleotide Position:");

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
            java.util.logging.Logger.getLogger(EditPileupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPileupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPileupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPileupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPileupFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel columnSpecificationLabel;
    private javax.swing.JLabel countColumnLabel;
    private javax.swing.JComboBox countPositionComboBox;
    private javax.swing.JLabel editPileupFrameTitleLabel;
    private javax.swing.JLabel hitsLabel;
    private javax.swing.JComboBox hitsPositionComboBox;
    private javax.swing.JButton importPileupFileButton;
    private javax.swing.JLabel nucleotideColumnLabel;
    private javax.swing.JComboBox nucleotidePositionComboBox;
    private javax.swing.JLabel sampleNameColumnLabel;
    private javax.swing.JComboBox sampleNamePositionComboBox;
    private javax.swing.JLabel selectedFileLabel;
    private javax.swing.JButton startEditButton;
    // End of variables declaration//GEN-END:variables

    private void addActionListeners() {
        EditPileupFrameActionListener listener = new EditPileupFrameActionListener();
        startEditButton.addActionListener(listener);
        importPileupFileButton.addActionListener(listener);
    }

    private void populateDropdowns() {
        populateColumnDropdown(sampleNamePositionComboBox);
        populateColumnDropdown(nucleotidePositionComboBox);
        populateColumnDropdown(countPositionComboBox);
        populateColumnDropdown(hitsPositionComboBox);
    }

    private void populateColumnDropdown(JComboBox dropdown) {
        dropdown.removeAllItems();
        for (int i = 1; i < 5 + 1; i++) {
            dropdown.addItem(i);
        }
    }

    private File makeFileImportBox() {
        importPileupBox = new JFileChooser();
        int result = importPileupBox.showOpenDialog(this);
        File pileup = null;
        if (result == JFileChooser.APPROVE_OPTION) {

            selectedFileLabel.setText(importPileupBox.getSelectedFile().getName());
            pileup = importPileupBox.getSelectedFile();
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("Cancel");
            pileup = null;
        }

        return pileup;
    }

    public class EditPileupFrameActionListener implements ActionListener {

        private File pileup = null;

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if (source.equals(startEditButton)) {

                int nameColumn = (Integer) sampleNamePositionComboBox.getSelectedItem();
                int nucleotideColumn = (Integer) nucleotidePositionComboBox.getSelectedItem();;
                int countColumn = (Integer) countPositionComboBox.getSelectedItem();
                int hitsColumn = (Integer) hitsPositionComboBox.getSelectedItem();
                

                if (this.pileup == null) {
                       JOptionPane.showMessageDialog(null, "A file must be selected before continuing");
                } else {
                    EditPileup editor = new EditPileup(this.pileup, nameColumn, nucleotideColumn, countColumn, hitsColumn);
                    try {
                        editor.edit();
                    } catch (IOException ex) {
                        Logger.getLogger(EditPileupFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            if (source.equals(importPileupFileButton)) {
                this.pileup = makeFileImportBox();

            }

        }

    }

}
