
const mongodb1=require('mongoose');

mongodb1.connect('mongodb://localhost:27017/employeeDB' , { useNewUrlParser :true},
(err) => {
    if(!err)
    {
        console.log('mongoDB connection successed !')
    }
    else{
        console.log('Error in DB connection:'+err)
    }
});

require('./employee.model');














