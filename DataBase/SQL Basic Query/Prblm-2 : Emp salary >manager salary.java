Select e.name AS Employee 
  From Employee e
  JOIN Employee m //manager(same table again)
  ON e.managerID = m.ID //find the Employees manager
  where e.salary > m.salary //check employee earn more than manager
