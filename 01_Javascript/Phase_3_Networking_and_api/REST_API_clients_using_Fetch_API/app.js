import {get, post} from "./api.js";

const output = document.getElementById("output");

// GET
window.fetchPosts = async function () {
    try {
        output.innerHTML = "Loading...";

        const posts = await get("/posts");

        output.innerHTML = `
            <h2>Posts</h2>
            ${posts.slice(0, 10).map(post => `
                <div>
                    <h3>${post.title}</h3>
                    <p>${post.body}</p>
                    <hr>
                </div>
            `).join("")}
        `;

    } catch (error) {
        output.textContent = error.message;
    }
};

// //POST: Create a post
window.createPost = async function () {
    try {
        const result = await post("/posts", {
            title: "My First API Post",
            body: "Testing POST request",
            userId: 1
        });

        output.textContent = JSON.stringify(
            result, null, 2
        );

    } catch (error) {
        output.textContent = error.message;
    }
};




/*
//PUT: Replace a post
async function updatePost(){
    const updated = await put ("/posts/1",{
        id:1,
        title:"Updated Title",
        body:"Updated content",
        userId: 1
    });
    
    console.log(updated);
}

//Patch: update specific fields
async function modifyPost(){
    const updated = await patch("/posts/1",{
        title:"Modified Title"
    });
    console.log(updated);
}

//DELETE: delete a post
async function deletePost(){
    const result = await remove("/posts/1");
    console.log("Deleted:",result);
}

fetchPosts();
createPost();
*/