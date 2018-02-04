<!DOCTYPE html>
<html>
<body>
<p>This example uses the addEventListener() method to add two click events to the same button.</p>
<button id="myBtn">Try it</button>
<script>
var x = document.getElementById("myBtn");
x.addEventListener("click", myFunction);
x.addEventListener("click", someOtherFunction);
function myFunction() {
    alert ("Hello World!");
}
function someOtherFunction() {
    alert ("This function was also executed!");
}
</script></body>
</html>
