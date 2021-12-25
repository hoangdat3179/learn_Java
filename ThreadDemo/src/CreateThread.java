public class CreateThread extends Thread{
    @Override
    public void run() {
//        super.run();
        System.out.println("abc");
        for (int i = 0; i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
