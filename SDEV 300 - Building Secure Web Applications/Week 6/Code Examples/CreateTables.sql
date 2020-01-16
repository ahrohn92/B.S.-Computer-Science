use sdev;

-- Create a student table
CREATE TABLE Students (
PSUsername varchar(30) primary key,
FirstName varchar(30),
LastName varchar(30),
EMail varchar(60)
);

CREATE TABLE Courses(
CourseID int primary key,
CourseDisc varchar(4),
CourseNum varchar(4),
CourseTitle varchar(75)
);

CREATE TABLE StudentCourses (
StudentCourseID int primary key,
CourseID int references Courses(CourseID),
PSUsername varchar(30) references Students(PSUsername)
);