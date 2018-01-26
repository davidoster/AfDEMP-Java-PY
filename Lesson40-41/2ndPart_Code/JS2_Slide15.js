<!DOCTYPE html>
<html>
<head>
<script>
function isKeyPressed(event) {
    var text = "The shift key was NOT pressed!";
    if (event.shiftKey == 1) {
        text = "The shift key was pressed!";
    }
    document.getElementById("demo").innerHTML = text;
}
</script>
</head>
<body onmousedown="isKeyPressed(event)">
<p>Click on this paragraph. An alert box will tell you if you pressed the shift key or not.</p>
<p id="demo"></p>

</body>
</html>