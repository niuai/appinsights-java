const path = require('path')

module.exports = {
    entry: __dirname + "/app/main.js",  // 已多次提及的唯一入口文件
    output: {
        path: __dirname + "/public",    // 打包后的文件存放的地方
        filename: "bundle.js"   // 打包后输出文件的文件名
    },
    devServer: {
        contentBase: path.join(__dirname, "./public"),  // 网站的根目录为 /public，如果配置不对，会报 Cannot GET / 错误
        port: 8080
    }
}