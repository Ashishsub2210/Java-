import java.awt.*;

public class MenuDemo extends Frame {

public MenuDemo() {
      	setLayout(new FlowLayout());
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        MenuItem openItem = new MenuItem("Open");
        fileMenu.add(openItem);
        setMenuBar(menuBar);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}
