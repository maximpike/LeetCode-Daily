SELECT unique_id, name
FROM EmployeeUNI
FULL OUTER JOIN Employees
    ON EmployeeUNI.id = Employees.id
WHERE Employees.name IS NOT NULL;