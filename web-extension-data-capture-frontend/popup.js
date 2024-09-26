document.getElementById("collectDataBtn").addEventListener("click", () => {
  chrome.tabs.query({ active: true, currentWindow: true }, (tabs) => {
    chrome.scripting.executeScript({
      target: { tabId: tabs[0].id },
      func: () => {
        let targetElement = document.querySelector(".sc-eZXHtX");
        if (targetElement) {
          let collectData = {
            url: window.location.href,
            title: document.title,
          };
          chrome.runtime.sendMessage(
            {
              type: "sendData",
              data: collectData
            },
            (response) => {
              console.log("Response from background: ", response);
            }
          );
        } else {
          console.warn("Element with this class not found on this page.");
        }
      }
    });
  });
});