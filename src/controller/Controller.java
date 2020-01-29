package controller;

import model.service.CarService;

import javax.swing.*;

public class Controller {
    private static Controller ourInstance = new Controller();

    public static Controller getInstance() {
        return ourInstance;
    }

    private Controller() {}

    public void delete(int number){
        try {
            CarService.getInstance().sell(number);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }
}
