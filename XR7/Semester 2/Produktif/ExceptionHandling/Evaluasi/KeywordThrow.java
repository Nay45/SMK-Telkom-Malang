package ExceptionHandling.Evaluasi;

public class KeywordThrow {
    public static void tinggi(int t)
            throws NullPointerException, java.lang.ArithmeticException{
        if (t < 170){
            throw new NullPointerException ("Tinggi anda kurang dari 170cm"); //Output jika kurang dari 170
        }else {
            throw new java.lang.ArithmeticException("Anda ketinggian"); //Output jika lebih dari 170
        }
    }

    public static void main(String[] args) {
        try {
            tinggi(166);
        }catch (java.lang.ArithmeticException|NullPointerException e){
            System.out.println("Output : ");
            System.err.println(e.getMessage());
        }
    }
}
