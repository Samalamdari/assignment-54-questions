package week4_54question;

public class ConvertingMinutesToHoursAndMinutes {
    public static void main(String[] args) {

// Question 27: Converting Minutes to Hours and Minutes
//
// Create an int variable named totalMinutes and assign it the value 135.
// Calculate the number of hours and the remaining minutes.
// Print the result in the format X hours and Y minutes.


        int totalMinutes = 135;
        int hours = totalMinutes / 60; // each hours is 60 minutes.
        int minutes = totalMinutes % 60; // This calculates the remaining minutes by taking the modulus of totalMinutes with 60.

        System.out.println(hours + " hours and " + minutes + " minutes");

    }
}
