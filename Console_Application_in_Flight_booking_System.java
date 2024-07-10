//package Flight_booking_system;

import java.util.Scanner;

public class Console_Application_in_Flight_booking_System
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Flight flights[] = new Flight[5];
        Passenger passengers[] = new Passenger[20];

        int flight_count = 0;
        int passenger_count = 0;
        int choice = 100;
        while (choice != 0) {
            display();
            try {
                choice = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println( e);
                //continue;
            }

            switch (choice) {
                case 1:
                    flights[flight_count] = new Flight();
                    flights[flight_count].set();
                    flight_count++;
                    break;
                case 2:
                    passengers[passenger_count] = new Passenger();
                    passengers[passenger_count].set();
                    passenger_count++;
                    break;
                case 3:
                    System.out.println("FLIGHTS:");
                    for (int i = 0; i < flight_count; i++) {
                        flights[i].get();
                    }
                    break;
                case 4:
                    System.out.println("PASSENGERS:");
                    for (int i = 0; i < passenger_count; i++) {
                        passengers[i].get();
                    }
                    break;
                case 0:
                    System.out.println("Exiting...Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose the correct Choice.");
            }
        }
    }

    public static void display() {
        System.out.println();
        System.out.println("======= Flight Booking System =======");
        System.out.println(" 1. Add Flight");
        System.out.println(" 2. Add Passenger");
        System.out.println(" 3. View Flights");
        System.out.println(" 4. View Passengers");
        System.out.println(" 0. Exit");
        System.out.println("=====================================");
        System.out.print("Enter your choice: ");
    }
}

class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private int capacity;
    private int bookedSeats;

    public void set()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Flight Details:");
        System.out.print("Flight Number: ");
        flightNumber = s.nextLine();
        System.out.print("Origin: ");
        origin = s.nextLine();
        System.out.print("Destination: ");
        destination = s.nextLine();
        System.out.print("Capacity: ");
        capacity = s.nextInt();
        bookedSeats = 0;
    }

    public void get()
    {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Capacity: " + capacity);
        System.out.println("Booked Seats: " + bookedSeats);
        System.out.println();
    }
}

class Passenger
{
    private String passengerName;
    private int passportNumber;
    private int passengerAge;
    private String passengerGender;
    private String passengerAddress;

    public void set() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Passenger Details:");
        System.out.print("Name: ");
        passengerName = s.nextLine();
        System.out.print("PassportNumber: ");
        passportNumber = s.nextInt();
        System.out.print("Age: ");
        passengerAge = s.nextInt();
        s.nextLine();
        System.out.print("Gender: ");
        passengerGender = s.nextLine();
        System.out.print("Address: ");
        passengerAddress = s.nextLine();
    }

    public void get()
    {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Passport Number: " + passportNumber);
        System.out.println("Age: " + passengerAge);
        System.out.println("Gender: " + passengerGender);
        System.out.println("Address: " + passengerAddress);
        System.out.println();
    }
}


