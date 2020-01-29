import model.entity.CarEntity;
import view.FirstWindow;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<CarEntity> warhouse = new ArrayList<>();
        FirstWindow lunch = new FirstWindow();
        lunch.setVisible(true);
        lunch.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
