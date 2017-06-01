<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>吉他销售系统</h1> 
 <form action="SearchGuitar" > 
 
 <label>builder</label> 
 <select name="builder" > 
 <option>GIBSON</option><option>OLSON</option> 
 </select> 
 <label>model</label> 
 <select name="model" > 
 <option>01</option><option>02</option><option>03</option> 
 </select> 
 <label>type</label> 
 <select name="type" > 
 <option>ACOUSTIC</option><option>ELECTRIC</option> 
 </select> 
 <label>backwood</label> 
 <select name="backwood" > 
 <option>ALDER</option><option>MAPLE</option> 
 </select> 
 <label>topwood</label> 
 <select name="topwood" > 
 <option>ALDER</option><option>MAPLE</option> 
 </select> 
 <label>numSrings</label> 
 <select name="numStrings" > 
 <option>1</option><option>2</option><option>3</option> 
 </select> 
 <br/> 
 <input type="submit"> 
 
 
 
 
 </form> 
</body>
</html>