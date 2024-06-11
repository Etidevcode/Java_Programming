package com.etienne;

import java.sql.*;

public class Main {

	public static final String DB_NAME = "testdb";
	public static final String TABLE_CONTACTS = "contacts";
	public static final String COLUMN_NAME = "name";
	public static final String COLUMN_PHONE = "phone";
	public static final String COLUMN_EMAIL = "email";
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "etienne";
	private static final String DB_PASSWORD = "root";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	// "jdbc:mysql://localhost:3306/jdbcdb?useSSL=false&verifyServerCertificate=false&serverTimezone=UTC";
	private static Connection connection = null;


	public static void main(String[] args) {


			try{
				Class.forName(DB_DRIVER_CLASS);
				connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
				//connection.setAutoCommit(false);
				Statement st = connection.createStatement();

				/**
				 *  Create And Drop Table
				 */

				st.execute("drop table if exists " + TABLE_CONTACTS);
				st.execute("create table if not exists " + TABLE_CONTACTS +
						" (" + COLUMN_NAME + " text, " +
						COLUMN_PHONE + " integer, " +
						COLUMN_EMAIL + " text" +
						")");

				/**
				 *  Insertion
				 */

				/*st.execute("insert into contacts (name, phone, email) " +
						"values('Mony', 87654321, 'mony@email.com.au')");
				st.execute("insert into contacts (name, phone, email) " +
						"values('Steve', 6542387, 'steve@mail.com')");
				st.execute("insert into contacts (name, phone, email) " +
						"values('Brian', 6789258, 'brian@mail.com')");*/

				/*st.execute("insert into " + TABLE_CONTACTS +
						" (" + COLUMN_NAME + ", " +
						COLUMN_PHONE + ", " +
						COLUMN_EMAIL +
						" ) " +
						"values('cathy', 623123, 'cathy.mail.com')");

				st.execute("insert into " + TABLE_CONTACTS +
						" (" + COLUMN_NAME + ", " +
						COLUMN_PHONE + ", " +
						COLUMN_EMAIL +
						" ) " +
						"values('marc', 615283, 'marc.mail.com')");

				st.execute("insert into " + TABLE_CONTACTS +
						" (" + COLUMN_NAME + ", " +
						COLUMN_PHONE + ", " +
						COLUMN_EMAIL +
						" ) " +
						"values('antoine', 6999555, 'antoine.mail.com')");

				st.execute("insert into " + TABLE_CONTACTS +
						" (" + COLUMN_NAME + ", " +
						COLUMN_PHONE + ", " +
						COLUMN_EMAIL +
						" ) " +
						"values('sebastien', 6333388, 'sebastien.mail.com')");*/

				insertContact(st, "cathy", 623123, "cathy.mail.com");
				insertContact(st, "marc", 615283, "marc.mail.com");
				insertContact(st, "antoine", 6999555, "antoine.mail.com");
				insertContact(st, "martine", 6045006, "martine@anywhere.com");
				insertContact(st, "sebastien", 6333388, "sebastien.mail.com");

				/**
				 *  Update and Delete
				 */

				/*st.execute("update contacts set phone = 6626961 where name='brian'");
				st.execute("delete from contacts where name='Mony'");*/

				st.execute("update " + TABLE_CONTACTS + " set " + COLUMN_PHONE + "= " +
						"5566789" +  " where " + COLUMN_NAME + "='antoine'");
				st.execute("delete from " + TABLE_CONTACTS + " where " + COLUMN_NAME + "='cathy'");


				/**
				 *  Query and ExecuteQuery
				 */

				// st.execute("SELECT * FROM contacts");
				// ResultSet rs = st.getResultSet();

				ResultSet rs = st.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
				while (rs.next()) {
					System.out.println(

							rs.getString(COLUMN_NAME) + " " + rs.getString(COLUMN_PHONE) + " " + rs.getString(COLUMN_EMAIL)
					);
				}

				rs.close();
				st.close();
				connection.close();

			} catch (SQLException | ClassNotFoundException e) {
				System.out.println("Something went wrong " + e.getMessage());
				e.printStackTrace();
			}
		}

		private static void insertContact(Statement st, String name, int phone, String email) throws SQLException {

			st.execute("insert into " + TABLE_CONTACTS +
					" (" + COLUMN_NAME + ", " +
					COLUMN_PHONE + ", " +
					COLUMN_EMAIL +
					" ) " +
					"values('" + name + "', " + phone + ", '" + email + "')");
		}

	}
