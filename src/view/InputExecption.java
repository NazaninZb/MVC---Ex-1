package view;

import javax.swing.*;

public class InputExecption extends Exception {
    public InputExecption(String msg){
        JOptionPane.showMessageDialog(null, msg, "WARNING", 0);
    }
}
