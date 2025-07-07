public class CopyFile2 {
    private static CopyFile2 ceoInstance;
    private CopyFile2(){
        System.out.println("CEO is Apponited");
    }

    public static CopyFile2 getInstance(){
        if (ceoInstance == null){
            ceoInstance = new CopyFile2();
        }
        return ceoInstance;
    }

    public void display( String  message){
        System.out.println("CEO says"+message);
    }

    public static void main(String[] args) {
        CopyFile2 hr= CopyFile2.getInstance();
        ceoInstance.display("Hi its your new ceo");
    }
}
