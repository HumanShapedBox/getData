import java.util.StringTokenizer;

public class CheckData {

    private final int counter = 6;


    public void checkMyData(String data){
        if(checkString(data) == true){
            System.out.println(data);
        }else {
            System.out.println("Oops, something went wrong!");
        }

    }

    private boolean checkString(String data){
        if(data == null){return false;}
        boolean flag = true;
        String[] splitData = data.split(" ");
        int dataCounter = splitData.length;
        if(counter != dataCounter){flag = false;}
        return flag;
    }


}
