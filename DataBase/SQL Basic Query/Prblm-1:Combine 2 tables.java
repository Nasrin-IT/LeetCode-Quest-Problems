Select 

p.firstname,
p.lastname,
a.city,
a.state,
From Person p //use Person table as a main source 
LEFT JOIN Address a //combine address table while keeping all person records
ON p.PersonId = a.PersonId //Matches rows Where personId is the same in both tables
