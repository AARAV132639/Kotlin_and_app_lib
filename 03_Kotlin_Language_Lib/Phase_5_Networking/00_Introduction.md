# Networking

- Networking enables an application to communicate with remote services by exchanging HTTP requests and responses.

- Kotlin uses libraries like Retrofit or Ktor along with coroutines to perfrom asynchronous network operations efficiently without blocking the main thread

## 1. Essence

- Networking = Sending data to a remote machine and recieving data back using standard protocols(mainly HTTP/HTTPs)

- The app sens a requet and server sends a respone.

- E.g. : Instagram : fetch posts
        Whatsapp : send messages
        UPI : Transfer money
        Weather app: fetch weather

- Without networking, an app is isolated and can only work with local data

### Networking flow:

- User clicks button
- App creates HTTP request
- Internet
- Server receives request
- Server processes it
- Database queried
- Server creates response
- Internet
- App recieves JSON
- Display UI

### Networking in Kotlin

- Button click
- Retrofit/ OkHttp
- Rest API
- JSON response
- Kotlin Data class
- Compose UI updates

## 2. Key Definitions

1. *Networking* : Networking is the process of exchanging data between applications over a network using communication protocols such as HTTP or HTTPS

2. *Client* : A client is an application that request services or data from a server

3. *Server* : A server is a computer or application that receives requests, processes them, and sends responses
            - Spring Boot backend
            - Node.js server
            - Django server

4. *API* : set of ruels that allows different software applications to communicate. Kinf of contract between client and server

5. *Rest API* : A rest api is an api that follows REST principles and communicates over HTTP using resources identified by URLs
- Usses HTTP method like GET, POST, PUT, DELETe

6. *Endpoint* : An endpoint is the specific URL where an API can be accessed.

7. *URL*: address of a resources on the internet

8. *HTTP* : protocol used to transfer data between client and a server

9. *HTTPS*:  HTTP secured using SSL/TLS encryption.
- Encryption
- Authentication
- Data Integrity

10. *Request* : A request is a message sent by the client asking the server to perform an operation
- URL
- Method
- Headers
- Body(optional)

11. *Response* : message returned by the server after processing a request.
- Status code
- Headers
- Body

12. *HTTP Methods* : 
                    1. Get : Retrieve data
                    2. POST : Create data
                    3. PUT : Replace existing data
                    4. PATCH: partially update data
                    5. Delete : remove data

13. *Status Code* :
                    1. 200 : OK
                    2. 201 : Created
                    3. 204 : No content
                    4. 400 : Bad request
                    5. 401 : Unauthorized
                    6. 403 : Forbidden
                    7. 404 : Not found
                    8. 500 : Internal Server Error

14. *Headers* : Headers are key-value pairs that provide metadata about a request or respone

15. *Body* : The body contains the actual data sent with a request or respone. Usually JSON

16. *JSON* : JavaScript Object Notation is a lightweight text format used for data exchange

17. *Serialization* : Converting a Kotlin Object into a transferable format such as JSON

18. *Deserialization* : Deserialization is converting JSON back into Kotlin objects

19. *Retrofit* : Retrofit is a type-safe HTTP client for Android that convers REST APIs into Kotlin interfaces

20. *OkHttp* : Low level HTTP client responsible for making network requests and managing connections

- Retrofit uses OkHttp internally by default

21. *Coroutine* : A coroutine is a lightweight concurrency mechanism used to perform asynchronous tasks without blocking the main thread.
- Networking is commonly done inside *suspend* functions

22. *suspend Function* : A suspend function can pause execution without blocking its thread, making it ideal for network operations

24. *Main Thread* : The main thread handles UI updates and user interactions

- Never perform network calls on the main thread or the UI may freeze

25. *Background Thread* : A background thread performs long-running tasks such as networking or file I/O without affecting the UI

26. *Authentication* : Authentication verifies the identity of a client before allowing access to protected resources
- API key
- JWT Token
- OAuth

27. *Exception Handling* : Network requests can fail because of :

- No internet connection
- Timeout
- Server unavailable
- Invalid response

- Always handles exceptions gracefully using *try-catch* or appropriate error- handling mechanisms.

---
---