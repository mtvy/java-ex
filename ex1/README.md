sudo mysql --password
create database db;
create user 'user'@'%' identified by '123';
grant all on db.* to 'user'@'%';

./mvnw spring-boot:run



Request example:

curl http://localhost:8080/demo/add_user -d name=Matvei -d email=m.d.prudnik@gmail.com

Return value -> saved
