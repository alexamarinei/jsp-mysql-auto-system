# jsp-mysql-auto-system

# Project Overview

## Java Files
The first part of the project consists of **Java files**. These files are used to test the communication between **SQL and Java**. You can check whether the connection is successfully established.

## Web Application Structure
The **webapp** contains two parts of files with the `.jsp` file extension:

### Front-End (`_` Prefixed Files)
- Files that start with an **underscore (`_`)** represent the **front-end part** of the application.

### Back-End (Functional Files)
- The **backend functionality** is handled by `.jsp` files without an underscore, such as `addClient.jsp`.
- These files process form submissions and interact with the database.
- The **form action** in the front-end references these backend files.
- Inside these backend files, there is a **try-catch block** that attempts to connect to the database.
  - If the connection is successful, data is sent and stored in the database.
  - If the connection fails, an error is handled properly.



