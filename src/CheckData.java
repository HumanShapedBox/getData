import java.util.StringTokenizer;

public class CheckData {

    private final int counter = 6;
    private String surname;
    private String name;
    private String middleName;
    private String birthDate;
    private int phoneNumber;
    private char sex;



    public void checkMyData(String data){
        if(!checkString(data)){
            whatsWrong(data);
        }else{
            fillTextData(data);
            fillNumber(data);
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

    private String checkTextData(String data){
        if(data.isEmpty() || data.matches("^[0-9]*$"))
            throw new RuntimeException("Некорректный ввод");
        return data;
    }

    private void checkNumber(String data){
        try{
            phoneNumber = Integer.parseInt(data);
        }catch(NumberFormatException e){
            System.out.println("Некорректный ввод номера");
        }
    }

    private void fillTextData(String data){
        String[] user = spliter(data);
        try{
            surname = checkTextData(user[0]);
            name = checkTextData(user[1]);
            middleName = checkTextData(user[2]);
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }

    private void fillNumber(String data){
        String[] user = spliter(data);
        try{
            checkNumber(user[4]);
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }

}
