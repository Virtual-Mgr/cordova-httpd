/* We are faking out CorHttpd since it is no longer required for VM Player on iOS */
var argscheck = require('cordova/argscheck'),
    exec = require('cordova/exec');

var corhttpd_exports = {};

corhttpd_exports.startServer = function(options, success, error) {
	success('');
};

corhttpd_exports.stopServer = function(success, error) {
	success();
};

corhttpd_exports.getURL = function(success, error) {
	success('');
};

corhttpd_exports.getLocalPath = function(success, error) {
	success('');
};

module.exports = corhttpd_exports;
