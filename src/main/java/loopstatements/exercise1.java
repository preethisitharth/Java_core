package loopstatements;
import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeats = 20;
        boolean[] seats = new boolean[totalSeats];
        System.out.println("Welcome to the Theatre Ticket Booking System!");
        System.out.println("1. Book a ticket");
        System.out.println("2. View available seats");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
             while (true) {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("Enter the number of tickets you want to book: ");
                    int tickets = scanner.nextInt();

                    if (tickets <= 0 || tickets > totalSeats) {
                        System.out.println("Invalid number of tickets.");
                        continue;
                    }

                    int booked = 0;
                    for (int i = 0; i < totalSeats; i++) {
                        if (!seats[i])
                        {
                            seats[i] = true;
                            booked++;
                            if (booked == tickets)
                            {
                                break;
                            }
                        }
                    }

                    if (booked == tickets) {
                        System.out.println("Successfully booked " + tickets + " ticket(s).");
                    } else {
                        System.out.println("Not enough available seats to book " + tickets + " ticket(s).");
                    }

                } else if (choice == 2) {
                    System.out.println("Available seats: ");
                    for (int i = 0; i < totalSeats; i++) {
                        if (!seats[i]) {
                            System.out.print("Seat " + (i + 1) + " ");
                        }
                    }
                    System.out.println();
                } else if (choice == 3) {
                    System.out.println("Exiting the system. Thank you!");
                    break;

                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }

        }
    }

