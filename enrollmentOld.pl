% enrollment.pl : A Prolog program representing courses, students, and valid enrollment.
% 
% Team: Evan Mead, Jonas Hemmett

% define students
student(alvin).
student(betty).
student(dave).
student(diana).
student(florence).
student(mary).
student(simon).
student(theodore).

% define prerequisites
prereq(cs1640, [cs1210]).
prereq(cs2100, [cs1210]).
prereq(cs2210, [cs2100]).
prereq(cs2240, [cs2100]).
prereq(cs2250, [cs1640, cs2240]).
prereq(cs2300, [cs2100, cs2240]).

% define which classes have been completed and by whom
completed(alvin, [cs1210, cs2100, cs1640]).
completed(betty, [cs1210, cs2100, cs1640, cs2240, cs2250]).
completed(diana, [cs1210, cs2100, cs1640, cs2240]).
completed(florence, [cs1210, cs2100]).
completed(simon, [cs1210]).

all_completed(_, []).  % Base case: No prerequisites to check

% recusive case for all_completed
all_completed(Student, [Prereq | Rest]) :-
    completed(Student, Completed_Courses),
	member(Prereq, Completed_Courses),
	all_completed(Student, Rest).

% can_enroll function
can_enroll(Student, Course) :-
    student(Student),
    prereq(Course, Prereqs),
    all_completed(Student, Prereqs).
