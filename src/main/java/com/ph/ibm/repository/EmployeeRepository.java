
package com.ph.ibm.repository;

import java.sql.BatchUpdateException;
import java.sql.SQLException;

import com.ph.ibm.model.Employee;
import com.ph.ibm.model.EmployeeUpdate;

/**
 * Data Access Object to employee table
 */
public interface EmployeeRepository {

	/**
	 * This method is used to insert fields into employee table
	 * 
	 * @param employee
	 * @return boolean
	 * @throws BatchUpdateException
	 * @throws SQLException
	 */
	public boolean addData(Employee employee) throws BatchUpdateException, SQLException;

	/**
	 * This method is used to update fields from employee table
	 * 
	 * @param employee
	 * @return boolean
	 * @throws SQLException
	 */
	public boolean registerEmployee(Employee employee) throws SQLException;

	/**
	 * This method is used to select field from employee table
	 * 
	 * @param username
	 * @param password
	 * @return boolean
	 * @throws SQLException
	 */
	public Employee loginAdmin(String username, String hashed) throws SQLException;

	/**
	 * This method is used to select field from employee table
	 * 
	 * @param username
	 * @param password
	 * @return boolean
	 * @throws SQLException
	 */
	public Employee loginUser(String username, String hashed) throws SQLException;

	/**
	 * This method is used to select field from employee table
	 * 
	 * @param companyId
	 * @return String
	 * @throws SQLException
	 */
	public String viewEmployee(String employeeIdNumber) throws SQLException;

	/**
	 * This method is used to select field from employee table
	 * 
	 * @param companyIDNumber
	 * @param email
	 * @return boolean
	 * @throws SQLException
	 */
	public boolean doesEmployeeExist(String employeeIdNumber, String email) throws SQLException;

	/**
	 * This method is used to select fields from employee table
	 * 
	 * @param employeeIdNumber
	 * @return EmployeeUpdate Object
	 * @throws SQLException
	 */
	public EmployeeUpdate searchEmployee(String employeeIdNumber) throws SQLException;

	/**
	 * This method is used to update fields from employee table
	 * @param employeeUpdate
	 * @return boolean
	 * @throws SQLException
	 * @throws BatchUpdateException
	 */
	public boolean updateEmployee(EmployeeUpdate employeeUpdate) throws SQLException, BatchUpdateException;
	
}
