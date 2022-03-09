package ExceptionHandling.Latihan3;

class AgeInvalid extends Exception{
    AgeInvalid(String s){
        super(s);
    }
}

public class TestThrow {
    static void validate(int age) throws AgeInvalid {
        if (age < 18)
            throw new AgeInvalid("not valid ");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {
        try {
            validate(13);
        } catch (Exception i) {
            System.out.println("Terkana Exception: " + i);
        }
        System.out.println("rest of the code...");
    }
}
