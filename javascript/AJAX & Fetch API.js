AJAX & Fetch API
function submitRegistration(user) {
  setTimeout(() => {
    fetch("https://mockapi.io/register", {
      method: "POST",
      body: JSON.stringify(user),
      headers: { "Content-Type": "application/json" },
    })
      .then(res => res.json())
      .then(data => alert("Registration Successful!"))
      .catch(err => alert("Registration Failed"));
  }, 2000);
}