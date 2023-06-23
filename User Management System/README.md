# Welcome to User Management Service README File :wave:


## Framework Used
___
```bash
 Springboot
```

## Language Used
___
```bash
 Java
```

# :office: DataFlow of the program 
<br>

## Model
___
> In the model Package we have given all the entities such as ( userId , user , userName , userAddress , userContact ) of the user in an entity class.

## Controller
___
> In the controller package we have created a class file userController to create apis of the functions we have to perform and also created the functions to perform the given tasks but controller takes help of the userService class to perform the tasks as it reduces high coupling in the code.

    
## Service
___
> In the service package we have created a class file userService to perform the given tasks and returning the output to controller. Service also takes help of userRepository class to perform the task and fetch the output from it and it makes it more less coupled.


## Repository
___
> In the repository package we have created a class file userRepository to perform the given tasks and returning the output to service. Repository have the Data List of users and it perform all the task and give output to service class.


## Summary
___
This is a README file for explain the details about the project. This is a User Management System project which is used to manage user of a organization. In this project we can perform the following functions given below :-

* Create a User.
* Fetch the details of all users.
* Fetch the details of a single user.
* Update the details of the user.
* Delete a user.


## :frowning_man: Author
___
Rahul Chaurasiya
* Github : [@rahul79990](https://github.com/rahul79990/Assignments)


## :handshake: Contributing
___
Contributions, issues & feature requests are  welcome!

Feel free to contact me at the above github link.

## Show your Support
___
Give a :keycap_ten: if you liked this project.

## :memo: License
___
Copyright :copyright: Geekster FS 10 Batch.

This project is licensed for Geekster.

___
This README was generated with :heart: by Rahul Chaurasiya