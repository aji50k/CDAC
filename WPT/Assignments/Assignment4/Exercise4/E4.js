function fetchData(url, callback) {
    setTimeout(() => {
      const error = Math.random() > 0.7; 
      if (error) {
        callback("Error: Network request failed.");
      } else {
        const response = `Fetched data from ${url}`;
        callback(null, response);
      }
    }, 2000);
  }
  
  fetchData(" https://api.openweathermap.org/data/2.5/weather?q=London", (error, response) => {
    if (error) {
      console.error(error);
    } else {
      console.log(response);
    }
  });
  
  