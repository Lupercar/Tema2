package entidadesBanco;

public class CuentaBancaria {
	protected String nombre; 
	private double balance; 
	
	public CuentaBancaria(String nombre){
		this.nombre = nombre; 
	}
	
	protected void setBalance(double balance){
		this.balance = balance; 
	}
	
	public void ingresar(double cantidad){
		setBalance(this.balance+cantidad);
	}
}
