# JavaScript 集成 Azure（中国） App Insights

> 如果还没有创建 appinsights 资源，请先创建: [创建 Azure App Insights 资源](../spring-boot/setup.md#创建-azure-app-insights-资源)<br />
> 参考文档：https://docs.microsoft.com/en-us/azure/azure-monitor/app/javascript

1. 创建空的 web（webpack） 项目，并添加基础依赖和用于集成 appinsights 的 `@microsoft/applicationinsights-web` 依赖：

```bash
npm install webpack-dev-server webpack-cli -D
npm install webpack --save
npm install @microsoft/applicationinsights-web --save
```

2. 添加主页 `index.html` 以及 `main.js`，并在主页中引用 `main.js` 通过 webpack 打包后的 `bundle.js` 文件。

```html
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Webpack Sample Project</title>
    <div id="myDiv"></div>
</head>

<body>
    <div id='root'>
    </div>

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
    <script src="bundle.js"></script>
</body>

</html>
```

3. 在 `main.js` 中初始化 appinsights 配置（该配置最好放在脚本最开始的地方执行，方便追踪整个脚本的运行情况）。

```javascript
import { ApplicationInsights } from '@microsoft/applicationinsights-web'

const appInsights = new ApplicationInsights({
  config: {
    instrumentationKey: '84312bff-xxxx-xxxx-xxxx-31a57071fd0b',
    endpointUrl: 'https://dc.applicationinsights.azure.cn/v2/track'
  }
});

appInsights.loadAppInsights();
```

4. 在 `main.js` 中发起简单的 ajax 请求。

```javascript
var htmlobj = $.ajax({ url: "./ajax.txt", async: false });
$("#myDiv").html(htmlobj.responseText);
```

5. 利用 `webpack-dev-server` 启动项目（本项目端口为：8080），多次刷新页面产生日志。

6. 导航到 Azure App Insights 的 portal 界面查看日志信息。