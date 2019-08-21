import { ApplicationInsights } from '@microsoft/applicationinsights-web'

const appInsights = new ApplicationInsights({
  config: {
    instrumentationKey: '84312bff-d599-c7a7-98c3-31a57071fd0b',
    endpointUrl: 'https://dc.applicationinsights.azure.cn/v2/track'
  }
});

appInsights.loadAppInsights();

const greeter = require('./greeter.js');
document.querySelector("#root").appendChild(greeter());

var htmlobj = $.ajax({ url: "./ajax.txt", async: false });
$("#myDiv").html(htmlobj.responseText);