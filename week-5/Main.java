public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        
        student1.setStudentID("CU12345");
        student1.setName("Ali");
        student1.setCGPA(3.75);
        student1.setProgramme("BIT");
        
        System.out.println("Student ID : " + student1.getStudentID());
        System.out.println("Name       : " + student1.getName());
        System.out.println("CGPA       : " + student1.getCGPA());
        System.out.println("Programme  : " + student1.getProgramme());
    }
}