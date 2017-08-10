package traffic_simulation2

 data class network (val capacity: Int) {

    fun CalculateCarsThatWantToDrive(cars:List<cars>):Int {


        val requiredcapacity: Int = 0

        for (cars in cars) {
            if(cars.candrive)
            requiredcapacity = requiredcapacity + 1
        }

    }
}


