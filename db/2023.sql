insert into user_mst
values (0, 'aaa', '1234', '김준일', 'aaa@gamil.com');

select * from user_mst;

insert into role_mst
values (0, 'ROLE_USER'),
		(0, 'ROLE_MANAGER'),
		(0, 'ROLE_USER');
        
select * from role_mst;

role_dtlrole_dtlinsert into role_dtl
values
	(0, 1, 1),
	(0, 2, 1),
	(0, 3, 1);

select * from role_dtl;

select
	um.email,
    rd.role_id,
    rm.role_name
from
	user_mst um
		left outer join role_dtl rd on(rd.user_id = um.user_id)
        left outer join role_mst rm on(rm.role_id = rd.role_id)
    
    
    
    
	
    

