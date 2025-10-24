package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	public Controller createController(String command) {
		Controller controller = null;
		
		switch(command) {
		case "main":
			controller = new SelectAllStudentController();
			break;
		case "delete":
			controller = new DeleteStudentController();
			break;
		case "insertView":
			controller = new InsertStudentViewController();
			break;
		case "insertStudent":
			controller = new InsertStudentController();
			break;
		case "updateView":
			controller = new UpdateStudentViewController();
			break;
		case "updateStudent":
			controller = new UpdateStudentController();
			break;
		}
		
		return controller;
	}
	
	
	
}




