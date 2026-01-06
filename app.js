document.addEventListener("DOMContentLoaded", () => {
 const externalBtn = document.getElementById("externalBtn");
 const output = document.getElementById("output");
 externalBtn.addEventListener("click", () => {
 const msg = ["Welcome from EXTERNAL JS!", "External script working!", "Hi from
app.js!"];
 output.textContent = msg[Math.floor(Math.random() * msg.length)];
 });
});