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

    // function compares the capacity and the demand
    fun comparison(requirement: Int): Boolean {
        if (capacity <= requirement) {
            return true
        }
        return false
    }

    // function asks whether the capacity is exhausted and whether or not a delay occurs
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
