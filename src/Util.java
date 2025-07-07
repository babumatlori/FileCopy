import java.io.File;
import java.io.IOException;

public class Util {

    public static void printFileInfo(String path) {
        File file = new File(path);
        System.out.println("Exists: " + file.exists());
        System.out.println("Abs path: " + file.getAbsoluteFile());
        System.out.println("length: " + file.length());
        System.out.println("is file: " + file.isFile());
        System.out.println("Read/Write/Execute: " + file.canRead() + " " + file.canWrite() + " " + file.canExecute());
        System.out.println("path: " + file.getPath());

        System.out.println("------------------------------------");
    }

    public static boolean createfile(String path) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            return false;
        }
        return file.createNewFile();
    }
    public static boolean createDir(String path){
        File file = new File(path);
        if (file.exists()){
            return false;
        }
        return file.mkdir();
    }

//    public static boolean fileReader(String path) throws FileNotFoundException {
//        FileReader fileReader = new FileReader(path);
//
//        return false;
//    }

    public static void deleteFile(String path){
        File file= new File(path);
        if (!file.exists()){
            return;
        }
        file.delete();
    }
}

