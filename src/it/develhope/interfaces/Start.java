package it.develhope.interfaces;

public class Start {
    public static void main(String[] args) {
System.out.println("----Testing the College-----");
Student student = new Student("Alberto", "Pioppi", 545, 1);
Professor professor = new Professor("Davide","Terrino", 897, "Physics");
Assistant assistant = new Assistant("Paolo","Brulli", 233, true);
student.goToCollege();
professor.goToCollege();
assistant.goToCollege();
student.studyAtHome();
professor.teachToOtherPeople();
assistant.teachToOtherPeople();
assistant.studyAtHome();
    }
}

