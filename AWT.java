
import java.awt.*;

class Simple extends Frame{

    Simple(){
        Button btn = new Button("Click Me");
        Button btn2 = new Button("Hello");
        add(btn);
        add(btn2);
        setSize(400, 300);
        setVisible(true);
        setLayout(new FlowLayout());
    }

}

public class AWT {
    public static void main(String[] args) {
        new Simple();
    }
}
