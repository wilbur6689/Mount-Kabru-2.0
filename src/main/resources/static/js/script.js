
var mountKabru = angular.module("mountKabru", ["ngRoute"]);

/**
 * The config file for all of the controllers.
 */
mountKabru.config(function($routeProvider) {
    $routeProvider

    .when("/", {
        templateUrl : "views/login.html",
        controller:'loginCtrl'
    })



});

