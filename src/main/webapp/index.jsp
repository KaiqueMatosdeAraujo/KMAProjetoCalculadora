<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>

<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">  
</head>
<body style="background-color:black;">
  <div class="container  col-6" style="margin-top: 100px; color: white;background-color: #14206b;
    font-weight: bold;"> 
    <h2 style="
    margin-left: 226px;"> Calculadora</h2>
  
  <div class="row">
  
  
  <form name="calculadora" action="CalculadoraServlet" method="post" style="
    margin-top: 13px;
" >
         
        <h4 style="text-align: center;font-size: 16px;">     No campo abaixo digite o 1º valor a ser calculado.</h4>
        <div class="mb-3 row ">
        <label for="exampleInputNumber1" class="form-label col-2">1º Valor: </label>
         <input type="text" class = "col-9" id="exampleInputNumber1" name="valorConta1" >
         
        </div>
                
     
       
        
        
        <div class="mb-3 row "style="margin-top:10px;">
        <h4 style="text-align: center;font-size: 16px;">  No campo abaixo digite o 2º valor a ser calculado.</h4>
       <label for="exampleInputNumber2" class="form-label col-2">2º Valor: </label>
          <input type="text"  class = "col-9"   id="exampleInputNumber2"  name="valorConta2">
         
       </div>
      
         
         
         
         
  
<div class="row" style="
    justify-content: space-evenly;margin-bottom:10px;">
         <button type="reset" class="btn btn-secondary col-2"  style="font-weight: bold;" >Apagar</button>
         <button type="submit" class="btn btn-secondary col-2" style="font-weight: bold;">Calcular</button>
         </div>
  </form>
  
    <div class="container bg-dark" style="color: White;font-size: 125%;
    text-align: center;"> O resultado é = ${requestScope.resultadoconta}</div>
      
   </div>
  </div>
</body>
</html>