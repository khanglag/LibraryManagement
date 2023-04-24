use testdb
create table taikhoan(
	id varchar(20),
	password varchar(50),
	quyen varchar(10),
	tonTai int
);
INSERT INTO taikhoan (id, password, quyen, tonTai) VALUES ('admin', '123', '1', '1');