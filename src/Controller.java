public class Controller {

    private GetUserData user = new GetUserData();
    private CheckData checker = new CheckData();

    public void newUser(){
        user.takeUserData();
        String userData = user.getData();
        checker.checkMyData(userData);
    }


}
