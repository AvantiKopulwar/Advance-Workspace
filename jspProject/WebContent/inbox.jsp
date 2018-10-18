<%@page import="java.util.ArrayList"%>
<%
ArrayList<String> alemp= (ArrayList) request.getAttribute("data");
for(String emp:alemp){
out.println(emp);	
}

%>