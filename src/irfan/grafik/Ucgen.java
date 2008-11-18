package irfan.grafik;

public class Ucgen {

	private Nokta a = new Nokta();
	private Nokta b = new Nokta();
	private Nokta c = new Nokta();
	
	private boolean cizilsin = false;

	public void setA(Nokta nokta) { a.setLocation(nokta); }
	public void setB(Nokta nokta) { b.setLocation(nokta); }
	public void setC(Nokta nokta) { c.setLocation(nokta); }
	
	public Nokta getA() { return a; }
	public Nokta getB() { return b; }
	public Nokta getC() { return c; }
	
	public void setCizilsin(boolean cizilsin) { this.cizilsin = cizilsin; }
	
	public boolean isCizilsin() { return cizilsin; }
	
	public void cevir(double aci) {
		
		getA().cevir(aci);
		getB().cevir(aci);
		getC().cevir(aci);
	}

	public void setABCFromUcgen(Ucgen ucgen) {

		getA().setXYFromNokta(ucgen.getA());
		getB().setXYFromNokta(ucgen.getB());
		getC().setXYFromNokta(ucgen.getC());
	}

	public void konumDegistir(Nokta n1, Nokta n2) {
		
		getA().konumDegistir(n1, n2);
		getB().konumDegistir(n1, n2);
		getC().konumDegistir(n1, n2);
	}
	
	public void xEksenineGoreSimetriAl() {
		
		getA().xEksenineGoreSimetriAl();
		getB().xEksenineGoreSimetriAl();
		getC().xEksenineGoreSimetriAl();
	}
	
	@Override
	public String toString() {
	
		return "Ucgen: [" + getA() + "], [" + getB() + "], [" + getC() + "]";
	}
}
