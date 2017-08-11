package traffic_simulation


import com.univocity.parsers.common.record.Record
import com.univocity.parsers.csv.CsvParser
import com.univocity.parsers.csv.CsvParserSettings
import com.univocity.parsers.csv.CsvWriter
import com.univocity.parsers.csv.CsvWriterSettings


fun main(args: Array<String>) {

    scenario()
}

fun readCsvFile(fileName: String): MutableList<Car> {

// the input (cars and their interest to drive) is given as a CSV file
// this function is used to parse and read the CSV given data

    val settings = CsvParserSettings()
    // line seperator can be changed
    settings.format.setLineSeparator("\n")

    // creates a CSV parser
    val csvParser = CsvParser(settings)
    val reader = AccessCSV().getReader(fileName)

    // to enable that the headers of the csv file are also extracted we set true
    settings.isHeaderExtractionEnabled = true


// creating of a listOfCars of the class Cars
    val listOfCars: MutableList<Car> = mutableListOf()


// here we search the rows of the given csv list for all cars and assign the carName and driving variable

    val allRows: MutableList<Record> = csvParser.parseAllRecords(reader)
    for (car in allRows) {
        val firstValue: String = car.values.get(0)  //first value of csv assigned to the cars name
        val secondValue: String = car.values.get(1) // second value of the csv assigned to driving status
        val drivingStatus: Boolean = secondValue.toBoolean()

        listOfCars.add(Car(carname = firstValue, driving = drivingStatus))
    }
    return listOfCars
}

// function to parse the kotlin files as csv

fun outputToCsv(fileName: String) {
    val settings = CsvWriterSettings()
    settings.format.setLineSeparator("\n")

    val writer = AccessCSV().getWriter(fileName)
    val csvWriter = CsvWriter(writer, settings)
    csvWriter.writeHeaders("Car Name", "Is Driving")
}


// scenario function to test if everything works
// Manually created list containing a dozen cars. With a print output in the console to test

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

    val carList: List<Car> = listOf(Car1, Car2, Car3, Car4, Car5, Car6, Car7, Car8, Car9, Car10, Car11, Car12)

    val street: Network = Network(capacity =7)

    for (car in street.testScenario(carList)) {
        println("Car: \"${car.carname}\" Want to drive:\"${car.driving}\" and is delayed:\"${car.gettingDelayed}\"")

    }
}



