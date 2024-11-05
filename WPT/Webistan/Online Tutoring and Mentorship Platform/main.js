
document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('form');
    form.addEventListener('submit', function(event) {
      const inputField = document.querySelector('#inputField');
      if (!inputField.value) {
        alert('Please fill in all required fields.');
        event.preventDefault();
      }
    });
  });
  