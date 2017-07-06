If you are developing an Android application, you will likely need to store data somewhere. You may choose a Cloud service (in which case, using a SyncAdapter would be a good idea), or to store your data in the embedded SQLite database. 
If you take the second option, you will have to decide between writing SQL queries, using a Content Provider (useful if you want to share your data with other apps), or using an ORM.
In this article, I will discuss some of the Android ORMs you may consider using in your application.


One way of making data persistence on Android with SQLite database easier is to use a technique called ORM (Object-relational mapping).
 Several Android ORM database libraries exist, simplifying the database-related boilerplate code to a minimum and abstracting the relational database operations for the developer


ActiveAndroid
What is ActiveAndroid Library?
It is an android library which allows you to perform SQLite Database operations without writing even a single SQL statement.
The best thing of using this library for SQLite operation in your application is it will simplify the SQLite operation. You don’t need to write SQL statements. And you can perform SQLite operations very easily.

https://www.simplifiedcoding.net/sqlite-crud-example-in-android-activeandroid/
