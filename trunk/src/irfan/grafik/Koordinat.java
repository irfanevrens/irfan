package irfan.grafik;

import java.awt.Dimension;
import irfan.grafik.interfaces.IKoordinat;

public class Koordinat implements IKoordinat {

	private Nokta xy1 = new Nokta(10, 10);
	private Nokta xy2 = new Nokta();
	
	private Nokta orjin = new Nokta();
	
	private int gridAraligi = 8;
	private int gridNoktaKalinligi = 1;
	
	private int tiklamaSayisi = 1;
	
	private String bilgi;
	
	public Nokta getXY1() { return xy1; }
	public Nokta getXY2() { return xy2; }
	
	public Nokta getOrjin() { return orjin; }
	
	public int getSol() { return getXY1().x; }
	public int getUst() { return getXY1().y; }
	public int getSag() { return getXY2().x; }
	public int getAlt() { return getXY2().y; }
	
	public int getGenislik() { return getXY2().x - getXY1().x; }
	public int getYukseklik() { return getXY2().y - getXY1().y; }

	public int getOrjinX() { return getOrjin().x; }
	public int getOrjinY() { return getOrjin().y; }
	
	public int getGridAraligi() { return gridAraligi; }
	public int getGridNoktaKalinligi() { return gridNoktaKalinligi  ; }
	
	public int getTiklamaSayisi() { return tiklamaSayisi; }
	
	public int getYatayAdimSayisi() { return (getOrjinX() - getSol()) / getGridAraligi(); }
	public int getDikeyAdimSayisi() { return (getOrjinY() - getUst()) / getGridAraligi(); }
		
	public String getBilgi() { return bilgi; }
	
	public void setBilgi(String bilgi) { this.bilgi = bilgi; }
	
	public void incTiklamaSayisi() { tiklamaSayisi++; }
	
	@Override
	public void ebatlarDegisti() {
		
		orjin.setLocation(
				(getXY2().x - getXY1().x) / 2 + getXY1().x, 
				(getXY2().y - getXY1().y) / 2 + getXY1().y);
	}

	@Override
	public void ebatlarDegisti(Dimension size) {

		getXY2().setLocation(
				size.width - getXY1().x, 
				size.height - getXY1().y);
		
		ebatlarDegisti();
	}
	
	protected boolean isGecerliTiklama(Nokta nokta) {
		
		return 
			nokta.x > getSol() && 
			nokta.x < getSag() && 
			nokta.y > getUst() && 
			nokta.y < getAlt(); 
	}
}
