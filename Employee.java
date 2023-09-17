package Assignment_no_1;

public class Employee {
         
	//data members
	
		private int id;
		private String name;
		private double basicSalary;
		private double hra;
		private static int idGenerator=0;
		private double pf;
		private final double fixed=500 ;
		 
		//parameterized constructor
		
		public Employee( int id,String name, int basicSalary) {
			 this.name = " ";
			 this.basicSalary = 1000;
			 this.hra = .4 * basicSalary;
			 this.pf = .12 * basicSalary;
			 this.id =++idGenerator;
		}
		 
	public Employee() {
		 this.basicSalary = 1000;
		 this.hra = .4 * basicSalary;
		 this.pf = .12 * basicSalary;
		}
	
	//getter setter 
	
	public int getId(){
    	   return id;
    	   
       }
       public void setId(int id) {
    	   this.id = id;
       }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
		 this.hra = .4 * basicSalary;
		 this.pf = .12 * basicSalary;
		
	}


	public double getHra() {
		return hra;
	}


	public double getPf() {
		return pf;
	}


	public double getFixed() {
		return fixed;
	}
    
	

	//tostring()
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", hra=" + hra + ", pf=" + pf
				+ ", fixed=" + fixed + "]";
	}
    
	
  
	
    
}
