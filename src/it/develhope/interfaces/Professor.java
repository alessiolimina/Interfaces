package it.develhope.interfaces;

public class Professor extends CollegePerson implements ITeachingPerson {

    @Override
    public void teachToOtherPeople(){
        System.out.println("Professor " + name + " " + surname + ", college Id " + collegeId + ", is teaching " + teachingSubject);
    }
public String teachingSubject;
public Professor(String name, String surname, int id, String subject){
    this.name = name;
    this.surname = surname;
    this.collegeId = id;
    this.teachingSubject = subject;

}
}


