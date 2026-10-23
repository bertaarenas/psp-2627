package actividad4;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        demoNotify();
        System.out.println();
        demoNotifyAll();
    }

    private static void demoNotify() throws InterruptedException {
        System.out.println("-- 1: notify() --");

        Recreo recreo = new Recreo();

        // alumnos y portero
        Thread alumno1 = new Thread(new Alumno(recreo, "Alumno-1"), "Alumno-1");
        Thread alumno2 = new Thread(new Alumno(recreo, "Alumno-2"), "Alumno-2");
        Thread alumno3 = new Thread(new Alumno(recreo, "Alumno-3"), "Alumno-3");
        Thread portero = new Thread(new Portero(recreo, false), "Portero");

        alumno1.start();
        alumno2.start();
        alumno3.start();

        Thread.sleep(300);

        portero.start();
        portero.join();

        Thread.sleep(500);
        System.out.println("Alumnos que han salido con notify(): " + recreo.getDespertados());


    }

    private static void demoNotifyAll() throws InterruptedException {
        System.out.println("-- 2: notifyAll() --");

        Recreo recreo = new Recreo();

        // alumnos y portero
        Thread alumno1 = new Thread(new Alumno(recreo, "Alumno1"), "Alumno1");
        Thread alumno2 = new Thread(new Alumno(recreo, "Alumno2"), "Alumno2");
        Thread alumno3 = new Thread(new Alumno(recreo, "Alumno3"), "Alumno3");
        Thread portero = new Thread(new Portero(recreo, true), "Portero");

        alumno1.start();
        alumno2.start();
        alumno3.start();

        Thread.sleep(300);

        portero.start();

        portero.join();
        alumno1.join();
        alumno2.join();
        alumno3.join();

        System.out.println("Alumnos que han salido con notifyAll(): " + recreo.getDespertados());
    }
}
