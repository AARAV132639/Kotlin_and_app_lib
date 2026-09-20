# Details in context to Array Based Contact Manager

## Project Structure

ContactManager/
|
|---Contant.java
|--ContactRepository.java
|--ContactManager.java
|--Main.java

## Responsibilities of each:

Main
|
| user interaction
|
ContactManager
|
| Business logic
|
ContactRepository
|
| data storage
|
ArrayList<Contact>

## File Description

### Contact.java
- Represents the data/model
- Knows nothing about: Scanner, menus, ArrayList, searching, application logic
- Only represents a contact
- That is *seperation of concerns*

### ContactRepository.java
- Component responsible for storing and retrieving contacts.
- The manager now doesn't know how contacts are stored.
- In later phase the ArrayList can be replaced with: Hashmap---> Database ---> MySQL ---> REST API

### ContactManager 
- Doesn;t know about I/P
- It doesn't care whether the user is interacting through: CLI, Android app, Web application, REST API
- It only handles the application's business
- Only handles the apllication's business operations

## Whole file not yet compiling