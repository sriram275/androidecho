cordova.define("org.apache.cordova.plugin.Hello", function(require, exports, module) {

//var argscheck = require('cordova/argscheck'),
//    utils = require('cordova/utils'),
//    exec = require('cordova/exec'),
//    channel = require('cordova/channel');


var Hello = function() {
};

Hello.show = function(name,successCallback,errorCallback) {
    exec(successCallback, errorCallback, "Hello", "show", [name]);
};

module.exports = Hello;

});