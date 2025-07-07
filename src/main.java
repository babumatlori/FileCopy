public class main {
    public static void main(String[] args) {

        DownloadThread d1= new DownloadThread("http://amazon.com//");
        DownloadThread d2= new DownloadThread("http://flipcart.com//");
        DownloadThread d3= new DownloadThread("http://mintra.com//");
        DownloadThread d4= new DownloadThread("http://messho.com//");

        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d1.threadId();
    }
}
