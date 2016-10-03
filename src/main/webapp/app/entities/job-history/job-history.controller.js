(function() {
    'use strict';

    angular
        .module('jhipsterSampleApplicationApp')
        .controller('JobHistoryController', JobHistoryController);

    JobHistoryController.$inject = ['$scope', '$state', 'JobHistory'];

    function JobHistoryController ($scope, $state, JobHistory) {
        var vm = this;
        
        vm.jobHistories = [];

        loadAll();

        function loadAll() {
            JobHistory.query(function(result) {
                vm.jobHistories = result;
            });
        }
    }
})();
