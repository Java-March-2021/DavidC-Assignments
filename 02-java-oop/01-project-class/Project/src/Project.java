
public class Project {
	public String name;
	public char spacer;
	public String description;

	
	//Constructor
	public Project(String name, char spacer, String description){
		this.name = name;
		this.description = description;
	}


	public String getName(){
		return this.name;
	}
	public char getSpacer() {
		return spacer;
	}
	public String getDescription(){
		return this.description;
	}
	public void setName(String name) {
		this.name = name;
		}
	public void setDescription(String description) {
		this.description = description;
	}
	public String ElevatorPitch() {
		return String.format(name, ":", description);
	}
}





	

	
	
//	
//	String elevatorPitch(name, description);
//	return String.format(name, description);
//	System.out.println(name, description);

//getters and setters
