package oopWithNLayeredApp.core.loging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Database logged : " + data);
	}

}
