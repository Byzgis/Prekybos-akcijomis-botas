package prekybos.botas.main.output;

public class UserInteractionFactory {
    public static UserInteraction createInstance(boolean b) {

        if (b) {
            return new WinOut();

        }

        return new ConsoleOut();
    }
}
