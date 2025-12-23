package tr.edu.istiklal;

public class NullDenominatorException extends Exception {
    public NullDenominatorException() {
        super("hata");
    }
    public NullDenominatorException(String msg) {
        super(msg);
    }
}
