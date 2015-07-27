package Ajedrez1;

import java.awt.Graphics;

public final class Tablero {

	private final int N = 8;
	Casilla casillas[][];
	AppletAjedrez a;
        int margen;
	int tamaño;

	Tablero(AppletAjedrez a) {
		this.a = a;
		casillas = new Casilla[N][N];
		margen=a.margen;
		tamaño = (menor(a.getWidth(), a.getHeight()) - margen * 2) / N;
		crear_casillas();
	}

	void crear_casillas() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				casillas[i][j] = new Casilla(i, j);
			}
		}
	}

	int menor(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}

	void pintar_tablero(Graphics g) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				g.setColor(casillas[i][j].c);
				g.fillRect(margen+i*tamaño, margen+j*tamaño,tamaño,tamaño);
			}
		}
                
	}
        void pintar_ficha (Graphics g){
            
            for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
                            if (casillas[i][j].getFicha() != null){
				g.drawImage(this.casillas[i][j].f.img, this.casillas[i][j].x*tamaño+margen, this.casillas[i][j].y*tamaño+margen,tamaño, tamaño,a);
                            }}
		}
            
        }
        void pintar_fondo (Graphics g){
            if (true){
                g.drawImage(a.fondo, 0, 0, 1400, 750, a);
            }
        }
}
