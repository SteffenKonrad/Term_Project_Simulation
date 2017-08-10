package traffic_simulation

class Network(var capacity: Int) {


    val listOfDrivingCars: MutableList<Car> = mutableListOf()

    // function to tally the cars on the road

    fun tallyCars(): Int {
        for (car in listOfDrivingCars) {
            if (car.driving == true) {
                listOfDrivingCars.add(car)
            }
        }

    }

    /** function to compare number of driving cars to the capacity and let the network decides wether a car drives or
     * is delayed due to traffic jam
     * must be created
     */
    fun comparison(): Boolean {

    }
}
