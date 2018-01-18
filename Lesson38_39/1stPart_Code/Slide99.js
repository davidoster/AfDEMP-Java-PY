<!DOCTYPE html>
<html>
<body>
<h2>JavaScript HTML DOM!</h2>
<p>Hellow World!</p>
<p>Hellow Norway!</p>
<p id="demo"></p>
<script>
var myNodelist = document.querySelectorAll("p");
document.getElementById("demo").innerHTML =
"This document contains " + myNodelist.length + " paragraphs.";
</script>
</body>
</html>

