import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteData {

    String name;
    List<String> files = new ArrayList<>();

    public WriteData(){
        this.name = null;
    }

    public void setName(List<String> data){
        this.name = data.get(0);
    }

    public void writeData(List<String> data){

        File file = new File("path/%s", name);

        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw))
        {
            for (String userData:data) {
                bw.write(userData);
            }
            System.out.println("Данные записаны");
        }
        catch (IOException e) {
            System.out.println("Ошибка во время записи файла");;
        }

    }

    private void addFileName(List<String> data){
        files.add(data.get(0));
    }


}
