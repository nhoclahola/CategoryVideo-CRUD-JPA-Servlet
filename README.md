# Category & Video Management

This project is a simple web application for managing categories and videos using Java Servlet, JSP, Hibernate ORM, and SiteMesh for templating. The project follows an MVC architecture and uses Maven for dependency management and MySQL as the database.

## Features
- **Manage Categories**:
  * Add, update, delete categories
  * List all categories
- **Manage Videos**:
  * Add, update, delete videos
  * List videos by category
- **Use of Hibernate for ORM to map Java objects to MySQL tables**.
- **Templating with SiteMesh to create consistent layouts across pages**.
- **MVC pattern with Servlets as controllers and JSP for the view layer**.
- **MySQL for persistent storage of categories and videos**.

## Technologies Used
- **Java Servlet & JSP**: For handling HTTP requests and rendering dynamic web pages.
- **Hibernate**: ORM framework for managing database interaction.
- **MySQL**: Relational database used for storing categories and videos.
- **SiteMesh**: Templating framework for managing layouts.
- **Maven**: For project build, dependency management, and lifecycle control.
- **Lombok** for reducing boilerplate code by automatically generating common methods like getters, setters, and constructors.

## Prerequisites
Before you begin, ensure you have the following installed:
- Java 11 or higher
- Apache Maven
- MySQL server
- Apache Tomcat

## Setup Instructions
### Step 1: Clone the repository
```bash
git clone https://github.com/nhoclahola/CategoryVideo-CRUD-JPA-Servlet.git
cd CategoryVideo-CRUD-JPA-Servlet
```

### Step 2: Configure the database
1. Install MySQL and create a database named category_video_management:
```sql
CREATE DATABASE category_video_management;
```

2. Update the database connection details in `src/main/resources/META-INF/persistence.xml`:
```xml
<property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/category_video_management<" />
<property name="jakarta.persistence.jdbc.user" value="your_db_username" />
<property name="jakarta.persistence.jdbc.password" value="your_db_password" />
```

### Step 3: Build and deploy the project
1. Package the project using Maven:
```bash
mvn clean package
```
2. Copy the generated WAR file to Tomcat's webapps folder.
3. Start your Tomcat server
- On Linux/macOS or Git Bash:
```bash
catalina.sh run
```
- On Windows:
```bash
catalina.bat run
```
4. Access the application by navigating to:
```bash
http://localhost:8080/your-war-file-name
```

## Demo
When you start application, Hibernate will generate tables and it's constraint:
![image](https://github.com/user-attachments/assets/4b3bbb4e-87f6-4807-b84e-1cdbb9bc177f)

At the beginning, you will start at Home page:
![image](https://github.com/user-attachments/assets/6bbc8ab0-786b-45f7-83e3-2837e7946543)

You can go to category management by click at **All categories**
![image](https://github.com/user-attachments/assets/77c30a74-970d-43bd-b594-a93635234c95)

Now it is empty because the database just has created, so we can click at **Add more Category** to create category
![image](https://github.com/user-attachments/assets/7d171cbe-db64-4dbd-a3ee-2a32ee3a475a)

There is a form to add a new category, you can add like bellow:
![image](https://github.com/user-attachments/assets/241d2d5a-ce05-4a05-a99c-d158a71dea66)
![image](https://github.com/user-attachments/assets/381c0229-fad1-4e34-b363-59bf5a061bec)
You can enter link or file, in case of both, it will give priority to file, or not, it will give priority to file. Or if you don't enter any, it will use default image which is avatar.png.

After adding category, you can see that appear at `admin/categories`
![image](https://github.com/user-attachments/assets/ac93903d-62a1-44a8-97a0-1107d9c308ed)

You can use Edit or Delete to update or remove a specific category. For example, Edit Category which has ID 1 by click at **Edit**:
![image](https://github.com/user-attachments/assets/5544a8eb-5f06-4569-9685-c9c5ecacedc6)

I will change image link to file:
![image](https://github.com/user-attachments/assets/cef4d922-6710-44c6-b319-230a08f2f7b2)
If you do not both import the file and link, it will keep the old image.

When you click at Category ID, you will be navigated to category info page:
![image](https://github.com/user-attachments/assets/b66911fe-066c-48d5-a90c-219849a2003a)
![image](https://github.com/user-attachments/assets/5674b140-7f9c-44c5-8159-4335b985c958)

At this page, you can add video poster for specific category by click "Add more video for this category".
![image](https://github.com/user-attachments/assets/385ac369-3939-4113-8a1c-c9d592af42d9)
It already has a category ID entered.
Then we can enter information of video like at adding category page:
![image](https://github.com/user-attachments/assets/3cd5dced-3b71-4e2b-928e-f1fcd99c2935)

It will navigate you back to category information page:
![image](https://github.com/user-attachments/assets/4a8162ab-d731-4595-a772-823160572b4f)

In other way, you can click at "All videos" in Home page, it will display all videos in the database:
![image](https://github.com/user-attachments/assets/d65c54fd-3764-4828-a7df-88371cf101cc)

You can also click at "Add more video" to add video, but this time, you must enter category ID manually:
![image](https://github.com/user-attachments/assets/5caa263d-c37a-4862-9b82-3b6c000af819)

If you enter wrong category ID, it will response a 404 page:
![image](https://github.com/user-attachments/assets/d1156f4f-3888-48ca-9646-0e7ab5eb5d65)








