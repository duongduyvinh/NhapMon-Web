<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css?v=3" type="text/css"/>
</head>

<body>
<div class="container">
    <h1>Thanks for joining our email list</h1>

    <p>Here is the information that you entered:</p>

    <label>Email:</label>
    <span>${user.email}</span><br>
    
    <label>First Name:</label>
    <span>${user.firstName}</span><br>
    
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    
    <h1>Survey Answers:</h1>
    <label>Heard about us from:</label>
    <span>${user.foudation}</span><br>
    
    <label>Receive Announcements:</label><br>
    <span class="indent">- ${user.answer1}</span><br>
    <span class="indent">- ${user.answer2}</span><br>
    
    <label>Preferred Contact:</label>
    <span>${user.contact}</span><br>

    <p>To enter another email address, click on the Back
       button in your browser or the Return button shown
       below.</p>

    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</div>
</body>
</html>