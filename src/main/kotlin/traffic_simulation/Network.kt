package traffic_simulation

import javax.swing.SizeRequirements

class Network(var capacity: Int) {

    // function to tally the cars on the road
    fun requiredcapacity(cars: List<Car>): Int {
        var requiredcapacity: Int = 0

        for (car in cars) {
            if (car.driving)
                requiredcapacity = requiredcapacity + 1
        }
        return requiredcapacity
    }

    /** function to compare number of driving cars to the capacity and let the network decides wether a car drives or
     * is delayed due to traffic jam
     * must be created
     */
    fun comparison(requirement: Int): Boolean {
        if (capacity <= requirement) {
            return true
        }
        return false
    }

    fun testScenario(carList: List<Car>): List<Car> {
        val requirement: Int = requiredcapacity(carList)
        val compare: Boolean = comparison(requirement)

        if (compare) {
            for (car in carList) {
                if (car.driving) {
                    val delayed = true
                    car.gettingDelayed = delayed
                }
            }
        }
        return carList

    }
}
