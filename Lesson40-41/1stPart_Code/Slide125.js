<!DOCTYPE html>
<html>
<body>
<h2>The Navigator Object</h2>
<p> The appCodeName property returns the code name of the browser. </p>
<p> Do not rely on it! "Mozilla" is the application code name for both Chrome, Firefox, IE, Safari, and Opera.</p>
<p id="demo"></p>
<script>
document.getElementById("demo").innerHTML =  "navigator.appCodeName is " + navigator.appCodeName; </script>
</body>
</html> 