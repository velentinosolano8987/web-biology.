/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
const options = {
method: "GET" ,
headers: {
key:"http://127.0.0.1:5500/",
key:"http://127.0.0.1:5500/app/.vscode/index.html",
    }
};



fetch("http://127.0.0.1:5500/" , options)
fetch("http://127.0.0.1:5500/app/.vscode/index.html")

.then(res = console.json(res))

.then(res = res .text)
.then(respone = {
    console.log("response")

})
 
connect.Api("http://127.0.0.1:5500/app/.vscode/index.html");

document.getElementById("loginForm").addEventListener("submit", function(event ){
    event.preventDefault();
    
    const email = document.getElementById("email").value;
    
    if(validateGmail(email)){
    document.getElementById("message").innerHTML = "Valid Gmail!";
    sendEmailToServer(email);
    }else{
    document.getElementById("message").innerHTML = "Invalid Gmail.Please use Gmail address.";
    }
    });
    
    function validateGmail(email){
    const gmailRegex = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;
    return gmailRegex.text(email);
    }
    function sendEmailToServer(email){
    fetch("/save-email", {
    method:"POST",
    headers:{
        "Content-Type": "application/json",
    },
    body: JSON.stringify({email:"email"}),
    })
    .then((response) => response.JSON())
    .then((data)=>{
    console.log(data.message);
    })
    .catch((error) =>{
    console.error("Error:". error)
    });
    
    }
    