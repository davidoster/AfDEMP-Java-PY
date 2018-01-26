<!DOCTYPE html>
<html>
<head>
<script>
function bgChange(bg) {
    document.body.style.background = bg;
}
</script>
</head>
<body>
<h2>Change background color</h2>
<p>Mouse over the squares!</p>
<table style="width:300px;height:100px">
  <tr>
    <td onmouseover="bgChange(this.style.backgroundColor)" 
        onmouseout="bgChange('transparent')"
        style="background-color:Khaki">
    </td>
    <td onmouseover="bgChange(this.style.backgroundColor)" 
        onmouseout="bgChange('transparent')"
        style="background-color:PaleGreen">
    </td>
    <td onmouseover="bgChange(this.style.backgroundColor)" 
        onmouseout="bgChange('transparent')"
        style="background-color:Silver">
    </td>
  </tr>
</table>
</body>
</html>