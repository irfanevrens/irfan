package irfan.grafik.gui;

import irfan.grafik.Koordinat;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JKoordinat extends JPanel {

	private static final long serialVersionUID = 2355399047824110948L;
	
	public JKoordinat() { super(null); }
	
	protected void koordinatSifirla(Graphics g) {
        
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
    }

	protected void koordinatCiz(Koordinat koordinat, Graphics g) {
		
		g.setColor(Color.GRAY);
		
		g.drawLine(
				koordinat.getOrjin().x, 
				koordinat.getUst(), 
				koordinat.getOrjin().x, 
				koordinat.getAlt());
		
		g.drawLine(
				koordinat.getXY1().x, 
				koordinat.getOrjin().y, 
				koordinat.getXY2().x, 
				koordinat.getOrjin().y);
		
		for (int i = 1; i <= koordinat.getYatayAdimSayisi(); i++) {
			
			for (int j = 1; j <= koordinat.getDikeyAdimSayisi(); j++) {
			
				g.fillOval(
						koordinat.getOrjinX() - i * koordinat.getGridAraligi(), 
						koordinat.getOrjinY() - j * koordinat.getGridAraligi(), 
						koordinat.getGridNoktaKalinligi(), 
						koordinat.getGridNoktaKalinligi());
				
				g.fillOval(
						koordinat.getOrjinX() + i * koordinat.getGridAraligi(), 
						koordinat.getOrjinY() + j * koordinat.getGridAraligi(), 
						koordinat.getGridNoktaKalinligi(), 
						koordinat.getGridNoktaKalinligi());
				
				g.fillOval(
						koordinat.getOrjinX() - i * koordinat.getGridAraligi(), 
						koordinat.getOrjinY() + j * koordinat.getGridAraligi(), 
						koordinat.getGridNoktaKalinligi(), 
						koordinat.getGridNoktaKalinligi());
				
				g.fillOval(
						koordinat.getOrjinX() + i * koordinat.getGridAraligi(), 
						koordinat.getOrjinY() - j * koordinat.getGridAraligi(), 
						koordinat.getGridNoktaKalinligi(), 
						koordinat.getGridNoktaKalinligi());
			}
		}
		
	}
}
