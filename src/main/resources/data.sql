insert into version(id, name) values
(1, 'v1.0.0'),
(2, 'v1.1.0'),
(3, 'v1.2.0'),
(4, 'v2.1.0'),
(5, 'v2.2.0');
insert into severity(id, name) values
(1, 'high'),
(2, 'medium'),
(3, 'low');
insert into defect(id, name, creation_date, desription, severity_id) values
(1, 'Logical Defect', '2015-02-15','logical error', 1),
(2, 'Arithmetic Defect', '2016-09-19','arithmetic error', 2),
(3, 'Syntax Defect', '2016-12-02','syntax error', 3),
(4, 'Interface Defect', '2015-10-25','interface error', 3),
(5, 'Multithreading Defect', '2016-11-11','threading error', 2);
insert into defect_version (defect_id, version_id) values
(1,2),
(1,3),
(2,1),
(3,5),
(4,2),
(4,5),
(5,4);
