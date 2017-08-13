package traffic_simulation

class Car(var carname: String, var driving: Boolean) {
    // the information, if a car is getting delayed or not should be decided by the network (look in the tasks) and
    // not be by default, right?
    var gettingDelayed: Boolean = false
}

