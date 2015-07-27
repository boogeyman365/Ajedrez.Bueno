package Ajedrez1;

import java.awt.Color;

public class Casilla {

	Color c;
	int x, y;
        Boolean sel = false;
        Ficha f;

	Casilla(int x, int y) {
		this.x = x;
		this.y = y;
		if ((x + y) % 2 == 0) {
			c = new Color(184, 134, 11,150);
		} else {
			c = new Color(192, 192, 192,150);
		}
	}
        
        public void setFicha (Ficha f){
            this.f = f;
        }
        public Ficha getFicha (){
            return f;
        }
        public void setColor (Color c){
            this.c = c;
        }
        public Color getColor (){
            return c;
        }
        public void esta_pintada (int x, int y){
            if ((x+y)%2 ==0){
                c = new Color(255, 255, 255);
            }else{
                c = new Color(0, 0, 0);
            }
        }
}
