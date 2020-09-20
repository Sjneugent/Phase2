# Phase2

# Requirements:

- Netbeans 8.2 with glassfish (Java EE version)
- Java 1.8.0_251
- Glassfish 4.1.1 (included with Netbeans)
- Enviornment setup with java
- Github installed
- MYSQL connector (included in download, just search for it).

# How to Get and Run the project:

## Fork the project:
- Go to: 'https://github.com/VTXRyder1300C/GroupTwoCapstone'
- Click on Fork in the top right

## Clone the Forked project:
```sh
- git clone https://github.com/username/repository.git
```
## Open Netbeans and open the project 

## Click on run and select glassfish as the server to run it on. 

# How to Contribute to the project:

- Navigate to the project folder (where project it to be stored) in CMD or a command line tool (I use visual Studio Code).
-Download the project
```sh
git clone https://github.com/username/repository.git
```

- Change directory into the project

```sh
CD BudgetProject (or project name)
```

- Sync the fork with the main repo
```sh
git remote add upstream
git fetch upstream...
```

- Check for updates
```sh
git checkout
```
- Make a new feature
```sh
git checkout -b feature/<feature_name> (remove the <>)
```
- Develop all changes and commit them

```sh
git add .
git commit -m "description"
```

- Push the new feature/feature_name to the forked repo
```sh
git push --set-upstream origin feature/<feature_name>
```

- Go into GIT hub and submit a pull request for it to be applied to the project 


# View/Manage database (The database is stored on your machine.  Only you have access to it): 

1- Open Netbeans

2- Click on Services (Normally located at the top left of the screen, next to the Projects tab)

3- Click on jdbc:derby://localhost.../contact [nbuser]

4- Username and password should be nbuser (default)

5- Run SQL commands 

