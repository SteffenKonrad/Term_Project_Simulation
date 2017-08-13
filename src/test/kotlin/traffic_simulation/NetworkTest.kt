package traffic_simulation

import org.junit.Test
import org.junit.Assert.assertEquals
import traffic_simulation.Car
import traffic_simulation.Network

class NetworkTest {

    @Test

    fun requiredCapacityTest() {

        //setup
        var requiredcapacity: Int = 0
        val Car1: Car = Car(carname = "Elenor", driving = true)
        //execute

            if (Car1.driving)
                requiredcapacity = requiredcapacity + 1
          //assert
        assertEquals(1, requiredcapacity)
    }
}
/**
 * Created by Florian Kirch on 12.08.2017.
 */
