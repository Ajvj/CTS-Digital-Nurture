DOM Manipulation
const container = document.querySelector("#eventsContainer");

eventList.forEach(e => {
  const card = document.createElement("div");
  card.innerText = `${e.name} - ${e.date}`;
  container.appendChild(card);
});