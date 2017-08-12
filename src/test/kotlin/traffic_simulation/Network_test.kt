package traffic_simulation

import org.junit.Test
import org.junit.Assert.assertEquals
import traffic_simulation.Car
import traffic_simulation.Network

class Network_test {

    @Test

    fun requiredCapacityTest(cars : List<Car>) {

        //setup
        var requiredcapacity: Int = 0

        //execute
        for (car in cars) {
            if (car.driving)
                requiredcapacity = requiredcapacity + 1
        }
       
        //assert
        assertEquals(1, requiredcapacity)
    }
}
/**
 * Created by Florian Kirch on 12.08.2017.
 */
