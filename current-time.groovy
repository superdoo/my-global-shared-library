import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// Get the current date and time
def currentDateTime = LocalDateTime.now()

// Define the date-time format
def formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

// Format the current date and time using the defined format
def formattedDateTime = currentDateTime.format(formatter)

// Print the formatted date and time
println "Current Date and Time: $formattedDateTime"
