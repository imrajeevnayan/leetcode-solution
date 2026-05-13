select p.firstName,p.lastName,a.city,a.state From Person p
Left join Address a on p.personId=a.personId;