public class ShowStudent{
   public static void main(String[] args){
      Student student1 = new Student(20152063, 3, 1.5);
      
      student1.displayIdNumber();
      student1.displayCreditHoursEarned();
      student1.displayPointsEarned();
      student1.displayGradePointAverage();
   }
}