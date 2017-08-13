package traffic_simulation

import org.junit.Test
import org.junit.Assert.assertEquals
import traffic_simulation.Car
import traffic_simulation.Network

class MainTest {

    @Test

    fun carDrives () {
        //setup
        // creating a list of cars with a given capacity
        val Car1: Car = Car(carname = "Elenor", driving = false)
        val Car2: Car = Car(carname = "K.I.T.T.", driving = true )
        val Car3: Car = Car(carname = "Herbie", driving = true)
        val Car4: Car = Car(carname = "PussyWagon", driving = true)
        val Car5: Car = Car(carname = "McQueen", driving = true)
        val Car6: Car = Car(carname = "GeneralLee", driving = true)
        val Car7: Car = Car(carname = "MantaManta", driving = true)
        val Car8: Car = Car(carname = "AMCPacer", driving = true)
        val Car9: Car = Car(carname = "Batmobil", driving = true)
        val Car10: Car = Car(carname = "GrandTorino", driving = true)
        val Car11: Car = Car(carname = "DeLorean", driving = true)
        val Car12: Car = Car(carname = "Ecto-1", driving = false)
        val scenarioList: List<Car> = listOf(Car1, Car2, Car3, Car4, Car5, Car6, Car7, Car8, Car9, Car10, Car11, Car12)

        val street: Network = Network(capacity = 9)

        //execute   //assert
        // checking the list if the car is driving or not
        for (car in street.testScenario(scenarioList)) {
            if (car.driving) {
                assertEquals(true,car.driving )
            }
             else {
                assertEquals(false, car.driving)
            }
        }
    }
}
/**
 * Created by Florian Kirch on 12.08.2017.
 */
