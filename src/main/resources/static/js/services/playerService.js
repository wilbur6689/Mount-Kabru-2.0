var mountKabru = angular.module("mountKabru");

mountKabru.service("playerService", function($http,errorService)
{
    var service = {};

    service.login = function(username, password, callback)
                {

                   //console.log("in the login session service: "+username+ " "+password)
                    $http({ method: 'POST', url:'./services/session/login', data: {'username': username, 'password': password} }).then(function (response)
                    {
                        loggedin = response.data.success;
                        callback(loggedin);
                    },errorService.handleError)

                }

    service.getPlayer = function(user, callback)
            {
                console.log("Entering getUser");
                    $http({ method:'GET', url:'./services/user/' + id, data: {'id': user.id} }).then(function (response)
                    {
                        console.log("id: " + id);
                        console.log("user: " + user);
                        user = response.data.user;
                        console.log("user: " + user);
                        callback(user);
                    },errorService.handleError);
            }