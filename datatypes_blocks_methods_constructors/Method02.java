//instance method with no return type and one argument

class Student
 {  
	int roll;  
	String name;  
	
	public int getRoll()    //accessor method  
    {  
    return roll;  
    }  
    
	public void setRoll(int roll) //mutator method  
    {  
    this.roll = roll;  
    }  
    
	public String getName()   
    {  
    return name;  
    }  
    
	public void setName(String name)   
    {  
    this.name = name;  
    }  
    
	public void display()  
    {  
    System.out.println("Roll no.: "+roll);  
    System.out.println("Student name: "+name);  
    }
	
	public static void main(String[] args)
  {
	  System.out.println("static main method ");
	Student sobj = new Student();
	sobj.setName("ravi");
	sobj.setRoll(1230);
	sobj.display();
  }
 }  