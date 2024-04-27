import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// Get current date and time
LocalDateTime currentDateTime = LocalDateTime.now()

// Define a format for date and time
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

// Format the date and time using the defined formatter
String formattedDateTime = currentDateTime.format(formatter)

// Print the formatted date and time
println "Current date and time: " + formattedDateTime
