
public class Test<T> {
	public T obj;
	
	public Test() {
		obj = null;
	}
	// constructor
	public Test(T obj) {  
		this.obj = obj;  
	}  

    public T getObject()  { 
    	return this.obj; 
    }

}
