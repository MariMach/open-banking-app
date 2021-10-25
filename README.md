# Better Banking


### Build:

    ./gradlew build

### Startup:

    ./gradlew bootRun

### Run Tests:

    ./gradlew tests
    
    

### Spinning MySQL Database with Docker

docker run --name mysql-instance -p 3306:3306 -e MYSQLROOTPASSWORD=my-secret-pw mysql

docker ps

docker stop container_name / to kill a running container

docker exec -it  mysql-container bash

root@398796293e11:/# mysql -u root -pmy-secret-pw

mysql> create database mydb;

mysql> use mydb;

mysql> SHOW TABLES;


mysql> SELECt user FROM mysql.user;

mysql> show databases;