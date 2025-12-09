package lab_Programn_8;

class college extends Thread {
    public void run()
    {
        try {
            while (true) {
                System.out.println("BMS college of Engineering");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Cse extends Thread{
    public void run(){
        try{
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class thread {
    public static void main(String[] args) {
        college t1 = new college();
        Cse t2 = new Cse();

        t1.start();
        t2.start();
    }
}
