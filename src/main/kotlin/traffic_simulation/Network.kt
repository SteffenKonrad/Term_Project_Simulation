package traffic_simulation

class Network(var capacity: Int) {

    // function to tally the cars on the road
    fun neededCapacity(cars: List<Car>): Int {
        var requiredcapacity: Int = 0

        for (car in cars) {
            if (car.driving)
                requiredcapacity = requiredcapacity + 1
        }
        return requiredcapacity
    }


    fun comparison(requirement: Int): Boolean {     // what is requirement and where is this set?
        if (capacity <= requirement) {
            return true
        }
        return false
    }

    fun testScenario(carList: List<Car>): List<Car> {
        val requirement: Int = neededCapacity(carList)
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
