import java.util.StringTokenizer;

public class CheckData {

    private final int counter = 6;

    public boolean checkString(String data){
        if(data == null){return false;}
        boolean flag = true;
        StringTokenizer dataCounter = new StringTokenizer(data);
        String num = dataCounter.toString();
        if(counter != Integer.parseInt(num)){flag = false;}
        return flag;
    }
}
