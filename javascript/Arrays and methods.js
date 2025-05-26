Arrays and Methods

const eventList = [];

eventList.push(new Event("Yoga Session", "2025-05-30", "Wellness", 15));

const musicEvents = eventList.filter(e => e.category === "Music");

const cards = eventList.map(e => `Event: ${e.name} on ${e.date}`);
console.log(cards);