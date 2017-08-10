package traffic_simulation


import com.univocity.parsers.common.record.Record
import com.univocity.parsers.csv.CsvParser
import com.univocity.parsers.csv.CsvParserSettings
import com.univocity.parsers.csv.CsvWriter
import com.univocity.parsers.csv.CsvWriterSettings


fun main(args: Array<String>) {



}

fun readCsvFile (fileName: String) : Car{

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
    val drivingStatus = secondValue.toBoolean()

    listOfCars.add(Car(carName = firstValue, driving = drivingStatus))
}
return Car // error here....
}

// function to parse the kotlin files as csv

fun outputToCsv (fileName: String){
    val settings = CsvWriterSettings()
    settings.format.setLineSeparator("\n")

    val writer = AccessCSV().getWriter(fileName)
    val csvWriter = CsvWriter(writer, settings)
    csvWriter.writeHeaders("Car Name", "Is Driving")
}


// scenario function to test if everything works

fun  scenario() {

}



