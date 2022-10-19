public class Main {
    public static void main(String[] args) {

        print("selam")

        try {

        } catch (Exception exception) {
            Event.publish("selam", "configuration-validation", exception);
        }


    }
}
