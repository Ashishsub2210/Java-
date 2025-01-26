import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="AreaOfCircle.java" width="300" height="200"></applet>*/ 
public class AreaOfCircle extends Applet {
    private TextField radiusField;
    private TextField areaField;

    public void init() {
        radiusField = new TextField(10);
        areaField = new TextField(10);

        add(new Label("Radius:"));
        add(radiusField);
        add(new Label("Area:"));
        add(areaField);

        Button calculateButton = new Button("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String radiusStr = radiusField.getText();
                double radius = 0;

                try {
                    radius = Double.parseDouble(radiusStr);
                } catch (NumberFormatException ex) {
                    areaField.setText("Invalid input");
                    return;
                }

                double area = Math.PI * radius * radius;
                areaField.setText(String.valueOf(area));
            }
        });
        add(calculateButton);
    }
}
