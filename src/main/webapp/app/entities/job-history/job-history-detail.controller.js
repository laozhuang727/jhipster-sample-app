(function() {
    'use strict';

    angular
        .module('jhipsterSampleApplicationApp')
        .controller('JobHistoryDetailController', JobHistoryDetailController);

    JobHistoryDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'JobHistory', 'Department', 'Job', 'Employee'];

    function JobHistoryDetailController($scope, $rootScope, $stateParams, previousState, entity, JobHistory, Department, Job, Employee) {
        var vm = this;

        vm.jobHistory = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('jhipsterSampleApplicationApp:jobHistoryUpdate', function(event, result) {
            vm.jobHistory = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
