# Implementation of REST API clients using Fetch API

## Objective:
To understand how frontend applications communicate with backend servers, perform HTTp operations and handle responses

## What is an API client?
- An API client is a piece of code responsible for communicating witha backend API

- Instead of writing fetch() repeatedly throughout application we create reusable functions for:
    - GET: retrieve data
    - POST: create data
    - PUSH : replace data
    - PATCH: partially update data
    - DELETE: remove data

- Here we use JSON Placeholder as our testing backend


## REST API
- Representational State Transfer is an architecural style for designing APIs that allow different software systems to communicate over HTTP.

## Fetch API
- How do we send these HTTP requests from Javascript
- Fetch is a built-in Javascript browser API that allows us to make HTTP requests and recieve responses

## REST API client
- Suppose application has 50 different places where you need to communicate with backend
- Hence we create a reusable module called an API client.
## Architecture

1. Frontend Application calls app.js: Calls API functions
2. API client calls : api.js- GET,POST, PUT, PATCH, DELETE
3. Fetch API: http repquests and responses
4. backend server: Processes requests and returns data

## Important concepts:

1. fetch(): Sends HTTP requests
2. Promise: Represents an asynchronous operation
3. async/await: Makes asynchronous code readable
4. Headers: Carry metadata and authentication
5. Request body: data sent to the server
6. Response: Server's reply
7. response.ok: Checks HTTP success status
8. response.json: parses json response
9. try/catch: handles errors

## Key points
1. fetch() does not automatically throw errors for http status like 404 or 500. Check response.ok
2. fetch() is asynchronous and returns a promise
3. repsonse.json() is also asynchronous and returns a promise.

## Main engineering lesso
- Don't couple UI directly to HTTP communication
- Keep API communication in a seperate layer. This makes applications easier to maintain, test and scale