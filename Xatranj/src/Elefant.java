
public class Elefant extends Fitxa {

    public Elefant(Color color, String ID, int startX, int startY) {
        super(color, ID, startX, startY);
    }

    @Override
    public boolean possibleMov(int x, int y) {
        // no puedes capturar tu propia pieza
        if (this.mateixColor(Tauler.getFitxa(x, y)) == true) {
            return false;
        }
        // movimiento invalido para Elefant
        if (Math.abs(getX() - x) != Math.abs(getY() - y)) {
            return false;
        }

        if (Tauler.camiLliure(getX(), getY(), x, y)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.getColor() == Color.WHITE) {
            return "E";
        }
        return "e";
    }

    @Override
    public boolean potMov() {

        int origenX = this.getX();
        int origenY = this.getY();

        // reinicia x i y ala posicion original despues de cada bucle
        int x = origenX;
        int y = origenY;

        // arriba izquierda
        while ((--x) >= 0 && (--y) >= 0) {
            if (this.testMov(x, y)) {
                return true;
            }
        }
        x = origenX;
        y = origenY;
        // arriba derecha
        while ((++x) <= 7 && (--y) >= 0) {
            if (this.testMov(x, y)) {
                return true;
            }
        }
        x = origenX;
        y = origenY;
        // abajo izquierda
        while ((--x) >= 0 && (++y) <= 7) {
            if (this.testMov(x, y)) {
                return true;
            }
        }
        x = origenX;
        y = origenY;
        // abajo derecha
        while ((++x) <= 7 && (++y) <= 7) {
            if (this.testMov(x, y)) {
                return true;
            }
        }
        return false;
    }

}