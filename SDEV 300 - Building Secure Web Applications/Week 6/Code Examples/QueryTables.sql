-- Select all records and columns
select * from Students;

select * from Courses;

select * from StudentCourses;

-- Use the Where clause
select Email from Students
where PSUsername = 'jsmith';

select * from Courses
where CourseDisc Like ('SD%');

select PSUsername from StudentCourses
where CourseID = 1;

-- Order by
select * from Students
Order by LastName;

select * from StudentCourses
order by CourseID;

-- Joins to get more details
select A.PSUsername, CourseDisc from
StudentCourses A, Courses B, Students C
where A.PSUsername =C.PSUsername
and A.CourseID = B.CourseID;

select A.PSUsername, CourseDisc,CourseNum, CourseTitle from
StudentCourses A, Courses B, Students C
where A.PSUsername =C.PSUsername
and A.CourseID = B.CourseID
order by B.CourseID,A.PSUsername;

