<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="jp.co.topgate.jan.web.User"%>
<%
	// セッションスコープからユーザー情報を取得
	User loginUser = (User) session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>つぶやき</title>
</head>
</head>
<body>
	<h1>つぶやきぶログイン</h1>
	<%
		if (loginUser != null) {
	%>
	<p>ログインに成功しました</p>
	<p>
		ようこそ<%=loginUser.getName()%>さん
	</p>
	<a href="/tsubuYaki/Main">つぶやき投稿・閲覧へ</a>
	<%
		} else {
	%>
	<p>ログインに失敗しました</p>
	<a href="/tsubuYaki/">TOPへ</a>
	<%
		}
	%>
</body>
</html>