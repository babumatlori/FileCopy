class DownloadThread extends Thread{
    private String url;
    public DownloadThread(String url){
        this.url= url;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i <=100; i++){
            System.out.println(url+" "+i+ "%");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

