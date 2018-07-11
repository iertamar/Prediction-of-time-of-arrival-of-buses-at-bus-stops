import java.io.*;
import java.util.*;
public class Text_to_CSV {

    public static void main(String[] args) throws Exception,
            IOException {

        FileWriter writer = null;
        File file = new File("/home/amar/Desktop/project/GIS/Bus_data/15/150814557.txt");
        Scanner scan = new Scanner(file);
        File file2 = new File("/home/amar/Desktop/project/GIS/Bus_data/15/150814557.csv");
        file.createNewFile();
        writer = new FileWriter(file2);

        while (scan.hasNext()) {
            String csv = scan.nextLine().replace("	", ",");
            System.out.println(csv);
            writer.append(csv);
            writer.append("\n");
            writer.flush();
        }
    }
}
