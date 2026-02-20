Select id,movies,description,rating
  From Cinema 
  where id%2=1 AND description <> 'boring' //Select the odd no and remove the boring movies 
  order by rating DESC; //Sorts tge result by rating from highest to lowest 
