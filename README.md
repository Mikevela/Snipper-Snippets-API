User Stories
1. As a user, I can add a snippet to the data store, so that I can look it up again when I need it.
2. As a user, I can request a snippet by its ID, so that I can see the snippet again.

Functional Requirements
1. Users can make POST request to /snippet to create a new snippet.
2. Users can make a GET request to /snippets to get all the snippets currently in the data store.
3. Users can make a GET request to e.g. /snippet/3 to retrieve the snippet with the ID of 3.
4. BONUS: Usres can make a GET request to e.g. /snippets?lang=python to retrieve all the Python snippets.