<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="-1" />

	<link rel="stylesheet" href="main.css">


	<%
	response.addHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	response.addHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);
	%>

</head>

	<script type="text/javascript">
	
	function loadDB(){
    
    var XHR = new XMLHttpRequest();
    XHR.open("GET","readyForAjaxCall",true);
    
    XHR.onreadystatechange = function(){
        
        if(XHR.readyState == 4 ){
            if(XHR.status == 200){
            	
            	var myObj = JSON.parse(this.responseText);          
            	
				var table="";
            	
            	for(var i=0;i<myObj.length;i++)
            	{     
            		table += "<tr>" ;
            		 table += "<td>" + myObj[i].Name + "</td>" ;
            		 table += "<td>" + myObj[i].LastName + "</td>" ;
            		 table += "<td>" + myObj[i].Age + "</td>" ;
            		 table += "</tr>" ;
     	
            	}
            	
            	document.getElementById("tableData").innerHTML=table;
            	
            }
            else
                console.log('problem with request');   
        }   
    }

    XHR.send();
    
}
   </script>  

<title>Homepage</title>
<body>


	<form action="Add" method="post">
		<div class="left">
			<div class="information">
				<h2>Information</h2>
					<p><input type="text" placeholder="Name" name="Name" /></p>
					<p><input type="text" placeholder="LastName" name="LastName" /></p>
					<p><input type="text" placeholder="Age" name="Age" /></p>
					<p><input type="submit" value="Add" /></p>
					
			</div>
		</div>
	</form>

	
	<div class="right">
			<div class="data">
				<h2>Data</h2>
					<table class="tableCols">
					
						<tr>
						 <th>Name</th>
						 <th>LastName</th>
						 <th>Age</th>
						 </tr>
					
					</table>
					<table id="tableData">
					
					
					</table>
					<p><input type="submit" value="Liste" onclick="loadDB()" ></p>
			</div>
	</div>
	
		


</body>
</html>