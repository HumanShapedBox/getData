import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

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
            fillDate(data);
            fillSex(data);
        }
    }

    public String[] checkedData(){
        String[] userData= new String[5];
        return userData;
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

    private void checkDateData(String data){
        if(data.isEmpty())
            throw new RuntimeException("Неверный формат даты");
        String[] date = data.split(".");
        if(date.length > 3)
            throw new RuntimeException("Неверный формат даты");
        try{
            DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            Date userDate = format.parse(data);
            int currentYear = LocalDate.now().getYear();
            if(userDate.getYear() > currentYear)
                throw new RuntimeException("Неверный формат даты");
        }catch (ParseException e){
            System.out.println("Неверный формат даты");
        }
    }

    private char checkSex(String data){
        if(data.isEmpty() || data.matches("^[0-9]*$"))
            throw new RuntimeException("Некорректный ввод");
        if(data.equals("f") || data.equals("m")) {
            return data.charAt(0);
        }else throw new RuntimeException("Некорректный ввод");
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

    private void fillDate(String data){
        String[] user = spliter(data);
        try{
            checkDateData(user[3]);
            birthDate = user[3];
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }

    private void fillSex(String data){
        String[] user = spliter(data);
        try{
            sex = checkSex(user[5]);
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }


}
