<!DOCTYPE html>
<html>
<body>
<h2>The Navigator Object</h2>
<p> The appName property returns the application name of the browser: </p>
<p id="demo"></p>
<p> Strange enough, "Netscape" is the application name for both IE11, Chrome, Firefox, and Safari. </p>
 <script>
document.getElementById("demo").innerHTML =  "navigator.appName is " + navigator.appName; </script>
</body>
</html> 