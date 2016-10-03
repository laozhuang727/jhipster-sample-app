(function() {
    'use strict';

    angular
        .module('jhipsterSampleApplicationApp')
        .controller('LocationController', LocationController);

    LocationController.$inject = ['$scope', '$state', 'Location'];

    function LocationController ($scope, $state, Location) {
        var vm = this;
        
        vm.locations = [];

        loadAll();

        function loadAll() {
            Location.query(function(result) {
                vm.locations = result;
            });
        }
    }
})();
