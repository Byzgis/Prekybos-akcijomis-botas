package prekybos.botas.main.output;

public class ConsoleOut implements UserInteraction {
    @Override
    public void msg(String txt) {
        System.out.println(txt);
    }

    @Override
    public String userInput(String msg) {
        System.out.println("...tarkim ivedziau: 0.04");
        return "0.04";
    }
}
