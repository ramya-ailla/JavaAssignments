package Assignment8;

public class EyeSightException extends Exception{
    boolean isGoodEyeSight;
    EyeSightException(boolean eyeSight){
        isGoodEyeSight = eyeSight;
    }
    public String toString(){
        return "Is Eye sight is good:"+isGoodEyeSight+"\n eyeSight should be good";
    }
}
