package day42_Exceptions;

public class MorningWorkout {
    public static void main(String[] args) {

        System.out.println("---------------Push up started----------");

        for (int i = 1; i <= 100; i++) {
            System.out.print("\rPush up " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n-------------Push up completed-----------");

        System.out.println("---------------Pull up started----------");

        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPush up " + i);
            sleep(2.5);
        }
        System.out.println("\n-----------Pull ups completed-------------");


    }
    public static void sleep(double seconds){

        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
