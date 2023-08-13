import java.util.ArrayList;
import java.util.List;

public class Controller {

    private GetUserData user = new GetUserData();
    private CheckedData checker = new CheckedData();
    List<String> allData = new ArrayList<>();

    public void newUser(){
        user.takeUserData();
        String userData = user.getData();
        checker.checkMyData(userData);
        allData = checker.newUser();

    }


}
