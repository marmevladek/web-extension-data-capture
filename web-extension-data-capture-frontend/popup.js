document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('fetchButton').addEventListener('click', function() {
      chrome.runtime.sendMessage({ action: 'fetchData' }, function(response) {
        document.getElementById('dataDisplay').textContent = response.data.message;
      });
    });
  });
  