async function getAllTasks() {
  const res = await fetch("http://localhost:8081/api/tasks");
  const data = await res.json();
  console.log(data);
  alert(JSON.stringify(data));
}

async function createTask() {
  const title = document.getElementById("title").value;
  const description = document.getElementById("description").value;

  const res = await fetch("http://localhost:8081/api/tasks", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({
      title: title,
      description: description
    })
  });

  const data = await res.json();
  console.log(data);
  alert(JSON.stringify(data));
}

async function updateTask() {
  const id = document.getElementById("taskId").value;
  const title = document.getElementById("title").value;
  const description = document.getElementById("description").value;

  if (!id) {
    alert("Please enter a task ID to update.");
    return;
  }

  const res = await fetch(`http://localhost:8081/api/tasks/${id}`, {
    method: "PUT",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({
      title: title,
      description: description
    })
  });

  const data = await res.json();
  console.log(data);
  alert(JSON.stringify(data));
}

async function deleteTask() {
  const id = document.getElementById("taskId").value;

  if (!id) {
    alert("Please enter a task ID to delete.");
    return;
  }

  const res = await fetch(`http://localhost:8081/api/tasks/${id}`, {
    method: "DELETE"
  });

  console.log(res.status);
  alert("Delete status: " + res.status);
}