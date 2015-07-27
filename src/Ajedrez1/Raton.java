package Ajedrez1;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Raton implements MouseListener {

    int x;
    int y;
    int xaux;
    int yaux;
    AppletAjedrez a;
    Ficha f;
    Casilla selecc;
    Color cselecc;
    Tablero t;
    String turno = "blancas";

    Raton(AppletAjedrez a) {
        this.a = a;

    }

    @Override
    public void mouseClicked(MouseEvent ec) {

        this.x = (ec.getXOnScreen() - this.a.t.margen) / this.a.t.tamaño;
        this.y = (ec.getYOnScreen() - this.a.t.margen * 2) / this.a.t.tamaño;

        System.out.println(x + " " + y);

        if (this.a.t.casillas[x][y].f != null & selecc == null) {
            if (this.turno.equals("blancas") & a.t.casillas[x][y].f.color.equals("blanco")) {
                System.out.println("Empieza");
                System.out.println("Turno de blancas");
                cselecc = a.t.casillas[x][y].getColor();
                this.a.t.casillas[x][y].setColor(Color.blue);
                selecc = this.a.t.casillas[x][y];
            }

            if (this.a.t.casillas[x][y].f.color.equals("negro") & this.turno.equals("negras")) {
                System.out.println("turno de negras");
                cselecc = a.t.casillas[x][y].getColor();
                this.a.t.casillas[x][y].setColor(Color.blue);
                selecc = this.a.t.casillas[x][y];
            }
        }else{
        if (this.turno.equals("blancas") & this.a.t.casillas[x][y].f == null & selecc != null) {
            
            System.out.println("mueve");
            selecc.setColor(cselecc);
            this.a.t.casillas[x][y].setFicha(new Ficha(a, selecc.f.color, selecc.f.img));
            selecc.f = null;
            selecc = null;
            turno = "negras";
        }
            if (this.turno.equals("blancas") & selecc != null & this.a.t.casillas[x][y].f != null) {
                if (this.a.t.casillas[x][y].f.color.equals("negro")){
                    System.out.println("come");
                    selecc.setColor(cselecc);
                    this.a.t.casillas[x][y].setFicha(new Ficha(a, selecc.f.color, selecc.f.img));
                    selecc.f = null;
                    selecc = null;
                    turno = "negras";
                }else{
                System.out.println("pincho en otra blanca");
                selecc.setColor(cselecc);
                cselecc = this.a.t.casillas[x][y].getColor();
                this.a.t.casillas[x][y].setColor(Color.blue);
                selecc = this.a.t.casillas[x][y];
                }
            }
        
        if (this.turno.equals("negras") & this.a.t.casillas[x][y].f == null & selecc != null) {
                
            System.out.println("mueve");
            selecc.setColor(cselecc);
            this.a.t.casillas[x][y].setFicha(new Ficha(a, selecc.f.color, selecc.f.img));
            selecc.f = null;
            selecc = null;
            turno = "blancas";
        }
            if (this.turno.equals("negras") & selecc != null & this.a.t.casillas[x][y].f != null) {
                if (this.a.t.casillas[x][y].f.color.equals("blanco")){
                    System.out.println("come");
                    selecc.setColor(cselecc);
                    this.a.t.casillas[x][y].setFicha(new Ficha(a, selecc.f.color, selecc.f.img));
                    selecc.f = null;
                    selecc = null;
                    turno = "blancas";
                }else{
                System.out.println("pincho en otra negra");
                selecc.setColor(cselecc);
                cselecc = this.a.t.casillas[x][y].getColor();
                this.a.t.casillas[x][y].setColor(Color.blue);
                selecc = this.a.t.casillas[x][y];
                }
            }
        }
        this.a.repaint();
        
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
