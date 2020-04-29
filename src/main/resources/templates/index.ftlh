<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>All users</h1>

<ul>
    <#list users as user>
        <li>Fullname: ${user.fullName}; E-mail: ${user.email} </li>
    </#list>
</ul>
</body>
</html>