package Error_Handling;
import java.io.*;

public class ErrorHand {
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
        readFileData();
        deleteData();
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

    static void readFileData() {
        try{
            FileReader reader=new FileReader("index.html");
            int ch;
            while((ch= reader.read())!=-1){
                System.out.print((char)ch);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static void deleteData(){
        try{
            File file = new File("index.html");
            if(file.delete()){
                System.out.println("File deleted"+file.getName());
            }else {

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
