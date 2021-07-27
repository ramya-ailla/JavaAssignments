package Assignment6;

public class Constructor {
    private int x;
    public Constructor(){
        this(5);
    }
    public Constructor(int x){
        this.x = x;
        System.out.println(x);
    }
    public Constructor(String input){
        System.out.println(input);
    }

    public static void main(String[] args) {
        /*when references are created Initialization messages are not printed*/
        Constructor [] cArray = new Constructor[3];

        for(int i = 0;i<3;i++){
            cArray[i] = new Constructor("Object Created");
        }
    }
}
