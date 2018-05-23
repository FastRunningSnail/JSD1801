package me.hashset;

public class Userinfo implements Comparable<Userinfo>{
	private int uno;
	private String name;
	public Userinfo() {
	}
	public Userinfo(int uno, String name) {
		super();
		this.uno = uno;
		this.name = name;
	}
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Userinfo o) {
		return this.uno-o.getUno();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + uno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Userinfo other = (Userinfo) obj;
		if (uno != other.uno)
			return false;
		return true;
	}
	
//	//÷ÿ–¥equals∑Ω∑®
//	public boolean equals(){
//		return false;
//		
//	}
	
	
	
	
}
