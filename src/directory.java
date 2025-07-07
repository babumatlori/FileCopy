import java.io.*;

public class DirectoryCopy {

    public static void copy(File src, File dest) throws IOException {
        if (src.isFile()) {
            // If src is a file, copy the content
            copyFile(src, new File(dest, src.getName()));
            return;
        }

        // If src is a directory, create a new directory in dest
        File newDir = new File(dest, src.getName());
        if (!newDir.exists()) {
            newDir.mkdir();
        }

        // Get all files/subdirectories
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                // Recursive call
                copy(file, newDir);
            }
        }
    }

    // Helper method to copy file content
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

   