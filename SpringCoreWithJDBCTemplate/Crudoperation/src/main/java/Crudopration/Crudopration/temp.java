package Crudopration.Crudopration;

public class temp {
	protected String id;
	protected String name;
	protected String father;
	protected String gender;
	protected String std;
	protected String address;
	protected String date;
	protected String game;
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	
	protected String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public temp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "temp [id=" + id + ", name=" + name + ", father=" + father + ", gender=" + gender + ", std=" + std
				+ ", address=" + address + ", date=" + date + ", game=" + game + ", email=" + email + ", getGame()="
				+ getGame() + ", getEmail()=" + getEmail() + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getFather()=" + getFather() + ", getGender()=" + getGender() + ", getStd()=" + getStd()
				+ ", getAddress()=" + getAddress() + ", getDate()=" + getDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public temp(String id, String name, String father, String gender, String std, String address, String date,
			String game, String email) {
		super();
		this.id = id;
		this.name = name;
		this.father = father;
		this.gender = gender;
		this.std = std;
		this.address = address;
		this.date = date;
		this.game = game;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
