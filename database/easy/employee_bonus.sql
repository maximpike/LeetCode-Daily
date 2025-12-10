SELECT name, bonus
FROM Employee
FULL OUTER JOIN Bonus
    ON Employee.empId = Bonus.empId
WHERE Bonus.bonus < 1000 OR Bonus.bonus IS NULL