var mountKabru = angular.module("mountKabru");

/**
 * loginCtrl is connected to the login.html.
 * The login functions sends the player's username and password input to the java backend
 * using the $http /session/login then it takes the response and checks if it is not null.
 * If it is not null it changes the view to joinGame.html and stores the token and id from the response
 * else it alerts the user that they have inputted invalid information.
 */
mountKabru.controller('loginCtrl', function($scope, $http, $location){
    $scope.username = "";
    $scope.password = "";


    $scope.login = function(){

                    $location.path('/joinGame');

                    $location.path('/login');
    }

 });