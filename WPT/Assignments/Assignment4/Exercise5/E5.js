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
  
  function processData(data, callback) {
    const processedData = `${data} - Processed`;
    callback(processedData);
  }
  
  fetchData("https://catfact.ninja/fact", (error, response) => {
    if (error) {
      console.error(error);
    } else {
      processData(response, (processedData) => {
        console.log(processedData);
      });
    }
  });
  
  