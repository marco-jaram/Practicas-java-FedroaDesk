package myThreadsinterfaz;


class MarcoThreads implements Runnable{
    private int valor;
    public MarcoThreads(int valor) {
	this.valor=valor;
    }
    @Override
    public void run() {
	for (int i = valor; i < 100; i++) {
	    System.out.println("Hilo con valor= " + valor + " Hola Mundo. Mi iteracion es el numero=  " + i);
	}



    }

}
public class MyThreadsinterfaz {
    public static void main(String[] args) {
	Thread hiloThread1 = new Thread(new MarcoThreads(20));
	Thread hiloThread2 = new Thread(new MarcoThreads(6));
	hiloThread1.start();
	hiloThread2.start();
    }
}
