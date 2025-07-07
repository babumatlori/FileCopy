import java.io.*;

public  class FileCopyUtil {
    public static void copyFile(String sourcePath, String copyPath){
        File source = new File(sourcePath);
        File copy = new File(copyPath);

        if (!source.exists() || ! source.isFile()){
            System.out.println(" source is not found");
            return;
        }
        try {
            FileInputStream fI = new FileInputStream(source);
            FileOutputStream fO= new FileOutputStream(copy);

            byte [] buffer = new byte[1024];
            int readBytes;

            while ((readBytes = fI.read(buffer))!=-1) {
                fO.write(buffer, 0, readBytes);

                System.out.println("file copy success!!");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
