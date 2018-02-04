<!DOCTYPE html>
<html>
<body>
<h1 id="id01">My First Page</h1>
<p id="id02"></p>
<script>
document.getElementById("id02").innerHTML = document.getElementById("id01").innerHTML;

//or

document.getElementById("id02").innerHTML = document.getElementById("id01").firstChild.nodeValue;

//or

document.getElementById("id02").innerHTML = document.getElementById("id01").childNodes[0].nodeValue;

</script> 
</body>
</html>