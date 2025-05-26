Conditionals, Loops, and Error Handling
const events = [
  { name: "Music Fest", date: "2025-06-10", seats: 20 },
  { name: "Tech Talk", date: "2024-01-01", seats: 0 },
  { name: "Art Show", date: "2025-08-15", seats: 5 },
];

events.forEach(event => {
  const isUpcoming = new Date(event.date) > new Date();
  if (isUpcoming && event.seats > 0) {
    console.log(`Upcoming: ${event.name}`);
  }
});

function registerUser(event) {
  try {
    if (event.seats <= 0) throw new Error("No seats available!");
    event.seats--;
    console.log("Registered successfully!");
  } catch (err) {
    console.error(err.message);
  }
}
