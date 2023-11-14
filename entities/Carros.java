package entities;

public class Carros {

	private String name;
	private String modelo;
	private Integer ano;
	
	
	

	public Carros(String name, String modelo, Integer ano) {
		
		this.name = name;
		this.modelo = modelo;
		this.ano = ano;
		
	}
	
	public Carros() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "NOME DO PROPRIETARIO: " + name + 
				" \nMODELO DO CARRO: " + modelo + 
				" \nANO: [" + ano + "]" ;
	}

	
	
	
}
