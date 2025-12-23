# Progetto-PD
## What is it?
**Progetto-PD** is the Distributed programming course project on Lost&amp;Found it Services. 
The project consists of:
- Bean Project
- EJB Client Project
- JMS Client Project
- WS Client Project

The EJB Client project contains the client that invokes the remote interface by performing a lookup. The JMS Client project contains the JMS client that takes an ID as input, defines the connection factory and destination, creates the context, creates the Producer, and sends an asynchronous message to a topic. Finally, the WS Client project contains the client that uses a web service to count objects that have not yet been returned and belong to the “Electronics” category.

## How to try it?
This project is an enterprise application developed in JavaEE 8.
### Prerequisites
- **Java Development Kit (JDK) 8**
- **GlassFish Server**
- **Apache Derby**

### Run locally
1. Clone the repository:
   ```bash
   git clone https://github.com/salvatoregrimaldi03/Progetto-PD.git
   ```
2. Open the project in Apache Nebeans 27
3. Configure the Application Server (i.e., Services > Servers > Add Server -> Choose GlassFishServer
4. Add libraries in any project (Bean, EJB Client, JMS Client, WS Client), specifically:
   - Bean Project: javaee-api-8.0.jar
   - EJB Client Project: gf-client.jar, javaee-api-8.0.jar, derby.jar, derbyclient.jar
   - JMS Client Project: gf-client.jar, javaee-api-8.0.jar
   - WS Client Project: javaee-api-8.0.jar
5. Ready the GlassFish Server
6. Deploy the Bean Project and run any client file in any clients project  

## Build With
[JavaEE 8](https://www.oracle.com/java/technologies/java-ee-8.html) - Core language
