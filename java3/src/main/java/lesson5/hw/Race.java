package lesson5.hw;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {

    private static volatile Car winner;
    private final ArrayList<Stage> stages;

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }

    public ArrayList<Stage> getStages() {
        return stages;
    }
}
