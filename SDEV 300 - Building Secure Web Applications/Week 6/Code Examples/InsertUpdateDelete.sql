-- Insert students
insert into Students 
values ('jsmith', 'John','Smith','jsmith@students.umuc.edu'); 

insert into Students 
values ('mjones', 'Mary','Jones','mjones@students.umuc.edu'); 

insert into Students 
values ('jparsons', 'Jeff','Parsons','jparsons@students.umuc.edu'); 

-- Insert Courses
insert into Courses 
values (1, 'SDEV','300','Secure Web Development'); 

insert into Courses 
values (2, 'SDEV','360','Secure Software LifeCycle'); 

-- Insert student courses
insert into StudentCourses
values (1,1,'jsmith');

insert into StudentCourses
values (2,1,'mjones');

-- Update the Student data
update Students set Email = 'john.smith@students.umuc.edu'
where PSUsername = 'jsmith';

update Students set Email = 'mary.jones@students.umuc.edu'
where PSUsername = 'mjones';

update Students set Email = 'jeff.parsons@students.umuc.edu'
where PSUsername = 'jparsons';

-- delete the Parsons record
delete from Students 
where PSUsername = 'jparsons';