/*
 * This is a simple Occupant type.
 * 
 * Author : EMRE BALIKCI
 */
public class Member {

	//instance variables
		private String name;
		private String surname;
		private String[] charges;
		
		
		//constructor
		public Member(String name, String surname) {
			this.name = name;
			this.surname = surname;
			charges = new String[12];
		}

		/*getters and setters*/
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String[] getCharges() {
			return charges;
		}

		public void setCharges(String[] charges) {
			this.charges = charges;
		}

		/*toString*/
		@Override
		public String toString() {
			return "Member [name=" + name + ", surname=" + surname + "]";
		}
		
		
		
}
