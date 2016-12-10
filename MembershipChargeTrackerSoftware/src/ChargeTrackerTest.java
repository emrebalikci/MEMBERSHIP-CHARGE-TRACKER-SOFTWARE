import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * This is a driver class for ChargeTracker type.
 * 
 * Author : EMRE BALIKCI
 * Date : May 23,2016
 */

public class ChargeTrackerTest {

	//variables
	//to read from keyboard or a file we need an Scanner object
	static Scanner input;
	static Member[] members = new Member[15];
	static ChargeTracker tracker;

	public static void main(String[] args) {

		// variable declarations
		input = new Scanner(System.in);
		int choice = 0;
		final int exit = -1;

		//call init() method
		init();


		do{			
			try{
				//print out menu
				showMenu();
				//take user choice
				choice = input.nextInt();
				//deal with the choice
				evaluateChoice(choice);
			}// catch possible user mismatch
			catch(InputMismatchException e){ 

				System.err.println("Exception "+ e);

				input.nextLine();

				System.out.println("Invalid entrance");
			}
			//exit condition
		}while(choice!= exit);

		System.out.println("Program is terminated!");

	}

	// show user menu 
	private static void showMenu() {

		System.out.println("\n*********************************************\n CLUB MEMBERSHIP CHARGE TRACKER\n*********************************************");
		System.out.println("1- Enter Monthly Charge Information ");
		System.out.println("2- List Montly Payment");
		System.out.println("-1 Exit ");
		System.out.println("\nPlease enter your choice [1,2, -1] :");


	}

	//evaluate user choice
	private static void evaluateChoice(int choice) {
		int numOfMonth = 0;
		
		switch(choice){
		
		case 1: // enter weekly lab attendance
			
			try{
				System.out.println("Please enter the number of month :");
				numOfMonth = input.nextInt();
				tracker.enterChargeInfoViaConsole(numOfMonth, members);
								
				}catch(InputMismatchException e){ //catch if an input mismatch exception is occured.
					System.err.println("Exception "+ e.getMessage());

					input.nextLine();

					System.out.println("Invalid entrance");

				}catch (ArrayIndexOutOfBoundsException e ){
					System.err.println("Exception "+ e.getMessage());

				}catch(IllegalOperatorException e){
					System.err.println("Operators can be either + or -");
					
				}
			
			break;

		case 2: //list whole attendance info
			try{
				System.out.println("Please enter the number of month to see the payment");
				numOfMonth = input.nextInt();
				tracker.listMonthlyPaymentToConsole(numOfMonth, members);

			}catch(InputMismatchException e){ //catch if an input mismatch exception is occured.
				System.err.println("Exception "+ e.getMessage());

				input.nextLine();

				System.out.println("Invalid entrance");

			}catch(ArrayIndexOutOfBoundsException e){ //catch if an input mismatch exception is occured.
				System.err.println("Exception "+ e.getMessage());
				System.out.println("You can enter only between 1 and 12");
			}
			break;




		case -1:// exit 
			System.out.println("Exiting ...");
			break;

		default: System.out.println("You are allowed to enter only 1,2,3 or -1 ");
		break;
		}
	}

	public static void init(){
		// create fifteen Member Objects 
		Member st1 = new Member("Ahmet", "Arslan");
		Member st2 = new Member("Yasemin", "Karanacak");
		Member st3 = new Member("Davud", "Ýnce");
		Member st4 = new Member("Osman", "Gümüþ");
		Member st5 = new Member("Ayþe", "Hacýoðlu");
		Member st6 = new Member("Berke", "Tanoðlu");
		Member st7 = new Member("Onur", "Doðan");
		Member st8 = new Member("Hakan", "Atýcý");
		Member st9 = new Member("Merve", "Yýlmaz");
		Member st10 = new Member("Mehmet", "Sarý");
		Member st11 = new Member("Ahmet", "Yalçýn");
		Member st12 = new Member("Yunus", "Gül");
		Member st13 = new Member("Derya", "Ýnce");
		Member st14 = new Member("Merve", "Bulut");
		Member st15 = new Member("Aslý", "Kara");

		// fill array with these members
		members[0] = st1;
		members[1] = st2;
		members[2] = st3;
		members[3] = st4;
		members[4] = st5;
		members[5] = st6;
		members[6] = st7;
		members[7] = st8;
		members[8] = st9;
		members[9] = st10;
		members[10] = st11;
		members[11] = st12;
		members[12] = st13;
		members[13] = st14;
		members[14] = st15;

		tracker = new ChargeTracker("2015");
	}
}

