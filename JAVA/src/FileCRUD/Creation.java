package FileCRUD;
import java.io.*;

public class Creation {
    static void main(String[] args) {
        try {
            File file =new File("i.html");
            if(file.delete()){
                System.out.println("done "+file.getName());
            }else{
                System.out.println("file already created");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        createData();
    }

    static void createData() {
        try {
            FileWriter writer=new FileWriter("index.html", true);
        writer.write("\n I'm F");
        writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}