public class Threading implements Runnable
{
       public static void main(String[] args) {
        Thread threading1 = new Thread("Shree");
        Thread threading2 = new Thread("Prasad");
        threading1.start();
        threading2.start();
        System.out.println("Thread names are following:");
        System.out.println(threading1.getName());
        System.out.println(threading2.getName());
    }
    public void run() {
    }
}
