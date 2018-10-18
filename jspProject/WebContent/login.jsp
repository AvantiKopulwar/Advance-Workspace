<%
String meg= (String)request.getAttribute("meg");
if(meg!=null){%>
<font color="red">
<%
out.println(meg);
%></font>
<%
}
%>
<form action ="login">
User name:<input type="text" name="uname"> </br>
Password:<input type="password" name="password">
<input type="submit" value="sign">
</form>