/*
 * Created by JFormDesigner on Wed Nov 13 18:25:39 IRST 2019
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import org.jdesktop.layout.GroupLayout;

/**
 * @author unknown
 */
public class FirstWindow extends JFrame {
    public FirstWindow() {
        initComponents();
    }

    private void cancelMouseClicked(MouseEvent e) {
        System.exit(0);
    }

    private void okButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
        SellWindow sellWindow = new SellWindow();
        sellWindow.setVisible(false);
        if (sellbutt.isSelected()){
            this.setVisible(false);
            sellWindow.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please Select One Of The Statements", "WARNING", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nazanin
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        sellbutt = new JRadioButton();
        buybutt = new JRadioButton();
        formalityLbl = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancel = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
            new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion"
            , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 )
            , java. awt. Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){  public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("bor\u0064er" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- sellbutt ----
                sellbutt.setText("BUY");

                //---- buybutt ----
                buybutt.setText("SELL");

                //---- formalityLbl ----
                formalityLbl.setText("Formality");

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .add(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .add(contentPanelLayout.createParallelGroup()
                                .add(contentPanelLayout.createSequentialGroup()
                                    .add(sellbutt)
                                    .add(64, 64, 64)
                                    .add(formalityLbl, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
                                .add(buybutt))
                            .addContainerGap(160, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .add(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .add(contentPanelLayout.createParallelGroup(GroupLayout.LEADING, false)
                                .add(sellbutt)
                                .add(contentPanelLayout.createSequentialGroup()
                                    .add(formalityLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(5, 5, 5)))
                            .add(buybutt)
                            .addContainerGap(41, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                okButton.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        okButtonMouseClicked(e);
                    }
                });
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancel ----
                cancel.setText("Cancel");
                cancel.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        cancelMouseClicked(e);
                    }
                });
                buttonBar.add(cancel, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(sellbutt);
        buttonGroup1.add(buybutt);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - nazanin
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JRadioButton sellbutt;
    private JRadioButton buybutt;
    private JLabel formalityLbl;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
