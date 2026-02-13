import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling {
    public static void main(String[] args) throws IOException {
        // inbuilt to create folder
        File folder = new File("C:\\PEPFILE");
        // folder
        folder.mkdir();

        // create file
        File f1 = new File(folder, "Student.txt");
        // createnewfile m,ethod
        // f1.createNewFile();
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File f2 = new File(folder, "Data.txt");
        // createnewfile m,ethod
        // f1.createNewFile();
        try {
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // printStackTrace->detail information deta hai withput interupting the
        // execution of the program
        // write text in the file
        // exist() method->check the file if they exist in the folder or not

        if (folder.exists()) {
            File[] list = folder.listFiles();
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i].getName());
            }
        }
        // writee(old way not efficient we will write in bufferwriter)
        // FileWriter writer = new FileWriter(f1);
        // writer.write("Hello Students");
        // writer.close();

        // bufferedwriter
        BufferedWriter writer = new BufferedWriter(new FileWriter(f2));
        writer.write("Hello Everyone Good Morning");
        writer.close();

        // reading the data in the file
        BufferedReader reader = new BufferedReader(new FileReader(f1));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
