<!DOCTYPE html>
<html>
<body>
<p>This example demonstrates how to pass parameter values when using the 
addEventListener() method.</p>
<p>Click the button to perform a calculation.</p>
<button id="myBtn">Try it</button>
<p id="demo"></p>
<script>
var p1 = 5;
var p2 = 7;
document.getElementById("myBtn").addEventListener("click", function() {
    myFunction(p1, p2);
});
function myFunction(a, b) {
    var result = a * b;
    document.getElementById("demo").innerHTML = result;
}
</script>
</body>
</html>

