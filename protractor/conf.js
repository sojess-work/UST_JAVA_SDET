var HtmlScreenshotReporter = require('protractor-jasmine2-screenshot-reporter');

var reporter = new HtmlScreenshotReporter({
    des:'target/screenshots',
    filename:'my-report.html'
});


exports.config = 
{
framework: 'jasmine',
specs: ['./Specs/calculatortest.js'],
directConnect:true,
capabilities: {
    'browserName':'chrome'
},

jasminNodeOpts: {
    defaultTimeoutInterval: 3000
},
beforeLaunch: function () {
    return new Promise(function(resolve){
        reporter.beforeLaunch(resolve);
    });
},
onPrepare : function(){
    this.jasminNodeOpts.getEnv().addReporter(reporter);
},
afterLaunch: function(exitCode){
    return new Promise (function(resolve){
        reporter.afterLaunch(resolve.bind(this,exitCode));
    });
}
};
