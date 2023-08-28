import controller.ControllerUser;
import service.CrudUserImpl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private final String versionProtocol = "HTTP/1.1";
    private static final String url = "http://localhost:8080/api/users";

    public static void main(String[] args) {
        CrudUserImpl crud = new CrudUserImpl();

        ControllerUser request = new ControllerUser("GET", url, "Content-Type: application/json", null, crud);


    }
}