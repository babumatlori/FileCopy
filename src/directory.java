import java.io.*;

public class DirCopy {

    public static void copy(File src, File dest) throws IOException {
        if (src.isFile()) {
           

            copyFile(src, new File(dest, src.getName()));
            return;
        }

        

        File newDir = new File(dest, src.getName());
        if (!newDir.exists()) {
            newDir.mkdir();
        }

       

        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
             
                copy(file, newDir);
            }
        }
    }

    

    public static void copyFile(File sourceFile, File destFile) throws IOException {
        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile)
        ) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        }
    }

   