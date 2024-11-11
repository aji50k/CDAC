function forEachElement(array, callback) {
    for (let i = 0; i < array.length; i++) {
      callback(array[i], i);
    }
  }
  
  forEachElement([1, 2, 3, 4], (element, index) => {
    console.log(`Index ${index}: ${element * 2}`);
  });
  /* Op:
  Index 0: 2
  Index 1: 4
  Index 2: 6
  Index 3: 8
  */
  