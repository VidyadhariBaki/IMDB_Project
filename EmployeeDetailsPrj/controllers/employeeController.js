const express1=require('express');
var router=express1.Router();
const mongoose1=require('mongoose');
const Employee =mongoose1.model('Employee');
router.get('/',(req,res) => 
{
    res.render("employee/add",{
        viewTitle: "Insert Employee"
    });
});
 router.post('/',(req,res) => 
 {
    console.log(req.body);
     if(req.body._id == '')
    
    insertRecord(req,res);
    else
    updateRecord(req,res);
    });

    function insertRecord(req,res)
    {
var employee = new Employee();
employee.id = req.body.id;
employee.name=req.body.name;
employee.email=req.body.email;
employee.mobileno=req.body.mobileno;

employee.save((err,doc) =>{
    if(!err)
    {
    res.redirect('employee/list');
    }
 else{
     console.log("error during record insertion:" + err);
 }
});
    

    function updateRecord(req,res)
    {
        Employee.findOneAndUpdate({_id: req.body._id},req.body,{new:true},(err,doc) =>
        {
            if(!err)
            {
                res.redirect('employee/list');
            }
            else{
                console.log('error during updated:'+err);
                }
            });
    }

    router.get('/list',(req,res) => 
    {
     
        Employee.find((err,docs) =>
        {
            if(!err)
            {
                res.render("employee/list",{
                    list:docs
                 });
             
            }
            else{
                console.log("error for retreving employee details"+err);
            }
        });
    });
}
    router.get('/:id',(req,res) =>
    {
        Employee.findById(req.params.id,(err,doc) =>
        {
            if(!err)
            {
                res.render("employee/add",{
                    viewTitle:"Update Employee",
                    employee:doc
                });
            }
        
        });
    });

    router.get('/delete/:id',(req,res) =>{
        Employee.findByIdAndRemove(req.params.id,(err,doc) => 
         {
            if(!err)
            {
                res.redirect('/employee/list');
            }
            else{
                console.log('error in employee delete'+err);
            }
        });
    });



module.exports =router;