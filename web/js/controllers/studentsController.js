/**
 * Created by Andrew on 16.05.2017.
 */
myApp.controller('studentsController', function ($scope) {
    $scope.students = getStudents();

    function getStudent(studentID){
        return [
            {
                name: "Andrew",
                year: "1",
                phone: "777"
            }
        ];
    }

    function getStudents(){
        return [
            {
                name: "Andrew",
                year: "5",
                phone: "777"
            },
            {
                name: "July",
                year: "3",
                phone: "333"
            },
            {
                name: "Roman",
                year: "3",
                phone: "222"
            },
            {
                name: "Sergiy",
                year: "4",
                phone: "111"
            },
        ];
    }
});