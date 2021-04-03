package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Resarvation;
import model.exception.ReservationException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Room number :");
			int number = sc.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy): ");
			Date checkin = sdf.parse(sc.next());

			System.out.println("Check-out date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(sc.next());

			Resarvation reservation = new Resarvation(number, checkin, checkout);
			System.out.println("Resarvation : " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.println("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());

			System.out.println("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());

			reservation.updateDate(checkin, checkout);
			System.out.println("Resarvation : " + reservation);
			
			
		} catch (ReservationException e) {
			System.out.println(e.getMessage());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(RuntimeException  e) {
			System.out.println("Unexpected error");
		}

	}

}
