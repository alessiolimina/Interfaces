package it.develhope.interfaces;

public class Assistant extends CollegePerson implements ITeachingPerson, ILearningPerson {
    @Override
    public void teachToOtherPeople(){
        System.out.println("The assistant " + name + " " + surname + ", college Id " + collegeId + ", is teaching. Will he be a Phd? " + isGoingToBeAPhd);
    }
    @Override
    public void studyAtHome(){
        System.out.println("The assistant " + name + " " + surname + ", college Id " + collegeId + ", is studying. Will he be a Phd? " + isGoingToBeAPhd);

    }
    public boolean isGoingToBeAPhd;

public Assistant(String name, String surname, int id, boolean willBeAPhd){
this.name= name;
this.surname = surname;
this.collegeId =id;
this.isGoingToBeAPhd = willBeAPhd;
}

}
