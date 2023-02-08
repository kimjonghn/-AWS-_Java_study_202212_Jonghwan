show variables like 'AUTOCOMMIT';
set autocommit = 0;

start transaction;

savepoint sp4;

insert into user_mst
values(0, 'iii', '1234', '김준일', 'iii@gamil.com');

select * from user_mst;

rollback to sp4;

commit;