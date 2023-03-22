const express = require('express');
const app = express();
//app.use(express.static('/views/public/imagenes'));
app.use('/public', express.static(__dirname + '/public'));
app.set('view engine','ejs');

app.use(express.urlencoded({extended:false}));
app.use(express.json());

app.get('/',(req,res)=>{
    //req.body('app',{rows: 'pato'})
    res.send("fdfdfdf");
 });


 app.use('/', require('./router'));

app.listen(5000, ()=>{
    console.log('SERVER corriendo en http://localhost:5000');
});