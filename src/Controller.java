import java.util.ArrayList;
import java.util.List;

public class Controller {

    private GetUserData user = new GetUserData();
    private CheckedData checker = new CheckedData();
    private WriteData writer = new WriteData();
    List<String> allData = new ArrayList<>();

    public void newUser(){
        user.takeUserData();
        String userData = user.getData();
        checker.checkMyData(userData);
        allData = checker.newUser();
    }

    public void writeData(){
        writer.setName(allData);
        writer.writeData(allData);
    }


}
