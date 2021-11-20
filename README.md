# Player Registration System
> The application is basketball
player registration for a basketball team. A Player can be added, deleted and
also all players in the system can be listed.

<p align="center">
  <a href="">
    <img src="https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square" />
  </a>
  <a href="https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/gittigidiyor-graduation-project-mGungorr/blob/main/LICENSE">
    <img alt="License: MIT" src="https://img.shields.io/badge/license-MIT-yellow.svg" target="_blank" />
  </a>
  <a href="">
    <img src="https://codecov.io/gh/kefranabg/readme-md-generator/branch/master/graph/badge.svg" />
  </a>
</p>

## 📋 Table of contents

- [✨ Preview](#demo-preview)
- [📥 Installation](#installation)
- <li><a href="#installation">Built With</a></li>
- [🚀 Usage](#usage)
- [⚙️ API Example](#contribute)
- [⚙️ Tech Stack](#contribute)

- [🤝 Contributing](#license)
- [⌨️ Author](#footer)
- [📝 License](#license)

## ✨ Preview

![graphiql](https://user-images.githubusercontent.com/80898514/142724647-2d771d7b-5cea-440c-8b7c-5a6b4644f83d.jpg)

![h2](https://user-images.githubusercontent.com/80898514/142724651-4643aab1-3958-4089-b140-713ec59aafa1.jpg)


## 📥 Installation
[(Back to top)](#table-of-contents)

Clone the repo

```sh
git clone https://github.com/Nevzatcs/player-app.git
```

On a separate terminal and since this is a maven project you just need to go to the root of the project and perform the command:
```
mvn clean install
```
or if you don't have installed maven on your OS

```
mvnw clan install
```


This will run the unit tests of the project and create the jar file.

## 🚀 Usage
[(Back to top)](#table-of-contents)

After having the jar file you can simply run:

```
java -jar target/player-app-0.0.1-SNAPSHOT.jar
```

Since this is a Spring Boot project, you can also run the project with below command;
```
mvn spring-boot:run
```

or if you don't have installed maven on your OS
```
mvnw spring-boot:run
```

The project will run on port 8080 (configured as default).


## ⚙️ GraphQL Example
Project is online in : https://sha-player-app.herokuapp.com/graphiql

Project is online in : https://sha-player-app.herokuapp.com/graphql (to make post requests)

Main application URL for local: `http://localhost:8080`



h2 Database URL for local: `http://localhost:8080/h2-console/`  

Application database is online in : https://sha-player-app.herokuapp.com/h2-console/  

(username: sa, password: // no password, db: playerdb)

#### Players
* Add New Player : 
``` mutation {
  createPlayer(player :{name:"Melih", surname:"Mahmutoğlu", position:"SG"}){
  id
  name
  surname
  position
  } 
  ```

* Show All Players: 
```
query{
    allPlayers{
        name
        surname
        position
    }
}
```

* Delete Player by ID : `
```
mutation{
    deletePlayer(id:1)
    }
```


* Player Positions
```
Player Positions
PG("Point guard"),
SG("Shooting guard"),
SF("Small forward"),
PF("Power forward"),
C("Center");
```

## ⚙️ Tech Stack

- Java 8
- Spring Boot
- Spring Web
- Lombok
- GraphQL
- Maven
- JPA / Hibernate
- H2 Database 
- MapStruct
- jUnit

[comment]: <> (## 📆 Release History)

[comment]: <> (* 0.2.1)

[comment]: <> (    * CHANGE: Update docs &#40;module code remains unchanged&#41;)

[comment]: <> (* 0.2.0)

[comment]: <> (    * CHANGE: Remove `setDefaultXYZ&#40;&#41;`)

[comment]: <> (    * ADD: Add `init&#40;&#41;`)

[comment]: <> (* 0.1.1)

[comment]: <> (    * FIX: Crash when calling `baz&#40;&#41;` &#40;Thanks @GenerousContributorName!&#41;)

[comment]: <> (* 0.1.0)

[comment]: <> (    * The first proper release)

[comment]: <> (    * CHANGE: Rename `foo&#40;&#41;` to `bar&#40;&#41;`)

[comment]: <> (* 0.0.1)

[comment]: <> (    * Work in progress)

## 🤝 Contributing
[(Back to top)](#table-of-contents)

1. Fork it (<https://github.com/Nevzatcs/player-app/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

## ⌨️ Author
[(Back to top)](#table-of-contents)

👤 **Nevzat Can Samur**

- Github: [@Nevzatcs](https://github.com/Nevzatcs)
- Linkedin: [@nevzatcansamur](https://www.linkedin.com/in/nevzatcansamur/)

## 📝 License
[(Back to top)](#table-of-contents)

Copyright © 2021.

This project is [MIT](https://github.com/Nevzatcs/player-app/blob/main/LICENSE) licensed.

---

This README was generated with ❤️ 
