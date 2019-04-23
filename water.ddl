alter table base.componentt drop foreign key FKcomponentt686716;
alter table base.componentt drop foreign key FKcomponentt755313;
alter table base.component_component drop foreign key FKcomponent_667221;
alter table base.component_component drop foreign key FKcomponent_494920;
alter table base.component_component drop foreign key FKcomponent_989797;
alter table base.fileblob drop foreign key FKfileblob552825;
alter table base.component_fileheader drop foreign key FKcomponent_670584;
alter table base.component_fileheader drop foreign key FKcomponent_100576;
drop table if exists base.langu;
drop table if exists base.component;
drop table if exists base.componentt;
drop table if exists base.component_component;
drop table if exists base.unit;
drop table if exists base.fileheader;
drop table if exists base.fileblob;
drop table if exists base.component_fileheader;
create table base.langu (
  id char(2) not null comment 'ISO 639-1:2002, Codes for the representation of names of languages  ', 
  primary key (id));
create table base.component (
  id int(10) not null auto_increment, 
  primary key (id));
create table base.componentt (
  componentid int(10) not null, 
  languid     char(2) not null, 
  title       varchar(50) not null, 
  description varchar(255), 
  primary key (componentid, 
  languid));
create table base.component_component (
  componentid  int(10) not null, 
  componentid2 int(10) not null, 
  quantity     float, 
  unitsymbol   char(3) not null, 
  primary key (componentid, 
  componentid2));
create table base.unit (
  symbol char(3) not null, 
  primary key (symbol));
create table base.fileheader (
  id   int(10) not null auto_increment, 
  name varchar(255), 
  primary key (id));
create table base.fileblob (
  fileheaderid int(10) not null, 
  bytes        blob not null, 
  primary key (fileheaderid));
create table base.component_fileheader (
  componentid    int(10) not null, 
  fileheaderid   int(10) not null, 
  primarypicture tinyint(1) default 1 not null comment 'true if primary picture of component', 
  primary key (componentid, 
  fileheaderid));
alter table base.componentt add constraint FKcomponentt686716 foreign key (componentid) references base.component (id);
alter table base.componentt add constraint FKcomponentt755313 foreign key (languid) references base.langu (id);
alter table base.component_component add constraint FKcomponent_667221 foreign key (componentid) references base.component (id);
alter table base.component_component add constraint FKcomponent_494920 foreign key (componentid2) references base.component (id);
alter table base.component_component add constraint FKcomponent_989797 foreign key (unitsymbol) references base.unit (symbol);
alter table base.fileblob add constraint FKfileblob552825 foreign key (fileheaderid) references base.fileheader (id);
alter table base.component_fileheader add constraint FKcomponent_670584 foreign key (componentid) references base.component (id);
alter table base.component_fileheader add constraint FKcomponent_100576 foreign key (fileheaderid) references base.fileheader (id);
insert into base.langu(id) values ('de');
insert into base.langu(id) values ('en');
insert into base.component(id) values (1);
insert into base.componentt(componentid, languid, title, description) values (1, 'de', 'Wasser', null);
insert into base.componentt(componentid, languid, title, description) values (1, 'en', 'Water', null);
insert into base.unit(symbol) values ('kg');
insert into base.unit(symbol) values ('g');
insert into base.unit(symbol) values ('mg');
