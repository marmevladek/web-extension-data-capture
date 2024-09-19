chrome.runtime.onInstalled.addListener(function() {
    console.log("Extension installed.");
  });
  
  chrome.runtime.onMessage.addListener(function(request, sender, sendResponse) {
    if (request.action === 'fetchData') {
      fetch('http://localhost:8080/telegrambot/message')
        .then(response => response.json())
        .then(data => sendResponse({ data: data }))
        .catch(error => console.error('Error:', error));
      return true; // Важно для асинхронного отправления ответа
    }
  });
  