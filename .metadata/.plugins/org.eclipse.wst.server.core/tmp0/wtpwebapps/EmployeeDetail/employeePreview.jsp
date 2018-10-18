User Login: &nbsp;<%String UserName = (String) session.getAttribute("uname.");
			out.println(UserName);%>
User Password:&nbsp;<%String Password = (String) session.getAttribute("password.");
			out.println(Password);%>
Education:&nbsp;<%String edu = (String) session.getAttribute("education.");
			out.println(edu);%>