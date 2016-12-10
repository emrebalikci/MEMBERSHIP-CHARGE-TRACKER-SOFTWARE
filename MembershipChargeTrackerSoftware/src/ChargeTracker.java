import java.util.Scanner;

/*
 * This is a simple ChargeTracker type.
 * 
 * Author : EMRE BALIKCI
 * Date : May 23,2016
 */
public class ChargeTracker {

	/*instance variables*/
	String year;

	/*constructor*/
	public ChargeTracker(String year) {
		this.year = year;
	}

	/*setters and getters*/
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	/*get charge information via console*/
	public void enterChargeInfoViaConsole(int numOfMonth, Member[] members) throws ArrayIndexOutOfBoundsException, IllegalOperatorException{

		if(numOfMonth>=0 && numOfMonth<12){
			int i = 0;

			Scanner input = new Scanner(System.in);

			do{
				System.out.println("Enter charge status for "+members[i].getName()+" "+members[i].getSurname());
				String chargeOperator = input.next();

				if(chargeOperator.equals("+")|| chargeOperator.equals("-")){
					members[i].getCharges()[numOfMonth-1] = chargeOperator;
				}
				else{
					throw new IllegalOperatorException("Operator can be either + or -");
				}

				i++;

			}while(i<members.length);
		
		}else{
			System.out.println("There is no such a month index");
		}
	}

	// print out payment information 
		public void listMonthlyPaymentToConsole(int numOfMonth, Member[] members) throws ArrayIndexOutOfBoundsException{
				System.out.println("Member Name   \tPayment Status\n************************************************************");
				
				for(int i=0;i<members.length;i++){
					
					if((members[i].getCharges()[numOfMonth-1]!=null)){
						System.out.println(members[i].getName()+" \t"+ members[i].getSurname()+"\t"
								+members[i].getCharges()[numOfMonth-1]+" ");
					}
					else{
						System.out.println(members[i].getName()+" \t"+ members[i].getSurname()+"\t"
								+" Not Paid Yet");
					}
				}
		
		}
}
