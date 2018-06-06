

drop table if exists TBL_User;
create table TBL_User (
user_id bigint not null primary key auto_increment  comment '用户id' ,
user_account varchar(200) not null comment '用户账号名称',
password char(200) not null comment '密码',
user_nickname varchar(200) not null comment '用户昵称'
);

insert into TBL_User (User_id,user_account,user_nickname,password) values (1,'admin','张三' ,'admin');
insert into TBL_User (User_id,user_account,user_nickname,password) values (2,'clerk','李四', 'clerk');
insert into TBL_User (User_id,user_account,user_nickname,password) values (3,'manager','王五', 'manager');

drop table if exists TBL_Role;
create table TBL_Role(
role_id bigint not null primary key auto_increment comment '角色id',
role_name varchar(100) not null comment '角色名称'
);
insert into TBL_Role(role_id,role_name) values(1,'管理员角色');
insert into TBL_Role(role_id,role_name) values(2,'职员角色');
insert into TBL_Role(role_id,role_name) values(3,'经理角色');
insert into TBL_Role(role_id,role_name) values(4,'共有角色');

drop table if exists TBL_permission;
create table TBL_permission(
permission_id bigint not null primary key auto_increment comment '权限id',
permission_name varchar(100) not null comment '权限名称'
);

insert into TBL_permission(permission_id,permission_name) values(1,'查看员工表');
insert into TBL_permission(permission_id,permission_name) values(2,'查看角色表');
insert into TBL_permission(permission_id,permission_name) values(3,'查看权限表');
insert into TBL_permission(permission_id,permission_name) values(4,'查看用户角色表');
insert into TBL_permission(permission_id,permission_name) values(5,'查看角色权限表');
insert into TBL_permission(permission_id,permission_name) values(6,'修改员工表');
insert into TBL_permission(permission_id,permission_name) values(7,'修改角色表');
insert into TBL_permission(permission_id,permission_name) values(8,'修改权限表');
insert into TBL_permission(permission_id,permission_name) values(9,'修改用户角色表');
insert into TBL_permission(permission_id,permission_name) values(10,'修改角色权限表');
insert into TBL_permission(permission_id,permission_name) values(11,'修改昵称和密码');
update tbl_permission set permission_name='查看员工表' where permission_id=1;
update tbl_permission set permission_name='查看角色表' where permission_id=2;
update tbl_permission set permission_name='查看权限表' where permission_id=3;
update tbl_permission set permission_name='修改员工表' where permission_id=4;

drop table if exists TBL_role_permission;
create table TBL_role_permission(
user_permission_id bigint not null primary key auto_increment comment '角色权限id',
role_id bigint not null  comment '角色id',
permission_id bigint not null comment '权限id'
);

insert into TBL_role_permission(role_id,permission_id) values(1,1);
insert into TBL_role_permission(role_id,permission_id) values(1,2);
insert into TBL_role_permission(role_id,permission_id) values(1,3);
insert into TBL_role_permission(role_id,permission_id) values(1,4);
insert into TBL_role_permission(role_id,permission_id) values(1,5);
insert into TBL_role_permission(role_id,permission_id) values(1,6);
insert into TBL_role_permission(role_id,permission_id) values(1,7);
insert into TBL_role_permission(role_id,permission_id) values(1,8);
insert into TBL_role_permission(role_id,permission_id) values(1,9);
insert into TBL_role_permission(role_id,permission_id) values(1,10);
insert into TBL_role_permission(role_id,permission_id) values(2,1);
insert into TBL_role_permission(role_id,permission_id) values(3,1);
insert into TBL_role_permission(role_id,permission_id) values(3,2);
insert into TBL_role_permission(role_id,permission_id) values(3,3);
insert into TBL_role_permission(role_id,permission_id) values(3,4);
insert into TBL_role_permission(role_id,permission_id) values(3,5);
insert into TBL_role_permission(role_id,permission_id) values(4,11);

drop table if exists TBL_User_role;
create table TBL_User_role(
user_role_id bigint not null primary key auto_increment comment '用户角色id',
user_id bigint not null  comment '用户id',
role_id bigint not null comment '角色id'
);

insert into TBL_User_role(user_id,role_id) values(1,4);
insert into TBL_User_role(user_id,role_id) values(1,1);
insert into TBL_User_role(user_id,role_id) values(2,2);
insert into TBL_User_role(user_id,role_id) values(2,4);
insert into TBL_User_role(user_id,role_id) values(3,3);
insert into TBL_User_role(user_id,role_id) values(3,4);


drop table if exists TBL_LOG;
create table TBL_LOG(
user_nickname varchar(200) not null comment '用户昵称',
log_time timestamp default now() comment'系统时间',
log number(24) not null comment'系统日志'
);
//查询用户昵称，账号，角色，权限相对应
select user_nickname,user_account,role_name,permission_name from TBL_User,TBL_Role,TBL_permission,TBL_role_permission,TBL_User_role where TBL_User.user_id = TBL_User_role.user_id and TBL_Role.role_id = TBL_User_role.role_id and TBL_Role.role_id = TBL_role_permission.role_id and TBL_role_permission.permission_id = TBL_permission.permission_id ;
//显示用户昵称，账号和角色相对应
select user_nickname,user_account,group_concat(role_name) from TBL_User,TBL_Role,TBL_User_role where TBL_User.user_id = TBL_User_role.user_id and TBL_Role.role_id = TBL_User_role.role_id group by user_nickname;
select user_nickname,user_account,group_concat(role_name) from TBL_User left join TBL_Role on TBL_User.user_id = TBL_User_role.user_id left join TBL_User_role on TBL_Role.role_id = TBL_User_role.role_id;
select (user_nickname,user_account) from (TBL_User) left join TBL_User_role on TBL_Role.role_id = TBL_User_role.role_id left join (select) on TBL_User.user_id = TBL_User_role.user_id;
//显示权限和角色相对应
select user_permission_id,role_name,TBL_Role.role_id,permission_name,TBL_permission.permission_id from TBL_Role,TBL_permission,TBL_role_permission where TBL_Role.role_id = TBL_role_permission.role_id and TBL_role_permission.permission_id = TBL_permission.permission_id order by user_permission_id;
select * from TBL_User;
select * from TBL_Role;
select * from TBL_permission;
select * from TBL_User_role;
select * from TBL_role_permission;

		select user_role_id,user_account,TBL_Role.role_id,role_name,TBL_User.user_id from
		 TBL_User,TBL_Role,TBL_User_role where
		  TBL_User.user_id = TBL_User_role.user_id and
		   TBL_Role.role_id = TBL_User_role.role_id;