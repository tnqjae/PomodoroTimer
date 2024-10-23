
import javax.swing.*;
class MainFrame extends JFrame{
    public MainFrame() {
        super("Pomodoro");
    }

}

public class Main {
    public static void main(String[] args) {
        JFrame frame = new MainFrame();
        frame.setSize(1000,800);//기본 프레임 설정
        frame.setVisible(true);
    }
}