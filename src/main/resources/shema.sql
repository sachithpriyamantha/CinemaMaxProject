
CREATE TABLE IF NOT EXISTS Users(
    id int PRIMARY KEY UNIQUE,
    username varchar(255) check (length(username)> 5) not null ,
    password varchar(255) check ( length(password) > 8 ) not null ,
    phone_number varchar(10) not null,
    email varchar(255) not null unique,
    whois varchar(255) not null

);

CREATE TABLE IF NOT EXISTS seat(
    seat_no int primary key ,
    status boolean not null,
    user_id int not null
);


CREATE TABLE if not exists seats(
    seat_id int primary key not null,
    seat_no int not null ,
    status boolean not null,
    user_id int not null,
    movie_id int not null ,
    CONSTRAINT fk_seat foreign key (user_id) references Users(id),
    CONSTRAINT fk_movie foreign key (movie_id) references movies(id)
);

CREATE TABLE IF NOT EXISTS Mail(
    mail_id int primary key not null,
    type varchar(255) not null ,
    content varchar(255) not null,
    user_id int,
    CONSTRAINT fk_mail foreign key (user_id) references  Users(id)
);

CREATE TABLE IF NOT EXISTS payments(
    payment_id int primary key not null ,
    amount int not null ,
    pay varchar(255) not null ,
    user_id int,
    CONSTRAINT fk_payments foreign key (user_id) references Users(id)
);

CREATE TABLE IF NOT EXISTS Cookies(
    id int primary key not null ,
    name varchar(255) not null
);

Create Table IF NOT EXISTS feedback(
    id int primary key unique ,
    name varchar(255) not null,
    email varchar(255) not null ,
    message varchar(255) not null ,
    user_id int,
    CONSTRAINT fk_feedback foreign key (user_id) references Users(id)
);

CREATE TABLE IF NOT EXISTS contact(
    id int primary key unique ,
    name varchar(255) not null ,
    email varchar(255) not null ,
    phone_number varchar(255) not null ,
    message varchar(255) not null ,
    user_id int ,
    CONSTRAINT fk_contact foreign key (user_id) references Users(id)
);
