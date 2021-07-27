package Assignment8;

public class Application {
    public void checkApplicantEligibitity(int age,boolean goodEyesight)throws InvalidAgeException, AgeNotEligibleException,EyeSightException {
        if(age<0){
            throw new InvalidAgeException(age);
        }
        if(age<21||age>35){
            throw new AgeNotEligibleException(age);
        }
        if(!goodEyesight){
            throw new EyeSightException(goodEyesight);
        }
    }
}
