function processData(inputString, callback) {
    const result = callback(inputString);
    console.log(result);
  }
  
  function toUpperCase(str) {
    return str.toUpperCase();
  }
  
  processData("hello world", toUpperCase);  // "HELLO WORLD"
  