package prekybos.botas.main.output;

import javax.swing.*;

public class WinOut implements UserInteraction {
    @Override
    public void msg(String txt) {

        JOptionPane.showMessageDialog(null, txt);

    }

    @Override
    public String userInput(String msg) {
        return JOptionPane.showInputDialog (null,msg);
    }
}
