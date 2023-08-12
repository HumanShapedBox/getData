import java.util.Scanner;

public class GetUserData {

    Scanner sc = new Scanner(System.in);
    private String userData;

    public void takeUserData(){
        System.out.println("Введите через пробел свои фамилию, имя, отчество, дату рождения, номер телефона и пол.\n" +
                "Образец заполнения:\n" + "Иванов Иван Иванович 15.12.1885 89109998877 m\n" +
                "Иванова Мария Ивановна 14.11.1990 89159998877 f");
        userData = sc.nextLine();
    }

    public String getData(){
        return this.userData;
    }

}
