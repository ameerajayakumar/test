package testbrowser;

import java.sql.SQLException;

import utilities.DbManager;

public class TestDBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		DbManager.setMysqlDbConnection();
		System.out.println(DbManager.getMysqlQuery("select name from selenium where id=2"));
	}

}
