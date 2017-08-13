package traffic_simulation

import java.io.*

// This class is used to create the "getReader" function that is used in the CSV parser settings

class AccessCSV {

    fun getReader(path: String): Reader {
        return InputStreamReader(this.javaClass.getResourceAsStream(path), "UTF-8")
    }

    fun getWriter(path: String): Writer {
        val file = File(path)
        return FileWriter(file)
    }
}
