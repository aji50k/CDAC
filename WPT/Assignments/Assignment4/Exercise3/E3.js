function fetchData(url, callback) {
    setTimeout(() => {
      const response = `Fetched data from ${url}`;
      callback(response);
    }, 2000); 
  }
  
  fetchData("https://api.unsplash.com/photos/random?count=1", (response) => {
    console.log(response);
  });
  
  