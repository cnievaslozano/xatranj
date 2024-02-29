
public class Ministre extends Fitxa {

    public Ministre(Color color, String ID, int startX, int startY) {
        super(color, ID, startX, startY);
    }

    @Override
    public boolean possibleMov(int x, int y) {
        // no puede capturar pieza propia
        if (this.mateixColor(Tauler.getFitxa(x, y)) == true) {
            return false;
        }
        // obstruccion
        if (Tauler.camiLliure(getX(), getY(), x, y) != true) {
            return false;
        }
        // Elefant
        if (Math.abs(getX() - x) == Math.abs(getY() - y)) { // Elefant
            return true;
        }
        // Ruhk
        if (Math.abs(getX() - x) != 0 && Math.abs(getY() - y) == 0
                || Math.abs(getX() - x) == 0 && Math.abs(getY() - y) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.getColor() == Color.WHITE) {
            return "M";
        }
        return "m";
    }

    @Override
    public boolean potMov() {

        int x = this.getX();
        int y = this.getY();

        // Elefant
        // arriba izquierda
        while ((--x) >= 0 && (--y) >= 0) {
            if (this.testMov(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // arriba derecha
        while ((++x) <= 7 && (--y) >= 0) {
            if (this.testMov(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // arriba izquierda
        while ((--x) >= 0 && (++y) <= 7) {
            if (this.testMov(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // abajo derecha
        while ((++x) <= 7 && (++y) <= 7) {
            if (this.testMov(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // ruhk
        // izquierda
        while ((--x) >= 0 && y >= 0) {
            if (this.testMov(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // derecha
        while ((++x) <= 7 && y >= 0) {
            if (this.testMov(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // abajo
        while (x >= 0 && (++y) <= 7) {
            if (this.testMov(x, y)) {
                return true;
            }
        }

        x = this.getX();
        y = this.getY();
        // arriba
        while (x <= 7 && (--y) >= 0) {
            if (this.testMov(x, y)) {
                return true;
            }
        }
        return false;
    }

}