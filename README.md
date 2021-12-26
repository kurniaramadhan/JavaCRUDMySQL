# JavaCRUDMySQL
Simple Java console application with Create Reead Update Delete (CRUD) operation connect to MySQL
The program has few of features such as Login, Get All Data, Find Data By Email, Insert Data, Update Data, dan Delete Data.

## Project Structure
Structure of this project using Data Access Object (DAO) Design Pattern, where:
- package pojo contains all class model
- package dao contains all interface
- pakcage daoimpl contains all implementations of interface
- pakcage view contains all text based user interface

## Setting the Project
- This project has 2 branches main and master, you can change to branch master first
- Clone this project: https://github.com/kurniaramadhan/JavaCRUDMySQL.git
- Import database employee_management.sql to your DBMS (MySQL) using tools (I use PHP MyAdmin)
- Configure your connection to DB in org.itenas.oop.jdbc.utils DatabaseUtil.java
- Run FormLoginView.java first.
