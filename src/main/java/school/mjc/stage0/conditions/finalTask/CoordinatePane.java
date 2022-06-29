package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if(x > 0){
            if(y > 0){
                System.out.println("first");
                return;
            }
            System.out.println("second");
            return;
        }
        if (x < 0){
            if(y > 0){
                System.out.println("fourth");
                return;
            }
            System.out.println("third");
            return;
        }

        System.out.println("zero");
    }
}
