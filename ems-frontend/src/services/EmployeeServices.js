import axios from "axios";
import process from "process";

const REST_API_BASE_URL = "/api/employees";

console.log(REST_API_BASE_URL);
// Get all employees
export const listEmployees = () => axios.get(REST_API_BASE_URL);

// Create an employee
export const createEmployee = (employee) =>
  axios.post(REST_API_BASE_URL, employee);

// Get an employee by id
export const getEmployee = (employeeId) =>
  axios.get(REST_API_BASE_URL + "/" + employeeId);

// Update an employee
export const updateEmployee = (employeeId, employee) =>
  axios.put(REST_API_BASE_URL + "/" + employeeId, employee);

// Delete an employee
export const deleteEmployee = (employeeId) =>
  axios.delete(REST_API_BASE_URL + "/" + employeeId);
