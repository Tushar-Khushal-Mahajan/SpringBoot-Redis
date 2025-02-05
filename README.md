
# Redis with Spring Boot
#### Basic CRUD Api 

 This API will allow users to perform Create, Read, Update, and Delete operations efficiently. Redis, being an in-memory data store, ensures fast data access and is ideal for caching and temporary data storage. The project demonstrates how to integrate Spring Boot with Redis, manage data persistence, and optimize performance for high-speed applications.

## Authors

- [@Tushar](https://github.com/Tushar-Khushal-Mahajan)


## Tech Stack

**Server:** Java, Redis

**Client:** Postman

## Installation Guide


### *Install Redis*
    
for mac 
```
https://redis.io/docs/latest/operate/oss_and_stack/install/install-redis/install-redis-on-mac-os/
```

for Windows
```
https://github.com/microsoftarchive/redis/releases
```

for Linux
```
https://redis.io/docs/latest/operate/oss_and_stack/install/install-redis/install-redis-on-linux/
```

### *Install my-project*

#### 1.Clone the Project
Open a terminal or command prompt and run the following command:
```bash
  git clone <repository_url>
```
#### 2. Open the Project in an IDE
- ***IntelliJ IDEA:***

  - Open IntelliJ IDEA.
  - Click on File → Open.
  - Select the cloned project folder and click OK.
  - Wait for the project to load.

- ***Eclipse:***

  - Open Eclipse.
  - Click on File → Import.
  - Choose Existing Maven Projects.
  - Browse to the cloned project folder.
  - Click Finish.

#### 3. Run Redis:
  - for Linux and Mac follow official doc.
  - for window run redis-server.exe file.

#### 4. Change the host and port
  - In application.properties file change host and port accourding to your redis server, most in case this is same.

#### 5. Update Maven Dependencies
- ***Using IntelliJ IDEA***

  - Open the Maven tab (View → Tool Windows → Maven).
  - Click on Reload All Maven Projects.

- ***Using Eclipse***

  - Right-click the project → Select Maven → Update   Project.
  - Check Force Update of Snapshots/Releases.
  - Click OK.

#### 6. Run the application
- ***Using IntelliJ IDEA***

  - Open the main class (e.g., Application.java).
  - Click the Run button or press Shift + F10.

- ***Using Eclipse***

  - Right-click the main class (Application.java).
  - Select Run As → Spring Boot App. 
## API Reference

#### Get all users

```http
  GET /user
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `-` | `-` | `-` |

#### Get single user

```http
  GET /user/${userId}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `userId`      | `string` | **Required**. Id of item to fetch |


#### Save user

```http
  POST /user
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `user`      | `JSON` | **Required**. User to save |

#### Update user

```http
  PUT /user/${userId}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `userId`      | `string` | **Required**. userId to update user |
| `user`      | `JSON` | **Required**. User with updated info |


#### Delete user

```http
  DELETe /user/userId
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `userId`      | `string` | **Required**. User to delete user |

## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://tushar-portfolio.great-site.net/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/tushar-fullstack-dev/)
[![instagram](https://img.shields.io/badge/instagram-1DA1F2?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/_m.tushar_)

