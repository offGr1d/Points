public class Student{
   private int idNumber;
   private int creditHoursEarned;
   private double pointsEarned;
   private double gradePointAverage;
   
   //Student2 Constructor
   public Student(){
      idNumber = 9999;
      creditHoursEarned = 3;
      pointsEarned = 12;
      gradePointAverage = pointsEarned / creditHoursEarned;
   }
   //Student Constructor
   public Student(int id, int credits, double points){
      idNumber = id;
      creditHoursEarned = credits;
      pointsEarned = points;
      gradePointAverage = points / credits;
   }
  
   //getters and setters

   public int getIdNumber(){
      return idNumber;
   }
   public void setIdNumber(int idNumber){
      this.idNumber = idNumber;
   }
    //getters and setters

   public int getCreditHoursEarned(){
      return creditHoursEarned;
   }
   public void setCreditHoursEarned(int CreditHoursEarned){
      this.creditHoursEarned = CreditHoursEarned;
   }
    //getters and setters

   public double getPointsEarned(){
      return pointsEarned;
   }
   public void setPointsEarned(double PointsEarned){
      this.pointsEarned = PointsEarned;
   }
    //getters and setters

   public double getGradePointAverage(){
      return gradePointAverage;
   }
   public void setGradePointAverage(double GradePointAverage){
      this.gradePointAverage = GradePointAverage;
   }
   
   //display
   public void displayIdNumber(){
      System.out.println("ID number: " + idNumber);
   }
   public void displayCreditHoursEarned(){
      System.out.println("Credit hours earned: " + creditHoursEarned);
   }
   public void displayPointsEarned(){
      System.out.println("Points earned: " + pointsEarned);
   }
   public void displayGradePointAverage(){
      System.out.println("Grade point average: " + gradePointAverage);
   }
}