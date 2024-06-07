package goit;

public class NoImageFound extends Exception {
    public NoImageFound() {
        super("For selected status code no image was found");
    }
}
