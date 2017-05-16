package rectangulo;

public class Rect {

    private Punto x_y_1;
    private Punto x_y_2;
    private Punto x_y_3;
    private Punto x_y_4;
    public Punto[] dotList;

    public Rect(Punto punto_2, Punto punto_3) {

        this.x_y_2 = punto_2;
        this.x_y_3 = punto_3;
        this.x_y_1 = this.calculateUpperLeft();
        this.x_y_4 = this.calculateLowerRight();
        //this.aux();

    }

    public void aux() {

        this.dotList[0] = this.x_y_1;
        this.dotList[1] = this.x_y_2;
        this.dotList[2] = this.x_y_3;
        this.dotList[3] = this.x_y_4;

    }

    public Punto getX_y_1() {
        return x_y_1;
    }

    public Punto getX_y_2() {
        return x_y_2;
    }

    public Punto calculateUpperLeft() {

        Punto result = new Punto(this.x_y_3.getX(), this.x_y_2.getY());
        return result;

    }

    public Punto calculateLowerRight() {

        Punto result = new Punto(this.x_y_2.getX(), this.x_y_3.getY());
        return result;

    }

    public double calculateWidth() {

        return (this.x_y_2.getX() - this.x_y_3.getX());

    }

    public double calculateHeight() {

        return (this.x_y_3.getY() - this.x_y_2.getY());

    }

    public double calculatePerimeter() {

        return ((calculateWidth() * 2) + (calculateHeight() * 2));

    }

    public double calculateArea() {

        return (calculateWidth() * calculateHeight());

    }

    public boolean dotIsInTheRect(Punto punto) {

        return (punto.getX() <= x_y_2.getX() && punto.getX() >= x_y_3.getX()
                && punto.getY() <= x_y_2.getY() && punto.getY() >= x_y_3.getY());

    }

    public boolean rectTouchesTheRect(Rect rect) {

        for (int x = 0; x <= rect.dotList.length; x++) {

            if (dotIsInTheRect(rect.dotList[x])) {

                return true;

            }

        }

        return false;

    }

    public boolean rectIsInsideTheRect(Rect rect) {

        for (int x = 0; x <= rect.dotList.length; x++) {

            if (dotIsInTheRect(rect.dotList[x])) {

            } else {

                return false;

            }

        }

        return true;
    }

    public double calculateAreaOfcollision(Rect rect) {

        if (rect.x_y_3.getY() > this.x_y_1.getY() && rect.x_y_3.getX() >= this.x_y_1.getX()
                && rect.x_y_4.getX() <= this.x_y_2.getX()) {

            Rect i_r = new Rect(rect.x_y_3, new Punto(rect.x_y_4.getX(), this.x_y_2.getY()));

            return i_r.calculateArea();

        } else if (rect.x_y_3.getX() < this.x_y_2.getX() && rect.x_y_2.getY() >= this.x_y_2.getY()
                && rect.x_y_3.getY() <= this.x_y_3.getY()) {

            Rect i_r = new Rect(rect.x_y_3, new Punto(this.x_y_2.getX(), rect.x_y_2.getY()));

            return i_r.calculateArea();
            // Solo anda hasta aca, de aca para bajo es testeo     
        } else if (rect.x_y_2.getY() < this.x_y_3.getY() && rect.x_y_3.getX() >= this.x_y_3.getX()
                && rect.x_y_2.getX() <= this.x_y_2.getX()) {

            Rect i_r = new Rect(new Punto(rect.x_y_3.getX(), this.x_y_3.getY()), rect.x_y_2);

            return i_r.calculateArea();

        } else if (rect.x_y_2.getX() > this.x_y_3.getX() && rect.x_y_3.getY() <= this.x_y_3.getY ()
                && rect.x_y_2.getY() >= this.x_y_2.getY()) {

            Rect i_r = new Rect(new Punto(this.x_y_3.getX(), rect.x_y_3.getX()), rect.x_y_2);

            return i_r.calculateArea();

        }

        return 0;

    }

}
