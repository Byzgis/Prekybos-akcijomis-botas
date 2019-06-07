package prekybos.botas.main;

import prekybos.botas.main.output.UserInteraction;

public class Sprendimas {


    private UserInteraction userIO;

    public Sprendimas(UserInteraction userIO) {
        this.userIO = userIO;
    }

    public void sprendimas(double vidurkis, double kreive) {
        if (vidurkis >= kreive) {
            userIO.msg("Laikas parduoti");
        } else if (vidurkis >= kreive) {       //  if (nuokrypis <= 0.04) {
            userIO.msg("Dar palauk");
        }

        if (vidurkis <= kreive) {
            userIO.msg("Laikas pirkti");
        }

        userIO.msg("" + vidurkis);
    }

}
