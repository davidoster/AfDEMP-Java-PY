<!DOCTYPE html>
<html>
<body>
<p>This example uses the addEventListener() method to add many events on the same button.</p>
<button id="myBtn">Try it</button>
<p id="demo"></p>
<script>
var x = document.getElementById("myBtn");
x.addEventListener("mouseover", myFunction);
x.addEventListener("click", mySecondFunction);
x.addEventListener("mouseout", myThirdFunction);
function myFunction() {
    document.getElementById("demo").innerHTML += "Moused over!<br>";
}
function mySecondFunction() {
    document.getElementById("demo").innerHTML += "Clicked!<br>";
}
function myThirdFunction() {
    document.getElementById("demo").innerHTML += "Moused out!<br>";
}
</script>
</body>
</html>

