<!DOCTYPE html>
<html>
<body>

<p id="demo">Click the button to replace this document with new content.</p>

<button onclick="myFunction()">Try it</button>

<script>
function myFunction() {
    document.open("text/html","replace");
    document.write("<h2>Learning about the HTML DOM is fun!</h2>");
    document.close();
}
</script>

</body>
</html>
