package framework;
import java.util.*;

public abstract class Factory{
	public final Product create(String owner,int id,String password){
		Product product = createProduct(owner,id,password);
		registerProduct(product);
		return product;
	}
	
	protected abstract Product createProduct(String owner,int id,String password);
	protected abstract void registerProduct(Product product);
}


