class Student {
	String index;
	String firstName;
	String lastName;
	int[] labPoints = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	//TODO constructor
	public Student() {

	}

	//TODO seters & getters
	 // Getter
	public String getIndex() {
		return index;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	// Setter
	public void setIndex(String newIndex) {
		this.index = newIndex;
	}
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}



	public double getAverage() {
		//TODO
		int sum=0;
		int n = labPoints.length;
		for(int i = 0; i<n-1;i++) {
			sum += labPoints[i]
		}
		return sum/labPoints.length;
	}

	public boolean hasSignature() {
		//TODO
		if(labPoints.length>=8) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
