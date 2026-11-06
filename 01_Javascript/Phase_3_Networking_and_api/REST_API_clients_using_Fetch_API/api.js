const BASE_URL = "https://jsonplaceholder.typicode.com";

async function request(endpoint, options={}){
    try{
        const response = await fetch(`${BASE_URL}${endpoint}`,{
            headers:{
                "Content-Type":"application/json",
                ...options.headers 
            },
            ...options 
        });

        if(!response.ok){
            throw new Error(`HTTP Error: ${response.status}`);
        }

        //DELETE may return an empty response
        if(response.status==204){
            return null;
        }
        return await response.json();
    } catch(error){
        console.error("API Error:",error.message);
    }
}

//GET
export function get(url){
    return request(url);
}

//POST
export function post(url,data){
    return request(url,{
        method:"POST",
        body: JSON.stringify(data)
    });
}

//PUT
export function put(url, data){
    return request(url,{
        method:"PUT",
        body: JSON.stringify(data)
    });
}

//PATCH
export function patch(url,data){
    return request(url,{
        method:"PATCH",
        body:JSON.stringify(data)
    });
}

//DELETE
export function remove(url){
    return request(url,{
        method:"DELETE"
    });
}