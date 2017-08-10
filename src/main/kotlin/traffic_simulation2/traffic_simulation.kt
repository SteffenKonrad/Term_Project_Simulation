package traffic_simulation2



 class traffic_simulation () {

    object traffic_simulation : network <> , cars <>

    {
        fun driving() {
            if ( var capacity < 100)
            {
                val drives = false
            }

            else
            {
                var capacity = var capacity +1
                val drives = true
            }

            println("car drives= $drives and there are $capacity cars on track. ")
        }
    }
}

