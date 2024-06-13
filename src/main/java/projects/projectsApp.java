package projects;

import projects.dao.DbConnection;

public class projectsApp {

	public projectsApp() {
	}

	public static void main(String[] args) {
		DbConnection.getConnection(); // Test Connection
	}

}
