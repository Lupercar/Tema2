package entidadesBanco;

public class CuentaBancaria {
	private String nombre; 
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
