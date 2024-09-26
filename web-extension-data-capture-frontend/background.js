chrome.runtime.onInstalled.addListener(function() {
    console.log("Extension installed.");
  });
  
  chrome.runtime.onMessage.addListener((request, sender, sendResponse) => {
    if (request.type === "sendData") {
      console.log("Data received from content script:", request.data);
      
      // Отправка данных на сервер
      fetch("http://localhost:8080/notification/sendData", {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify(request.data)
      })
        .then(response => response.json())
        .then(data => {
          console.log("Data sent successfully:", data);
          sendResponse({status: "success", response: data});
        })
        .catch(error => {
          console.log("Error sending data:", error);
          sendResponse({status: "error", response: error});
        });
        
      return true; // Keep the messaging channel open for sendResponse
    }
  });
   