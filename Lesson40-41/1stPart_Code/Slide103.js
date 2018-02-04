<!DOCTYPE html>
<html>
<body>

<a name="html">HTML Tutorial</a><br>
<a name="css">CSS Tutorial</a><br>
<a name="xml">XML Tutorial</a><br>

<p>Click the button to display the innerHTML of the first anchor in the document.</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

<script>
function myFunction() {
    document.getElementById("demo").innerHTML =
    document.anchors[0].innerHTML;
}
</script>

</body>
</html>
