
/* Chris Foster
 * October 23rd, 2014
 * Git Workshop Software Demo 
 */

public class ListFiles {

    public static void main(String... args) {
        File[] files = new File("people/").listFiles();
        showFiles(files);
    }

    public static void showFiles(File[] files) {
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
                showFiles(file.listFiles()); // Calls same method again.
            } else {
                System.out.println("File: " + file.getName());
            }
        }
    }
     
}
