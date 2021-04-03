package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Resarvation {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	public Resarvation() {
		
	}
	public Resarvation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public Date getCheckin() {
		return checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public long  duration() {
		long diff= checkout.getTime()-checkin.getTime();
		 
		diff/=1000;//converte p segundos
		diff/=60;//converte p minutos
		diff/=60;//converte p horas
		diff/=24;
		
		return diff;
	}
	
	public void updateDate(Date checkin,Date checkout) {
		this.checkin=checkin;
		this.checkout=checkout;
	}
	@Override
	public String toString() {
		
		return "Room " +roomNumber +", check-in: "+sdf.format(checkin)+", check-out : "+sdf.format(checkout)+", "+duration()+" nights";
 	}
	
	
  
	
	

}
