create table t_ac (id bigint not null auto_increment, fan_mode integer, mode integer, modified datetime(6), temp integer not null, room_id bigint, primary key (id)) engine=InnoDB;
create table t_ambient (id integer not null, humidity double precision not null, modified datetime(6), temp double precision not null, room_id bigint, primary key (id)) engine=InnoDB;
create table t_room (id bigint not null auto_increment, name varchar(255), ambient_id integer, primary key (id)) engine=InnoDB;
alter table t_ac add constraint FKs0fwge3phdnbmv1jfibjv2ovb foreign key (room_id) references t_room (id);
alter table t_ambient add constraint FKe51xnyfs62eqw6rd1lhwq96q foreign key (room_id) references t_room (id);
alter table t_room add constraint FKhen4w7gili54hg72cdok0bp18 foreign key (ambient_id) references t_ambient (id);

    create table t_ac (
       id bigint not null auto_increment,
        fan_mode integer,
        mode integer,
        modified datetime(6),
        temp integer not null,
        room_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table t_ambient (
       id integer not null,
        humidity double precision not null,
        modified datetime(6),
        temp double precision not null,
        room_id bigint,
        primary key (id)
    ) engine=InnoDB;

    create table t_room (
       id bigint not null auto_increment,
        name varchar(255),
        ambient_id integer,
        primary key (id)
    ) engine=InnoDB;

    alter table t_ac 
       add constraint FKs0fwge3phdnbmv1jfibjv2ovb 
       foreign key (room_id) 
       references t_room (id);

    alter table t_ambient 
       add constraint FKe51xnyfs62eqw6rd1lhwq96q 
       foreign key (room_id) 
       references t_room (id);

    alter table t_room 
       add constraint FKhen4w7gili54hg72cdok0bp18 
       foreign key (ambient_id) 
       references t_ambient (id);
