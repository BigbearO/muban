<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%request.setCharacterEncoding("utf-8"); %>	
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="container-fluid"style=" background-image: url(static/images/123456789.png);height:800px ">
	     
		<div style="height:200px"></div>
		<div class="row">
		 
			<div class="col-md-4">
			
			</div>
			


			<div class="col-md-4">
			<form role="form"  action="login" method="post">

					<div class="form-group row">
						<div class="col-sm-10">
							<input type="text" class="form-control" id="inputName"
								placeholder="用户名" name="name"  value="${name }">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-sm-10">
							<input type="password" class="form-control" id="inputPass"
								placeholder="密码" name="pass">
						</div>
					</div>

					<div class="form-group row">
						<div class="col-sm-10">
							<button type="submit" class="btn btn-primary btn-block">登陆</button>
						</div>
					</div>
					<div>没有账号？去<a href="toRegister">注册</a></div>
					<div>已经注册，去<a href="toLogin">登录</a></div>
				</form>

			</div>
			</div>
			
			
		  
			<div class="col-md-4"></div>
				

			</div>
		</div>
	</div>
	
	
	<!-- 上面那个不行就用这个href="javascript:window.location.href='register.jsp'" -->
	
	
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/jquery/jquery-3.3.1.slim.min.js"></script>
	<script src="static/popper/popper.min.js"></script>
	<script src="static/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>