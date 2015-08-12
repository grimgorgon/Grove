/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.grover;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seaadmin
 */
public class PileupGeneMapperFrame extends javax.swing.JFrame {

    /**
     * Creates new form SeqGrabberFrame
     */
    public PileupGeneMapperFrame() {
        initComponents();
        addToButtonGroups();
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

        genbankFileButtonGroup = new javax.swing.ButtonGroup();
        codonSelectionButtonGroup = new javax.swing.ButtonGroup();
        pileupGeneMapperTitleLabel = new javax.swing.JLabel();
        uploadGenbankFileRadioButton = new javax.swing.JRadioButton();
        fetchGenbankFileRadioButton = new javax.swing.JRadioButton();
        genbankFileTitleLabel = new javax.swing.JLabel();
        selectGenbankFileButton = new javax.swing.JButton();
        enterAccessionNumberField = new javax.swing.JTextField();
        genbankFileNameLabel = new javax.swing.JLabel();
        allStartCodonsRadioButton = new javax.swing.JRadioButton();
        emailLabel = new javax.swing.JLabel();
        enterEmailTextField = new javax.swing.JTextField();
        parametersTitleLabel = new javax.swing.JLabel();
        allStopCodonsRadioButton = new javax.swing.JRadioButton();
        downstreamNtNumLabel = new javax.swing.JLabel();
        upstreamNtNumLabel = new javax.swing.JLabel();
        numNucleotidesTitleLabel = new javax.swing.JLabel();
        downstreamNtsNumField = new javax.swing.JTextField();
        upstreamNtsNumField = new javax.swing.JTextField();
        quantifyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pileupGeneMapperTitleLabel.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        pileupGeneMapperTitleLabel.setText("Pileup Gene Mapper");

        uploadGenbankFileRadioButton.setText("Upload");

        fetchGenbankFileRadioButton.setText("Fetch From Genbank");

        genbankFileTitleLabel.setText("Annotated Genbank File");

        selectGenbankFileButton.setText("Select Genbank File");

        enterAccessionNumberField.setText("Accession Number");

        genbankFileNameLabel.setText("Genbank File Name");

        allStartCodonsRadioButton.setText("All Start Codons");

        emailLabel.setText("Email:");

        enterEmailTextField.setText("Enter Email");

        parametersTitleLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        parametersTitleLabel.setText("Parameters");

        allStopCodonsRadioButton.setText("All Stop Codons");

        downstreamNtNumLabel.setText("Downstream");

        upstreamNtNumLabel.setText("Upstream");

        numNucleotidesTitleLabel.setText("Number of Nucleotides");

        downstreamNtsNumField.setText("# nts");

        upstreamNtsNumField.setText("# nts");

        quantifyButton.setText("Quantify");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(allStopCodonsRadioButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(allStartCodonsRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(upstreamNtNumLabel)
                            .addComponent(downstreamNtNumLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(downstreamNtsNumField, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(upstreamNtsNumField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(numNucleotidesTitleLabel)))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genbankFileTitleLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uploadGenbankFileRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectGenbankFileButton)
                                .addGap(18, 18, 18)
                                .addComponent(genbankFileNameLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fetchGenbankFileRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterAccessionNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantifyButton)
                            .addComponent(parametersTitleLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(pileupGeneMapperTitleLabel)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pileupGeneMapperTitleLabel)
                .addGap(11, 11, 11)
                .addComponent(genbankFileTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uploadGenbankFileRadioButton)
                    .addComponent(selectGenbankFileButton)
                    .addComponent(genbankFileNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fetchGenbankFileRadioButton)
                    .addComponent(enterAccessionNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(enterEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parametersTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numNucleotidesTitleLabel)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(downstreamNtNumLabel)
                    .addComponent(downstreamNtsNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allStartCodonsRadioButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(allStopCodonsRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(upstreamNtsNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upstreamNtNumLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(quantifyButton)
                .addGap(33, 33, 33))
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
            java.util.logging.Logger.getLogger(PileupGeneMapperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PileupGeneMapperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PileupGeneMapperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PileupGeneMapperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PileupGeneMapperFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton allStartCodonsRadioButton;
    private javax.swing.JRadioButton allStopCodonsRadioButton;
    private javax.swing.ButtonGroup codonSelectionButtonGroup;
    private javax.swing.JLabel downstreamNtNumLabel;
    private javax.swing.JTextField downstreamNtsNumField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField enterAccessionNumberField;
    private javax.swing.JTextField enterEmailTextField;
    private javax.swing.JRadioButton fetchGenbankFileRadioButton;
    private javax.swing.ButtonGroup genbankFileButtonGroup;
    private javax.swing.JLabel genbankFileNameLabel;
    private javax.swing.JLabel genbankFileTitleLabel;
    private javax.swing.JLabel numNucleotidesTitleLabel;
    private javax.swing.JLabel parametersTitleLabel;
    private javax.swing.JLabel pileupGeneMapperTitleLabel;
    private javax.swing.JButton quantifyButton;
    private javax.swing.JButton selectGenbankFileButton;
    private javax.swing.JRadioButton uploadGenbankFileRadioButton;
    private javax.swing.JLabel upstreamNtNumLabel;
    private javax.swing.JTextField upstreamNtsNumField;
    // End of variables declaration//GEN-END:variables

    private void addToButtonGroups() {
        addToGenbankFileButtonGroup();
        addToCodonButtonGroup();
    }

    private void addToGenbankFileButtonGroup() {
        genbankFileButtonGroup.add(fetchGenbankFileRadioButton);
        genbankFileButtonGroup.add(uploadGenbankFileRadioButton);
    }

    private void addToCodonButtonGroup() {
        codonSelectionButtonGroup.add(allStartCodonsRadioButton);
        codonSelectionButtonGroup.add(allStopCodonsRadioButton);
    }

    private void addActionListeners() {
        PileupGeneMapperFrameActionListener listener = new PileupGeneMapperFrameActionListener();
        quantifyButton.addActionListener(listener);
        selectGenbankFileButton.addActionListener(listener);
    }
    
    

    public class PileupGeneMapperFrameActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if (source.equals(quantifyButton)) {
                
                try {
                    new PileupGeneMapper().executeScript();
                } catch (Exception ex) {
                    Logger.getLogger(PileupGeneMapperFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Quantify");
                //get all info
                System.out.println("Get all parameters");
                //run python script
                System.out.println("Run Python Script");
            }

            if (source.equals(selectGenbankFileButton)) {
                System.out.println("Select Genbank File");
                System.out.println("Open JFileChooser");
                System.out.println("Get Selected File and store");
                System.out.println("Add name to label");
            }

        }

    }

}