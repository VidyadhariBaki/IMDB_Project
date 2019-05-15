require('./models/db');

const express1 = require('express');
const path1=require('path');
const exphbs=require('express-handlebars');
const bodyparser=require('body-parser');

const employeeController = require('./controllers/employeeController');
var app=express1();

app.use(bodyparser.urlencoded(
    {
        extended:true
    }
));
app.use(bodyparser.json());
app.set('views',path1.join(__dirname, '/views/'));
app.engine('hbs',exphbs({extname:'hbs',defaultLayout:'mainLayout',layoutsDir :__dirname +'/views/layouts/'}));
app.set('view engine','hbs');
app.listen(3000, () =>
{
  console.log('express server started at port :3000');
});

app.use('/employee',employeeController);