package ExceptionHandling.Evaluasi;

class Invalid extends Exception{ //turunan dari Exception
    Invalid(String n){
        super(n);
    }
}

public class testThrow {
    static void tinggi(int t) throws Invalid {
        if (t < 170) {
            throw new Invalid("Invalid"); //melempar ke class Invalid
        }
        else {
            System.out.println("Tinggi anda sudah lebih dari 170cm"); //lebih dari 170
        }
    }

    public static void main(String[] args) {
        try {
            tinggi(155); //input
        }catch (Exception i){
            System.out.println("Exception : " + i); //output error
        }
    }
}
