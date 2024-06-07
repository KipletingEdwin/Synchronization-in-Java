//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {

            public void run() {
                for (int i=1; i<= 1000;i++){
                    c.increment();
                }
            }
        });

        t1.start();
        System.out.println("Count :" + c.count);

    }
}