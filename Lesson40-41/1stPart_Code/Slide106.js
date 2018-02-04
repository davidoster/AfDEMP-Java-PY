<!DOCTYPE html>
<html>
<body>

<p id="demo">Click the button to display the cookies associated with this document.</p>

<button onclick="myFunction()">Try it</button>

<script>
function myFunction() {
    document.getElementById("demo").innerHTML =
    "Cookies associated with this document: " + document.cookie;
}
</script>

</body>
</html>
