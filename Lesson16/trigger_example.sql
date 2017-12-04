DELIMITER $$
CREATE TRIGGER before_employee_update 
    BEFORE UPDATE ON employees
    FOR EACH ROW
BEGIN
    INSERT INTO employees_audit (`action`, `employeeNumber` , `lastname`, `changedate`)
    VALUES ('update', OLD.employeeNumber, OLD.lastname, changedat = NOW()); 
END$$
DELIMITER ;