create table tbl_customer (ws_ssn number(9) ,ws_cust_id number(9) primary key,ws_name varchar2(50),ws_adrs varchar2(100),ws_age number(3));
drop table tbl_customer;
create table tbl_account(ws_cust_id number(9),ws_acct_id number(9),ws_acct_type varchar2(2),ws_acct_balance number(10),ws_acct_crdate date ,ws_acct_lasttrdate date,ws_acct_duration number(10), primary key(ws_cust_id,ws_acct_id) ,foreign key(ws_cust_id) references tbl_customer(ws_cust_id ));

create table tbl_user (firstname varchar2(50),lastname varchar2(50),userid varchar2(50),password varchar2(20));
insert into TBL_USER (firstname,lastname,userid,password) values('Gopika','Vinod','gopika123','Gopika@123');
select * from tbl_customer;
 select * from users where username='gopika123' AND password='g123'
 
 select * from tbl_customer where ws_cust_id='1234'  ;
 delete ws_age from TBL_CUSTOMER where ws_cust_id='1234';
 Delete * from tbl_customer where ws_cust_id='1234' ;
 Update tbl_customer set ws_name='abc',ws_adrs='ggg',ws_age='34' where ws_cust_id='123';
 
