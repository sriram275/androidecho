module.exports = {
    show: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "Hello", "show", [name]);
    }
};