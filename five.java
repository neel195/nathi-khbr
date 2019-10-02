import java.io.IOException;

class five {
    void m() {
        int data = 44 / 0;
    }
    void n() {
        m();
    }
    void p() {
        try {
            n();
        } 
        catch (IOException e) {
            System.out.println("exception handled");
        }
    }
    
    public static void main(String args[]) {
        TryCatchExample1 obj = new TryCatchExample1();
        obj.p();
        System.out.println("normal flow...");
    }
}
