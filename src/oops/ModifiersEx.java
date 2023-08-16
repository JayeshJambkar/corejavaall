package oops;

public class ModifiersEx {
	
	    private int id = 101;
	    private String name = "Smith";
	    private void display(){
	    	
	    }
	    
	    {
	        System.out.println("Id = "+id+"\nName = "+name);
	    }
	    public static void main(String args[])
	    {
	        ModifiersEx m = new ModifiersEx();
	        
	        m.id= 50;
	        m.name="herry";
	        m.display();
	        //System.out.println("Id: "+m.id+" Name: "+m.name);
	    }
	}


