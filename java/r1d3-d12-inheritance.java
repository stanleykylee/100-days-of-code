class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] scores){
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public String calculate(){
        int average = Arrays.stream(this.testScores).sum()/this.testScores.length;
        String grade;
        if (average >= 90) {
            grade = "O";
        } else if (average >= 80) {
            grade = "E";
        } else if (average >= 70) {
            grade = "A";
        } else if (average >= 55) {
            grade = "P";
        } else if (average >= 40) {
            grade = "D";
        } else {
            grade = "T";
        }     
        return grade;
    }
}