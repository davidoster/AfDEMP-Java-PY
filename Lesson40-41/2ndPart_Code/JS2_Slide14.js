<!DOCTYPE html>
<html>
<head>
<script>
function show_coords(event) {
    document.getElementById("demo").innerHTML =
    "X= " + event.clientX + "<br>Y= " + event.clientY;
}
</script>
</head>

<body>

<p onmousedown="show_coords(event)">
Click this paragraph to display the x and y coordinates of the mouse pointer.</p>

<p id="demo"></p>

</body>
</html>

