import java.io.*;
import java.util.*;

public class DirListing {
    public static void main(String[] args) throws IOException {
        File dir = new File(System.getProperty("user.dir"));

        if (dir.isDirectory()) {
            System.out.println("Directory of " + dir);
            String[] listing = dir.list();

            for(int i=0; i<listing.length; i++) {
                System.out.println("\t" + listing[i]);
            }

        }

        File file = new File("app.txt");
        BufferedReader bufReader = new BufferedReader(new FileReader(file));
        int ch;
        StringBuffer strContent = new StringBuffer("");
        FileInputStream fin = null;
        String str, content = "";

        try {
            while((str = bufReader.readLine()) != null)
                content += str;

            bufReader.close(); 
        } catch(FileNotFoundException e) { 
            System.out.println("File " + file.getAbsolutePath() + " could not be found on filesystem"); 
        } catch(IOException ioe) { 
            System.out.println("Exception while reading the file" + ioe); 
        }

        System.out.println(content);


        String s = "This is a demo.";
        int start = 10;

        int end = 14;
        char buf[] = new char[end - start];

        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}

