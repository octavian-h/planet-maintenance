package ro.hasna.tutorials;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PlanetMaintenanceTest {

    @Test
    void morningRoutine_withSuccess() {
        List<String> actions = PlanetMaintenance.morningRoutine();

        assertThat(actions).containsExactly(
                "Sweeping volcano 1 (active)",
                "Sweeping volcano 2 (active)",
                "Sweeping volcano 3 (extinct)",
                "Pulling up a baobab sprout!",
                "Watering the rose",
                "Putting the glass globe over the rose");
    }
}