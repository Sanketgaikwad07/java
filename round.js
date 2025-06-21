<!DOCTYPE html>
<html>
<head>
  <title>API Fetch Example</title>
</head>
<body>
  <h1>Posts</h1>
  <ul id="postList"></ul>

  <script>
    // Replace this URL with any API endpoint you want to call
    const apiURL = 'https://jsonplaceholder.typicode.com/posts';

    fetch(apiURL)
      .then(response => {
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        return response.json();
      })
      .then(data => {
        const postList = document.getElementById('postList');
        data.slice(0, 5).forEach(post => {
          const li = document.createElement('li');
          li.textContent = `${post.title}`;
          postList.appendChild(li);
        });
      })
      .catch(error => {
        console.error('There was a problem with the fetch operation:', error);
      });
  </script>
</body>
</html>
