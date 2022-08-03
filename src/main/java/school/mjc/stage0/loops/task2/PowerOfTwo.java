package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int result = 0;
        int i = 0;
        if (power >= 0) {
            while ((int)Math.pow(2, i) <= (int)Math.pow(2, power)  ) {
                System.out.println((int)Math.pow(2, i));
                i++;

            }
        } else System.out.println("too much power");

        //System.out.println("too much power");

    }
}
