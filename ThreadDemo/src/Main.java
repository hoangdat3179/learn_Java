public class Main {

    public static void main(String[] args) {
        //Tạo bằng extend class Thread
        CreateThread thread1 = new CreateThread();
        System.out.println(thread1.getId()+ " - " +thread1.getName());
        thread1.start();

        try {
            thread1.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        CreateThread thread2 = new CreateThread();
        System.out.println(thread2.getId()+ " - " +thread2.getName());
        thread2.setName("Luồng 2");
        System.out.println(thread2.getId()+ " - " +thread2.getName());
        thread2.start();

        try {
            thread2.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Tạo bằng implements interface Runnable
        ThreadByInterface thread = new ThreadByInterface();
        Thread t = new Thread(thread);
        t.start();


    }
}
