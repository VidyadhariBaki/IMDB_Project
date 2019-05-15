const mongodb2 = require('mongoose');

var employeeSchema = new mongodb2.Schema({
    id:
    {
        type:String
    },
    name:
    {
        type:String
    },
    email :
    {
        type:String
    },
    mobileno:
    {
        type:String
    }

});
mongodb2.model('Employee' , employeeSchema);