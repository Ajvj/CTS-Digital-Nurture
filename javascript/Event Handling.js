Event Handling
document.querySelector("#registerBtn").onclick = () => {
  registerUser(event1);
};

document.querySelector("#categoryFilter").onchange = (e) => {
  filterEventsByCategory(eventList, e.target.value);
};

document.querySelector("#searchInput").onkeydown = (e) => {
  if (e.key === "Enter") console.log("Searching:", e.target.value);
};