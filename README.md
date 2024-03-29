# Chat Application using Java, Spring Boot, and WebSocket

## Overview
This is a simple chat application built with Java, Spring Boot, and WebSocket. It allows users to communicate with each other in real-time through a web interface.

## Features
- Real-time messaging: Messages are delivered instantly to connected clients using WebSocket.
- User authentication: Users can register, log in, and log out securely.
- User presence: Users can see who is sending the message by their register name.

## Technologies Used
- Java
- Spring Boot
- WebSocket
- REST API
- MySQL

## Setup
1. **Clone the repository**:
   ```bash
   git clone  https://github.com/shivgopal07/Bansira-Tech-Round.git
   cd Bansira-Tech-Round
2. After cloning it, open it in your fav IDE and run the Spring Boot Application
3. You can login and register the user and chat simulate into it.

## API :
- http://localhost:8081/live/users/register         (For Register the user)
- http://localhost:8081/live/users/login            (For Login into the server)
- http://localhost:8081/live/chat/send              (For send the chat/message)
- http://localhost:8081/live/chat/topic/messages    (For the subscribed/specified person)

## Database Connection :
- I use MySQL database to store the user and chat
- Add dependecy in pom.xml for the MySQL connection as
- Also add the properties in the resoures.

## Contributer :
- Shiv Gopal Verma

  
