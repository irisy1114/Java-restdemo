create table address
(
    address_id int primary key,
    street     varchar(200),
    city       varchar(50),
    state      varchar(2),
    zip        varchar(10)
);

create table student
(
  student_id identity primary key,
  first_name varchar(100),
  last_name varchar(100),
  email varchar(100),
  gpa double,
  address_id int,
  date_enrolled timestamp
);

create table student_language (
  student_id int,
  language varchar(100)
);

alter table student add foreign key (address_id) references address(address_id);
alter table student_language add foreign key (student_id) references student(student_id);

create table book (
    book_id identity primary key,
    isbn varchar(20),
    title varchar(500),
    subtitle varchar(500),
    --author varchar(500),
    author_id int,
    publication_date timestamp,
    publisher varchar(250),
    page_count int,
    description varchar(4000),
    website varchar(4000)
);

create table author (
    author_id int primary key,
    name varchar(500),
    books_on_contract int,
    advance_per_book float
);