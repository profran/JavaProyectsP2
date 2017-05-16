package Test;

public class TestMain {

    public static void main(String[] args) {

        int x_overlap = Math.max(0, Math.min(2, 1) - Math.max(1, 1));
        int y_overlap = Math.max(0, Math.min(2, 1) - Math.max(1, 1));
        int overlapArea = x_overlap * y_overlap;
    
        System.out.println(overlapArea);

}

}
