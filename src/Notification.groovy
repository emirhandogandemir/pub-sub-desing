public class Notification {
    public static void init(script) {
       Event.subscribe("configuration-validation",false) { message ->
            script.log.warning("configuration-validation error occured"+message)
        }
    }
}


