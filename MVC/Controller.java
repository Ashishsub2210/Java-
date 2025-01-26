public class Controller {
    private student student;
    private View view;

    public Controller() {
        student = new student();  
        view = new View(this);    
    }

    public void displayName(String name) {
        student.setName(name);     
        view.setStudentName(student.getName());  
}
