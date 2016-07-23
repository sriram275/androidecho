cordova.define("org.apache.cordova.plugin.Echo", function(require, exports, module) {

//var argscheck = require('cordova/argscheck'),
//    utils = require('cordova/utils'),
//    exec = require('cordova/exec'),
//    channel = require('cordova/channel');


var Echo = function() {
};

Echo.show = function(name,successCallback,errorCallback) {
    exec(successCallback, errorCallback, "Echo", "show", [name]);
};

/*
Keyboard.styleDark = function(dark) {
 exec(null, null, "Keyboard", "styleDark", [dark]);
};
*/

//channel.onCordovaReady.subscribe(function() {
//
//    function success(msg) {
//        var action = msg.charAt(0);
//        if ( action === 'S' ) {
//            var keyboardHeight = msg.substr(1);
//            cordova.plugins.Keyboard.isVisible = true;
//            cordova.fireWindowEvent('native.keyboardshow', { 'keyboardHeight': + keyboardHeight });
//
//            //deprecated
//            cordova.fireWindowEvent('native.showkeyboard', { 'keyboardHeight': + keyboardHeight });
//        } else if ( action === 'H' ) {
//            cordova.plugins.Keyboard.isVisible = false;
//            cordova.fireWindowEvent('native.keyboardhide');
//
//            //deprecated
//            cordova.fireWindowEvent('native.hidekeyboard');
//        }
//    }
//});

module.exports = Keyboard;


});