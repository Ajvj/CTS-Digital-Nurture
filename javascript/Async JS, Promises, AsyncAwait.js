Async JS, Promises, Async/Await
Using Promises:

fetch("https://mockapi.io/events")
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error("Failed to load", err));
Using Async/Await:

async function loadEvents() {
  document.getElementById("loader").style.display = "block";
  try {
    const res = await fetch("https://mockapi.io/events");
    const data = await res.json();
    console.log(data);
  } catch (err) {
    console.error(err);
  } finally {
    document.getElementById("loader").style.display = "none";
  }
}