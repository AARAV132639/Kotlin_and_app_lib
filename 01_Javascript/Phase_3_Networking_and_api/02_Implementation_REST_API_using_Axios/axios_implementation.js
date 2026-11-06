//Using fetch API
async function getUsers(){
    const response = await fetch(
        "httpls://api.example.com/users"
    );

    if(!response.ok){
        throw new Error("Request failed");
    }

    const data = await response.json();
    console.log(data);
}

//Using axios
import axios from "axios";

async function getUsers(){
    try{
        const response = await axios.get(
            "httpls://api.example.com/users"
        );
        console.log(response.data);

    }catch(error){
        console.log(error);
    }
}

/*
 * axios.get() driectly performs GET request
 * response.data contains the parsed repsone body. hence no need to call .json()
 */