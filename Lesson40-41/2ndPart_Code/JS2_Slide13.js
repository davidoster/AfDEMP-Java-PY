<!DOCTYPE html>
<html>
<head>
<script>
function myFunction() {
    var w = window.outerWidth;
    var h = window.outerHeight;
    var txt = "Window size: width=" + w + ", height=" + h;
    document.getElementById("demo").innerHTML = txt;
}
</script>
</head>
<body onresize="myFunction()">
<p>Try to resize the browser window.</p>
<p id="demo"> </p>
<p>Note: this example will not work properly in IE8 and earlier. IE8 and earlier do not support the outerWidth/outerHeight propery of the window object.</p>
</body>
</html> 
