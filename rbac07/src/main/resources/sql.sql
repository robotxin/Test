create database company;

drop table if exists TBL_User;
create table TBL_User (
user_id bigint not null primary key auto_increment  comment '用户id' ,
user_account varchar(200) not null comment '用户账号名称',
password char(200) not null comment '密码',
user_nickname varchar(200) not null comment '用户昵称',
creat_time timestamp not null default now() comment'用户创建时间',
modify_time timestamp comment'用户修改时间',
user_status char not null default '0' comment '全局参数状态，0:未启用，1:已启用'
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

insert into TBL_permission(permission_id,permission_name) values(1,'一级权限');
insert into TBL_permission(permission_id,permission_name) values(2,'二级权限');
insert into TBL_permission(permission_id,permission_name) values(3,'三级权限');
insert into TBL_permission(permission_id,permission_name) values(4,'修改密码权限权限');
update tbl_permission set permission_name='查看个人信息权限' where permission_id=1;
update tbl_permission set permission_name='更改人员角色' where permission_id=2;
update tbl_permission set permission_name='更改角色权限' where permission_id=3;
update tbl_permission set permission_name='修改密码权限' where permission_id=4;

drop table if exists TBL_role_permission;
create table TBL_role_permission(
user_permission bigint not null primary key auto_increment comment '角色权限id',
role_id bigint not null  comment '角色id',
permission_id bigint not null comment '权限id'
);

insert into TBL_role_permission(role_id,permission_id) values(3,1);
insert into TBL_role_permission(role_id,permission_id) values(3,2);
insert into TBL_role_permission(role_id,permission_id) values(3,3);
insert into TBL_role_permission(role_id,permission_id) values(2,1);
insert into TBL_role_permission(role_id,permission_id) values(1,1);
insert into TBL_role_permission(role_id,permission_id) values(1,2);
insert into TBL_role_permission(role_id,permission_id) values(4,4);

drop table if exists TBL_User_role;
create table TBL_User_role(
user_role bigint not null primary key auto_increment comment '用户角色id',
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
select role_name,permission_name from TBL_Role,TBL_permission,TBL_role_permission where TBL_Role.role_id = TBL_role_permission.role_id and TBL_role_permission.permission_id = TBL_permission.permission_id;
select * from TBL_User;
select * from TBL_Role;
select * from TBL_permission;
select * from TBL_User_role;