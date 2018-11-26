package framework;
import java.util.*;

public class AccountFactory extends Factory{
	private List owners = new ArrayList();
	
	protected Product createProduct(String owner,int id,String password){
		return new Account(owner,id,password);
	}
	
	protected void registerProduct(Product product){
		owners.add( ((Account)product).getAccount() );
	}
	
	public List getAccounts(){
		return owners;
	}
}
