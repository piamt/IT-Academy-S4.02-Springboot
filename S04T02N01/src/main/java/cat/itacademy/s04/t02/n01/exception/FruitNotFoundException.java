package cat.itacademy.s04.t02.n01.exception;

public class FruitNotFoundException extends Exception {
    public FruitNotFoundException(String message) {
        super(message);
    }
}