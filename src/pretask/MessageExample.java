package pretask;

public class MessageExample {

    private void getMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        String message = "Show me your message";
        new MessageExample().getMessage(message);
    }
}
