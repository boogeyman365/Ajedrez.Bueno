package Ajedrez1;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

public class AppletAjedrez extends Applet {

    Tablero t;
    int margen = 40;
    private Image imagenDB;
    private Graphics gDB;
    Image img[] = new Image[12];
    Image fondo;
    Raton r;
    Ficha f;
    Casilla c;

    @Override
    public void init() {
        r = new Raton(this);
        addMouseListener(r);
        fondo = getImage(getCodeBase(), "fondo1.jpg");
        t = new Tablero(this);
        img[0] = getImage(getCodeBase(), "fichas/alfilB.png");
        img[1] = getImage(getCodeBase(), "fichas/alfilN.png");
        img[2] = getImage(getCodeBase(), "fichas/torreB.png");
        img[3] = getImage(getCodeBase(), "fichas/torreN.png");
        img[4] = getImage(getCodeBase(), "fichas/reyB.png");
        img[5] = getImage(getCodeBase(), "fichas/reyN.png");
        img[6] = getImage(getCodeBase(), "fichas/reinaB.png");
        img[7] = getImage(getCodeBase(), "fichas/reinaN.png");
        img[8] = getImage(getCodeBase(), "fichas/peonB.png");
        img[9] = getImage(getCodeBase(), "fichas/peonN.png");
        img[10] = getImage(getCodeBase(), "fichas/caballoB.png");
        img[11] = getImage(getCodeBase(), "fichas/caballoN.png");
        
        
        t.casillas[0][0].setFicha( new Ficha(this, "negro", img[3])); 
        t.casillas[1][0].setFicha( new Ficha(this, "negro", img[11]));
        t.casillas[2][0].setFicha( new Ficha(this, "negro", img[1]));
        t.casillas[3][0].setFicha(new Ficha(this, "negro", img[7]));
        t.casillas[4][0].setFicha( new Ficha(this, "negro", img[5]));
        t.casillas[5][0].setFicha(new Ficha(this, "negro", img[1]));
        t.casillas[6][0].setFicha(new Ficha(this,  "negro", img[11]));
        t.casillas[7][0].setFicha(new Ficha(this, "negro", img[9]));
        t.casillas[0][1].setFicha(new Ficha(this, "negro", img[9]));
        t.casillas[1][1].setFicha(new Ficha(this, "negro", img[9]));
        t.casillas[2][1].setFicha(new Ficha(this, "negro", img[9]));
        t.casillas[3][1].setFicha(new Ficha(this, "negro", img[9]));
        t.casillas[4][1].setFicha(new Ficha(this, "negro", img[9]));
        t.casillas[5][1].setFicha(new Ficha(this, "negro", img[9]));
        t.casillas[6][1].setFicha(new Ficha(this, "negro", img[9]));
        t.casillas[7][1].setFicha(new Ficha(this, "negro", img[9]));
        t.casillas[0][6].setFicha(new Ficha(this, "blanco", img[8]));
        t.casillas[1][6].setFicha(new Ficha(this, "blanco", img[8]));
        t.casillas[2][6].setFicha(new Ficha(this, "blanco", img[8]));
        t.casillas[3][6].setFicha(new Ficha(this, "blanco", img[8]));
        t.casillas[4][6].setFicha(new Ficha(this, "blanco", img[8]));
        t.casillas[5][6].setFicha(new Ficha(this, "blanco", img[8]));
        t.casillas[6][6].setFicha(new Ficha(this, "blanco", img[8]));
        t.casillas[7][6].setFicha(new Ficha(this, "blanco", img[8]));
        t.casillas[0][7].setFicha(new Ficha(this, "blanco", img[2]));
        t.casillas[1][7].setFicha(new Ficha(this, "blanco", img[10]));
        t.casillas[2][7].setFicha(new Ficha(this, "blanco", img[0]));
        t.casillas[3][7].setFicha(new Ficha(this, "blanco", img[6]));
        t.casillas[4][7].setFicha(new Ficha(this, "blanco", img[4]));
        t.casillas[5][7].setFicha(new Ficha(this, "blanco", img[0]));
        t.casillas[6][7].setFicha(new Ficha(this, "blanco", img[10]));
        t.casillas[7][7].setFicha(new Ficha(this, "blanco", img[2]));
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void paint(Graphics g) {
        t.pintar_fondo(g);
        t.pintar_tablero(g);
        t.pintar_ficha(g);
	}

	@Override
    public void update(Graphics g) {
        if (imagenDB == null) {
            imagenDB = createImage(getWidth(), getHeight());
            gDB = imagenDB.getGraphics();
        }
        gDB.setColor(getBackground());
        gDB.fillRect(0, 0, getWidth(), getHeight());
        gDB.setColor(getForeground());
        paint(gDB);
        g.drawImage(imagenDB, 0, 0, this);
    }
}
