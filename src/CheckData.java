import java.util.StringTokenizer;

public class CheckData {

    private final int counter = 6;


    public void checkMyData(String data){

        if(checkString(data)){
            System.out.println(data);
        }else {
            whatsWrong(data);
        }
    }

    private String[] spliter(String data){
        String[] splitData = data.split(" ");
        return splitData;
    }

    private boolean checkString(String data){
        if(data == null){return false;}
        boolean flag = true;
        String[] splitData = spliter(data);
        int dataCounter = splitData.length;
        if(counter != dataCounter){flag = false;}
        return flag;
    }

    private void whatsWrong(String data){
        int num = data.length();
        if(num > counter){
            System.out.println("Вы ввели больше данных, чем требуется");
        }else{
            System.out.println("Данных недостаточно");
        }
    }


}
