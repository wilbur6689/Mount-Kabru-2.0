var mountKabru = angular.module("mountKabru");

mountKabru.service("errorService", function()
{
    var service = {};

    service.handleError = function(response)
    {
        var message = "";
        var data;
        if(response.data)
        {
            data = response.data;
            if (data.message)
            {
                message = message + data.message + "\n";
            }
            if (data.stackTrace)
            {
                data.stackTrace.forEach(function (t) {
                    message = message + "\tat " +
                        t.declaringClass + '.' + t.methodName +'(' + t.fileName + ':' + t.lineNumber + ')\n'
                ;  })
            }
        }
        else
        {
            console.log('help')
            message = response;
        }

        console.log(message)
        //window.alert(message)
    }

    return service;
});