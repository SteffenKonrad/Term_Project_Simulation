package traffic_simulation

import com.univocity.parsers.common.record.Record
import com.univocity.parsers.csv.CsvParser
import com.univocity.parsers.csv.CsvParserSettings
import com.univocity.parsers.csv.CsvWriter
import com.univocity.parsers.csv.CsvWriterSettings

fun main(args: Array<String>) {

    scenario()

    buildCSV()
}

fun readCsvFile(fileName: String): MutableList<Car> {

// the input (cars and their interest to drive) is given as a CSV file
// this function is used to parse and read the CSV given data

    val settings = CsvParserSettings()
    val csvParser = CsvParser(settings)                       // creates a CSV parser
    val reader = AccessCSV().getReader(fileName)
    settings.isHeaderExtractionEnabled = true
    settings.format.setLineSeparator("\n")                    // line separator can be changed

// here we search the rows of the given csv list for all cars and assign the carName and driving variable

    val listOfCars: MutableList<Car> = mutableListOf()       // creating a listOfCars of the class Car
    val allRows: MutableList<Record> = csvParser.parseAllRecords(reader)

    for (car in allRows) {
        val firstValue: String = car.values.get(0)           //first value of csv assigned to the cars name
        val secondValue: String = car.values.get(1)          // second value of the csv assigned to driving status
        val drivingStatus: Boolean = secondValue.toBoolean()

        listOfCars.add(Car(carname = firstValue, driving = drivingStatus))
    }
    return listOfCars
}

@Suppress("NAME_SHADOWING")
        // function to parse the resulting kotlin files as csv
fun outputToCsv(results: List<Car>, fileName: String = "results.csv" ) {

    val settings = CsvWriterSettings()
    val writer = AccessCSV().getWriter(fileName)
    val csvWriter = CsvWriter(writer, CsvWriterSettings())
    csvWriter.writeHeaders("Car Name", "Driving Status")
    settings.format.setLineSeparator("\n")

    val carname = "Carname:"
    val delay = "is delayed?:"
    val carRows: MutableList<Array<Any>> = mutableListOf()
    val row: Array<Any> = arrayOf(carname, delay)
    carRows.add(row)

    for (result in results) {
        val delay = result.gettingDelayed.toString()
        val row: Array<Any> = arrayOf(carname, delay)
        carRows.add(row)
    }
    csvWriter.writeRowsAndClose(carRows)
}




    /** here needs to be added, what results (drives vs delay) we want to parse as csv
     * might be solved with a for-loop, adapted from energy model:
    val carRows: MutableList<Array<Any>> = mutableListOf()
    for (car in listOfCars ) {
    val name = car.name
    val checkDelay= car.driving
    val row: Array<Any> = arrayOf(name, checkDelay)
    carRows.add(row)
    }

    csvWriter.writeRowsAndClose(carRows)
     */
    fun buildCSV(){
        val street : Network = Network(capacity = 9)
        val carsCSV : List<Car> = readCsvFile(fileName = "readingdemand.csv")

        outputToCsv(street.testScenario(carsCSV))

    }


fun scenario() {

    val Car1: Car = Car(carname = "Elenor", driving = true)
    val Car2: Car = Car(carname = "K.I.T.T.", driving = false)
    val Car3: Car = Car(carname = "Herbie", driving = true)
    val Car4: Car = Car(carname = "PussyWagon", driving = false)
    val Car5: Car = Car(carname = "McQueen", driving = false)
    val Car6: Car = Car(carname = "GeneralLee", driving = true)
    val Car7: Car = Car(carname = "MantaManta", driving = true)
    val Car8: Car = Car(carname = "AMCPacer", driving = true)
    val Car9: Car = Car(carname = "Batmobil", driving = true)
    val Car10: Car = Car(carname = "GrandTorino", driving = true)
    val Car11: Car = Car(carname = "DeLorean", driving = true)
    val Car12: Car = Car(carname = "Ecto-1", driving = false)

    val scenarioList: List<Car> = listOf(Car1, Car2, Car3, Car4, Car5, Car6, Car7, Car8, Car9, Car10, Car11, Car12)

    val street: Network = Network(capacity = 9)

    for (car in street.testScenario(scenarioList)) {
        if (car.driving) {
            println("\"${car.carname}\" wants to drive and is delayed:\"${car.gettingDelayed}\"")

        } else {
            println("\"${car.carname}\" does not want to drive and is delayed: \"${car.gettingDelayed}\"")
        }
    }
}





