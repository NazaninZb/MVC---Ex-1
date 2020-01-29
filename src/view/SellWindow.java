/*
 * Created by JFormDesigner on Wed Nov 13 18:30:06 IRST 2019
 */

package view;

import controller.Controller;
import model.entity.CarEntity;
import model.service.CarService;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author unknown
 */
public class SellWindow extends JFrame {
    List<CarEntity> carEntities = new ArrayList<>();
    public SellWindow() {
        initComponents();
    }

    private void cancelButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
        this.setVisible(false);
        FirstWindow lunch = new FirstWindow();
        lunch.setVisible(true);
    }

    private void checkButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
        int state;
        try {
            carEntities = CarService.getInstance().report();
        } catch (Exception ex) {
            System.out.println("fail to receive list: " + ex.getMessage());
        }
        state = search();
        if (state == -1){
            JOptionPane.showMessageDialog(null, "item not found", "result", JOptionPane.WARNING_MESSAGE);
        }
        else {
            priseLbl.setText(String.valueOf(carEntities.get(state).getPrise() + "M"));
        }
    }

    private int search(){
        String model, color;
        int build;
        model = (String) modelsBox.getSelectedItem();
        color = (String) colorBox.getSelectedItem();
        build = (int) buildSpinner.getValue();
        for (int i = 0; i < carEntities.size(); i++){
            if (carEntities.get(i).getModel().equalsIgnoreCase(model) && carEntities.get(i).getColor().equalsIgnoreCase(color) && carEntities.get(i).getBuild() == build){
                return carEntities.indexOf(carEntities.get(i));
            }
        }
        return -1;
    }

    private void okButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
        int state = 0;
        try {
            inputCheck();
        } catch (InputExecption inputExecption) {
            state++;
            JOptionPane.showMessageDialog(null ,"fail to buy\n" + inputExecption.getMessage(), "WARNING", 0);
        }
        if (state == 0){
            Controller.getInstance().delete(carEntities.get(search()).getNumber());
            label5.setText("purchase successful☺");
        }
    }

    private void inputCheck() throws InputExecption {
        if (nametxtf.getText().isEmpty() || lastNmaetxtf.getText().isEmpty())
            throw new InputExecption("name and last name con NOT be empty");
        for (int i = 0; i < 9 ; i++){
            if (nametxtf.getText().contains(String.valueOf(i))  ||  lastNmaetxtf.getText().contains(String.valueOf(i)))
                throw new InputExecption("name or last name can NOT contains number");
        }
        if (nametxtf.getText().contains(" ") || lastNmaetxtf.getText().contains(" "))
            throw new InputExecption("name or last name can NOT contains space");
        if (search() == -1)
            throw new InputExecption("item NOT found");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - nazanin
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        namelbl = new JLabel();
        nametxtf = new JTextField();
        lastNamelbl = new JLabel();
        lastNmaetxtf = new JTextField();
        label1 = new JLabel();
        modelsBox = new JComboBox();
        label2 = new JLabel();
        buildSpinner = new JSpinner();
        label3 = new JLabel();
        colorBox = new JComboBox();
        label4 = new JLabel();
        priseLbl = new JLabel();
        label5 = new JLabel();
        buttonBar = new JPanel();
        checkButton = new JButton();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border
            .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax
            . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,
            12 ) ,java . awt. Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans
            .PropertyChangeListener ( ){  public void propertyChange (java . beans. PropertyChangeEvent e) { if( "b\u006frde\u0072" .equals ( e.
            getPropertyName () ) )throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //---- namelbl ----
                namelbl.setText("name :");

                //---- lastNamelbl ----
                lastNamelbl.setText("last name :");

                //---- label1 ----
                label1.setText("model :");

                //---- modelsBox ----
                modelsBox.setModel(new DefaultComboBoxModel(new String[] {
                    "pride",
                    "pride_vanet",
                    "l90",
                    "belerriance"
                }));

                //---- label2 ----
                label2.setText("build :");

                //---- buildSpinner ----
                buildSpinner.setModel(new SpinnerNumberModel(80, 80, 98, 1));

                //---- label3 ----
                label3.setText("color :");

                //---- colorBox ----
                colorBox.setModel(new DefaultComboBoxModel(new String[] {
                    "white",
                    "black",
                    "gray",
                    "silver",
                    "blue",
                    "red",
                    "green"
                }));

                //---- label4 ----
                label4.setText("prise :");

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .add(contentPanelLayout.createSequentialGroup()
                            .add(contentPanelLayout.createParallelGroup()
                                .add(contentPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .add(contentPanelLayout.createParallelGroup(GroupLayout.LEADING, false)
                                        .add(contentPanelLayout.createSequentialGroup()
                                            .add(label1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.RELATED)
                                            .add(modelsBox, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                        .add(contentPanelLayout.createSequentialGroup()
                                            .add(contentPanelLayout.createParallelGroup()
                                                .add(label3)
                                                .add(namelbl, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(LayoutStyle.RELATED)
                                            .add(contentPanelLayout.createParallelGroup()
                                                .add(nametxtf, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                                .add(colorBox, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                                    .add(18, 18, 18)
                                    .add(contentPanelLayout.createParallelGroup()
                                        .add(contentPanelLayout.createSequentialGroup()
                                            .add(label2)
                                            .addPreferredGap(LayoutStyle.UNRELATED)
                                            .add(buildSpinner))
                                        .add(contentPanelLayout.createSequentialGroup()
                                            .add(label4)
                                            .addPreferredGap(LayoutStyle.UNRELATED)
                                            .add(priseLbl, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))))
                                .add(contentPanelLayout.createSequentialGroup()
                                    .add(214, 214, 214)
                                    .add(lastNamelbl)
                                    .add(14, 14, 14)
                                    .add(lastNmaetxtf, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(contentPanelLayout.createSequentialGroup()
                            .add(78, 78, 78)
                            .add(label5, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(98, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .add(contentPanelLayout.createSequentialGroup()
                            .add(contentPanelLayout.createParallelGroup(GroupLayout.BASELINE)
                                .add(namelbl, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                .add(lastNamelbl)
                                .add(lastNmaetxtf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .add(nametxtf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .add(37, 37, 37)
                            .add(contentPanelLayout.createParallelGroup(GroupLayout.BASELINE)
                                .add(label1)
                                .add(label2)
                                .add(buildSpinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .add(modelsBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .add(32, 32, 32)
                            .add(contentPanelLayout.createParallelGroup(GroupLayout.BASELINE)
                                .add(label3)
                                .add(colorBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .add(label4)
                                .add(priseLbl, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.RELATED)
                            .add(label5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                            .add(0, 10, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- checkButton ----
                checkButton.setText("check");
                checkButton.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        checkButtonMouseClicked(e);
                    }
                });
                buttonBar.add(checkButton, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

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

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                cancelButton.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        cancelButtonMouseClicked(e);
                    }
                });
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - nazanin
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel namelbl;
    private JTextField nametxtf;
    private JLabel lastNamelbl;
    private JTextField lastNmaetxtf;
    private JLabel label1;
    private JComboBox modelsBox;
    private JLabel label2;
    private JSpinner buildSpinner;
    private JLabel label3;
    private JComboBox colorBox;
    private JLabel label4;
    private JLabel priseLbl;
    private JLabel label5;
    private JPanel buttonBar;
    private JButton checkButton;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
