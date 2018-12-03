package framework;

public class Account extends Product{
	private String owner;
	private int id;
	private String password;
	
	Account(String owner,int id,String password){
		System.out.println("アカウント作成→ " + owner + ",(id:" + id + ")," + "パスワード:" + password);
		this.owner = owner;
		this.id = id;
		this.password = password;
	}
	
	public void use(){
		System.out.println("アカウント使用→ " + owner + "(id:" + id + ")");
	}
	
	public String getAccount(){
		return owner;
	}
	
	public String getPassword(){
		return password;
	}
}
