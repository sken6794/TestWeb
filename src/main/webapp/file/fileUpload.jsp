<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="uploadaction.upload" method="post" enctype="multipart/form-data">
		파일 : <input type="file" name="file"><br>
		<input type="text" name="text">
		<input type="submit" value="업로드"><br>
	</form>
	<br>
	<a href="filedownload.jsp">파일 보기</a>
</body>
</html>