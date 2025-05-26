 Functions, Scope, Closures, Higher-Order Functions
function addEvent(name, date, category, seats) {
  return { name, date, category, seats };
}

function registerUser(event) {
  if (event.seats > 0) event.seats--;
}

function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}

// Closure to track total registrations per category
function categoryTracker() {
  const counts = {};
  return function (category) {
    counts[category] = (counts[category] || 0) + 1;
    return counts[category];
  };
}

const track = categoryTracker();
track("Music");
track("Music"); // -> 2