
// JavaScript Asynchronous Programming

// Callbacks--> Promises --> Promise chaining

//=====//

// 1. CallBack

function getUserCallback(userId,callback){

    console.log("Fetching user...");

    setTimeout(()=>{
        const user = {
            id: userId,
            name: "Aarav"
        };

        callback(null,user);
    },1000);
}

//Using the callback
getUserCallback(101,(error,user)=>{
    if(error){
        console.error(error);
        return;
    }
    console.log("Callback result:",user);
});

// 2. Promise

function getUserPromise(userId){

    return new Promise((resolve, reject)=>{

        console.log("Fetching user with Promise...");

        setTimeout(()=>{
            const user = {
                id: userId,
                name: "Aarav",
            };
            resolve(user);
        },1000);
    });
}

//Consuming the promise
getUserPromise(101).then(user=>{
    console.log("Promise result:",user);
})
.catch(error=>{
    console.error("Promise error:", error);
});