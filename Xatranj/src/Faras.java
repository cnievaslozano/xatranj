
public class Faras extends Fitxa {

    public Faras(Color color, String ID, int startX, int startY) {
        super(color, ID, startX, startY);
    }

    @Override
    public boolean possibleMov(int x, int y) {
        // no puede capturarse asi mismo
        if (this.mateixColor(Tauler.getFitxa(x, y)) == true) {
            return false;
        }

        if (Math.abs(this.getY() - y) == 2 && Math.abs(this.getX() - x) == 1
                || Math.abs(this.getY() - y) == 1 && Math.abs(this.getX() - x) == 2) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        if (this.getColor() == Color.WHITE) {
            return "K";
        }
        return "k";
    }

    @Override
    public boolean potMov() {

        int x = this.getX();
        int y = this.getY();

        // arriba izuiqerda
        if (this.testMov(x - 2, y - 1)) {
            return true;
        }
        if (this.testMov(x - 1, y - 2)) {
            return true;
        }

        // arriba derecha
        if (this.testMov(x + 2, y - 1)) {
            return true;
        }
        if (this.testMov(x + 1, y - 2)) {
            return true;
        }

        // bajo izquierda
        if (this.testMov(x - 2, y + 1)) {
            return true;
        }
        if (this.testMov(x - 1, y + 2)) {
            return true;
        }

        // bajo derecha
        if (this.testMov(x + 2, y + 1)) {
            return true;
        }
        if (this.testMov(x + 1, y + 2)) {
            return true;
        }

        return false;
    }

}